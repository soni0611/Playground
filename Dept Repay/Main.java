#include<stdio.h>
int main()
{
  int p,r,t;
  float a,b,c,d;
  scanf("%d\n%d\n%d",&p,&r,&t);
  a=(p*r*t)/100;
  b=a+p;
  c=(a*2)/100;
  d=b-c;
  printf("%0.2f\n%0.2f\n%0.2f\n%0.2f",a,b,c,d);
  
  //fill your code
}