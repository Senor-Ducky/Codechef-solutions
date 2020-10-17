#include<stdio.h>
void main()
{
    int n;
    while(2)
    {
        scanf("%ld",&n);
        if(n!=42)
        {
            printf("\n%d",n);
        }
        else if(n==42)
        {
            break;
        }
    }
    return 0;
}