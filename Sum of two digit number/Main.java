#include<stdio.h>
int main()
{
 int  num,n,m,x;
  scanf("%d",&num);
  n=num%10;
  m=num/10;
  x=n+m;
  printf("%d",x);
  return 0;
}