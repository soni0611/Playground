#include<stdio.h>
int main()
{
  int n, first,last,add;
    scanf("%d", &n);
    first = n;
    while(first >= 10)
    {
        first = first / 10;
    }
  last=n;
  last=last%10;
  add=first+last;
  printf("%d",add);
  
}