#include<stdio.h>
int main()
{
  int n;
 
    int a=7;
  scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        // int a=7;
      if(i==0)
        printf("7 ");
       if(i%2==0){
            a=a-2;
        printf("%d ",a);
        }
         else{
            a=a+3;
        printf("%d ",a);
         }
        
    }

    return 0;
}
   



  //fill your code
