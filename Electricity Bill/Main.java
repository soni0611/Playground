#include<stdio.h>
int main()
{int a,b;
 scanf("%d",&a);
 if(a<=200)
   b=a*0.5;
 else if(a>200 && a<=400)
   b=(a*0.65)+101;
 else if(a>400 && a<=600)
   b=(a*0.80)+200;
 else if(a>600)
    b=(a*1.25)+425;
 printf("Rs.%d",b);
   
  //fill your code
}