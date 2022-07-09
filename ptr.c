// addition using pointer

#include<stdio.h>

int point();

void main()
{
    int a, b, *p, *q;

    printf("Enter two number to add : \n");
    scanf("%d%d", &a, &b);

    p=&a;
    q=&b;


    printf("The sum of the number is: %d", point(*p, *q));
}

int point(int a, int b)
{
    int add;
    add= a+b;
    return add;
}
