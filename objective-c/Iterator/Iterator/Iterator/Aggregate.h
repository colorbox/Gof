//
//  Aggregate.h
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/01.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

@class Iterator;

@protocol Aggregate <NSObject>
-(Iterator *)iterator;
@end
