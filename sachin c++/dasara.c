#include<stdio.h>
#include<stdlib.h>

void main()
{
    int date, mnt, yr;

    // Input year, month, and date
    printf("Enter the year: ");
    scanf("%d", &yr);

    printf("Enter the month: ");
    scanf("%d", &mnt);

    printf("Enter the date: ");
    scanf("%d", &date);

    // Check if the entered year is 2024
    if (yr == 2024)
    {
        // Check if the entered month is October
        if (mnt == 10)
        {
            // Check if the date is Dasara (12th October)
            if (date == 12)
            {
                printf("HAPPY DASARA.\n");
            }
            else if (date > 12)
            {
                printf("BELATED HAPPY DASARA.\n");
            }
            else
            {
                printf("Dasara has not arrived yet!\n");
            }
        }
        else
        {
            printf("Dasara is celebrated in October.\n");
        }
    }
    else
    {
        printf("The year is not 2024.\n");
    }

    getche();
}
