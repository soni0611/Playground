#include<stdio.h>
int main()
{
  float a,b,d,e,f,c;
  scanf("%f%f",&a,&b);
  scanf("%f",&c);
  d=a+b;
  printf("%.2f\n",d);
  e=(float)d*c/100;
  f=d-e;
  printf("%.2f\n",f);
  printf("%.2f",e);
  
  //fill your code
}