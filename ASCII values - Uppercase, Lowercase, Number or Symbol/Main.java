#include<stdio.h>
int main(){
   char ch;
 scanf("%c", &ch);
 if (ch >= 'A' && ch <= 'Z')
      printf("Upper");
   else if(ch >= 'a' && ch <= 'z')
      printf("Lower");
  else if(ch>=0 && ch<=9 )
    printf("Number");
  else
    printf("Symbol");
  //Fill your code
}