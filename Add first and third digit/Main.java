#include<stdio.h>
int main()
{
  int num,n,m,x;
  scanf("%d",&num);
  n=num%10;
  m=num/100;
  x=n+m;
  printf("%d",x);
  return 0;
}