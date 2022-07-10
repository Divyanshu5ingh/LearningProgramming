//clecking which number is greater by the user input

#include<stdio.h>

int max(int p, int q);

void main()
{
    int a, b;
    printf("Please enter two number: \n");
    scanf("%d%d", &a, &b);

    int m = max(a,b);
    printf("Max number between %d and %d is: %d", a, b, m);
}

int max(int p, int q)
{
    if (p>q)
    return p;
    else
    return q;
}