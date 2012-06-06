//
//  Iterator.h
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/06.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Iterator : NSObject{
    NSArray *_array;
    unsigned int _index;
}

-(id)initWithArray:(NSArray*)array;
-(void)first;
-(void)next;
-(BOOL)isDone;
-(id)currentItem;

@end
