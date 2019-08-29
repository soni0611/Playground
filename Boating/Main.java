#include<stdio.h>
int main()
{
  int w,a,c,d;
  scanf("%d%d%d",&w,&a,&c);
  a=a*75;
  c=c*30;
  d=a+c;
  if(w>=d)
    printf("Boat is stable");
  else
    printf("Boat will drow");
  //fill your code
}