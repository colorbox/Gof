//
//  BookShelfIterator.m
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/03.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import "BookShelfIterator.h"

@implementation BookShelfIterator

-(id)init:(BookShelf *)bookShelf{
    bookshelf=[[BookShelf alloc]init];
    index=0;
}

-(BOOL)hasNext{
    if(index < [bookshelf getLength]){
        return YES;
    }else{
        return NO;
    }
}

-(id)next{
    Book *book = [bookshelf getBookAt:index];
    index++;
    return book;
}

@end
