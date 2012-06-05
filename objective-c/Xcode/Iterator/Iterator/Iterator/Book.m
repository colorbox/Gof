//
//  Book.m
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/01.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import "Book.h"

@implementation Book
@synthesize name = name;
-(id)init{
    if(self == [super init]){
        name=@"";
    }
    return self;
}
-(void)dealloc{
//    [super dealloc];
//    [name release];
}
-(NSString *)getName{
    return name;
}

@end
