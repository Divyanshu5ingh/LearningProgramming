// Addition of two number using Function

#include<stdio.h>
int sum(int a, int b);

void main()
{
    int a,b,c;
    printf("Enter two number to add: \n");
    scanf("%d%d", &a, &b);

    printf("The sum of number is: %d", sum(a,b));

}

int sum(int a, int b)
{

    return (a+b);
}
