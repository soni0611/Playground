#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  b=a*a;
  c=b%10;
  if(a==c)
    printf("Automorphic Number");
  else 
    printf("Not Automorphic Number");
  //fill your code
}