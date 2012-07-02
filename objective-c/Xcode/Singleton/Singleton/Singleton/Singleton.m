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
    if(!_instance){
        _instance = [[self alloc]init];
    }
    return _instance;
}

@end
