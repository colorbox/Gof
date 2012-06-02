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

@interface BookShelf : NSObject <Aggregate>{
    int last;
    NSArray *books;
}

@property(nonatomic)int last;

-(Book *)getBookAt:(int)index;
-(void)appendBook:(Book *)book;
-(int)getLength;

@end
