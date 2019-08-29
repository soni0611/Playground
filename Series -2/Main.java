#include<stdio.h>
int main()
{
  int n, first = 1,second =1,next;
  scanf("%d", &n);
  printf("Enter n value\n");
  for (int i = 1; i <= n; i++)
  {
    if (i <= 1)
      next = i;
    else
    {
      next = first + second;
      first = second;
      second = next;
    }
    printf("%d ", next);
  }
 
  return 0;
}

