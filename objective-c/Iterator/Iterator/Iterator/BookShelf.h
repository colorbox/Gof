//
//  BookShelf.h
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/02.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Aggregate.h"
#import "Book.h"

@class Iterator;

@interface BookShelf : NSObject {
    int last;
    NSMutableArray *books;
    Iterator *iterate;
}

@property int last;

-(Book *)getBookAt:(int)index;
-(void)appendBook:(Book *)book;
-(int)getLength;

@end
