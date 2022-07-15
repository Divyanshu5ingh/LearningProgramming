#include <stdio.h>

int main(void) {
    int t, x, y, sol;
    scanf("%d", &t);
    for(int i=0; i<t; i++)
    {
        scanf("%d%d", &x, &y);
        sol = abs(x-y);
        printf("%d\n", sol);
        
    }
	// your code goes here
	return 0;
}

