//
//  Singleton.m
//  Singleton
//
//  Created by 健太郎 眞嶋 on 12/07/02.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import "Singleton.h"

@implementation Singleton

static Singleton* _instance = nil;

/*
+(void)load{
    if(!_instance){
        _instance = [[Singleton alloc]init];
    }
}
*/

+(id)instance{
    static id _instance = nil;
    @synchronized(self){
        if(!_instance){
            _instance = [[self alloc]init];
        }
    }
    return _instance;
}

+(id)allocWithZone:(NSZone *)zone{
    @synchronized(self){
        if(!_instance){
            _instance = [super allocWithZone:zone];
            return _instance;
        }
    }
    return nil;
}

-(id)copyWithZone:(NSZone*)zone{
    return self;
}

/*
-(id)retain{
    return self;
}

-(unsigned)retainCount{
    return UINT_MAX;
}

-(void)release{}
-(id)autorelease{
    return self;
}
*/

@end
