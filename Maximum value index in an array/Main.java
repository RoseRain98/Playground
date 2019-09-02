#include<stdio.h>
int main()
{
  int i, n;
  scanf("%d \n", &n);
  int a[n];
  for(i = 0; i <= n - 1; i++)
  {
    scanf("%d",&a[i]);
  }
  int max=0;
  for(i=0;i <= n - 1;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  
 } printf("%d", i-1);
  return 0;
}