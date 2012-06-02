//
//  Book.h
//  Iterator
//
//  Created by 健太郎 眞嶋 on 12/06/01.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Book : NSObject{
    NSString *name;
}
@property(nonatomic)NSString* name;

-(id)init;
-(void)dealloc;
-(NSString *)getName;
@end
