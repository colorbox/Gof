#import <stdio.h>
#import <objc/Object.h>


@interface Iterator : Object{
  ArrayList *_array;
  unsigned int _index;
}

-(id)initWithArray:(ArrayList *)array;
-(void)first;
-(void)next;
-(BOOL)isDone;
-(id)currentItem;

@end

@implementation Iterator

//初期化のためのメソッド
-(id)initWithArray:(NSArray*)array{
  self = [super init];
  if(!self){
    return nil;
  }

  _array = array;
  _index=0;

  return self;
}

//走査位置の初期化
-(void)first{
  _index=0;
}

//走査位置を進める
-(void)next{
  _index++;
}

//走査の完了判定
-(BOOL)isDone{
  return _index >= [array count];
}

//走査完了でなければそこにある物を返す
-(id)currentItem{
  if([self isDone]){
    return nil;
  }
  return [_array ibjectAtIndex:_index];
}

@end

int main(){
  NSArray array;
  array = [NSArray arrayWithObjects:@"Happy",@"Sunny",@"Peace",@"March",@"Beauty",nil];

  Iterator* iterator;
  iterator = [[Iterator alloc]initWithArray:array];

  while(![iterator isDone]){
    id item;
    item = [iterator currentItem];
    NSLog(@"%@",item);

    [iterator next];
  }
}
