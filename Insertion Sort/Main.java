#include<stdio.h>
int main()
{
  int i,j,n,temp;
  int a[100];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
     scanf("%d",&a[i]);
  }
    for (i = 1 ; i <= n - 1; i++)
    {
	    j = i;
            while ( j > 0 && a[j-1] > a[j])
            {	        
                temp     = a[j];
                a[j]   =  a[j-1];
                a[j-1] = temp;
                j--;
            }
    }
    for (i = 0; i <= n - 1; i++)
        {
	    printf("%d\n", a[i]);
        }
    return 0;
}