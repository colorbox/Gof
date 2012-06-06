//
//  Iterator.m
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/06.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import "Iterator.h"

@implementation Iterator


-(id)initWithArray:(NSArray *)array{
    self=[super init];
    if(!self){
        return nil;
    }
    _array=array;
    _index=0;
    
    return self;
}

-(void)first{
    _index=0;
}

-(void)next{
    _index++;
}

-(BOOL)isDone{
    return _index >= [_array count];
}

-(id)currentItem{
    if([self isDone]){
        return nil;
    }
    
    return [_array objectAtIndex:_index];
}

@end
