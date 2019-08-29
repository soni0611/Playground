#include<stdio.h>
int main()
{char str[5];
 int a,b;
 float c;
  scanf("%s",&str);
 scanf("%d",&a);
 scanf("%f",&c);
  scanf("%d",&b);
  if(b==0 && c>=7.0)
    printf("%s\n%d\n \nEligible to attend placement",str,a);
 else
   printf("%s\n%d \nNot Eligible to attend placement",str,a);
  //fill your code
}