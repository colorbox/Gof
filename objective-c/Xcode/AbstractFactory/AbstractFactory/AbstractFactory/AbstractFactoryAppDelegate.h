//
//  AbstractFactoryAppDelegate.h
//  AbstractFactory
//
//  Created by 健太郎 眞嶋 on 12/07/03.
//  Copyright (c) 2012年 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

@class AbstractFactoryViewController;

@interface AbstractFactoryAppDelegate : UIResponder <UIApplicationDelegate>

@property (strong, nonatomic) UIWindow *window;

@property (strong, nonatomic) AbstractFactoryViewController *viewController;

@end
