//
//  BookShelfIterator.h
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/03.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "BookShelf.h"
#import "Iterator.h"

@interface BookShelfIterator : NSObject<Iterator>{
    BookShelf *bookshelf;
    int index;
}

@property int index;

-(BOOL)hasNext;
-(NSObject *)next;

@end
