//
//  BookShelf.m
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/02.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import "BookShelf.h"

//check NSArray to implement appendBook!!
@implementation BookShelf

-(id)init{
    books = [NSMutableArray arrayWithObject:nil];
}

-(Book *)getBookAt:(int)index{
    return [books objectAtIndex:index];
}

-(void)appendBook:(Book *)book{
    [books addObject:book];
}


-(int)getLength{
    return [books count];
}




/*
-(Iterator *)iterator(){
    iterate = [[Iterator alloc ]init];
    return iterate;
}
*/
@end
