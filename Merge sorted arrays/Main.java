#include <stdio.h>
#define N 100  
int main()
{
    int arr1[N], arr2[N], mergeArray[N];
    int size1, size2, mergeSize;
    int index1, index2, mergeIndex;
    int i;
    scanf("%d %d", &size1,&size2);
    for(i=0; i<size1; i++)
    {
        scanf("%d", &arr1[i]);
    }
    for(i=0; i<size2; i++)
    {
        scanf("%d", &arr2[i]);
    }
    mergeSize = size1 + size2;
    index1=0;
    index2=0;
    for(mergeIndex=0; mergeIndex < mergeSize; mergeIndex++)
    {
        if(index1 >= size1 || index2 >= size2)
        {
            break;
        }
        if(arr1[index1] < arr2[index2])
        {
            mergeArray[mergeIndex] = arr1[index1];
            index1++;
        }
        else
        {
            mergeArray[mergeIndex] = arr2[index2];
            index2++;
        }
    }
    while(index1 < size1)
    {
        mergeArray[mergeIndex] = arr1[index1];
        mergeIndex++;
        index1++;
    }
    while(index2 < size2)
    {
        mergeArray[mergeIndex] = arr2[index2];
        mergeIndex++;
        index2++;
    }
    for(i=0; i<mergeSize; i++)
    {
        printf("%d ", mergeArray[i]);
    }

    return 0;
}
