#include<stdio.h>
#include<math.h>
int main()
{
  int t,v;
  float d,c,e;
  scanf("%d%d",&t,&v);
  c=35.74+(0.6215*t)+((0.4275*t)-35.75)*pow(v,0.16);
  

  printf("%.2f",c);
  
  
  //fill your code
}