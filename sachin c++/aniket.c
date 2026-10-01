#include <stdio.h>
#include <conio.h>

void main()
{
    int marks;

    printf("Enter your marks: ");

    scanf("%d", &marks);

    if (marks >= 35)
    {
        printf("You are pass\n");
    }
    else

    {
        printf("You are fail\n");
    }

    getch();
}
