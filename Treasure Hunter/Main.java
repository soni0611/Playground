#include<stdio.h>
int main()
{
  int a,b,c,d,e,f,g;
  scanf("%d%d%d",&a,&b,&c);
  d=(a*b)/100; //473
  e=(a-d)*(c)/100; //222
  f=(a-d);
  g=(f-e)/3;
  printf("%d\n%d\n%d",d,e,g);
  //fill your code
}