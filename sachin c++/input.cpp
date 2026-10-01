// #include<iostream>
// using namespace std;
// int main(){
//      cout<<"enter the first number number";
//     int amount1;
//     cin>>amount1;
//     cout<<"enter the second number";

//     int amount2;
//     cin>>amount2;
//     int mul=amount1*amount2;
//     cout<<mul<<endl;
//     return 0;
// }

#include <stdio.h>
#include <conio.h>
#include <string.h>

int main()
{
    char str1[10], str2[10];

    printf("type first string: ");
    scanf("%s", str1);

    // Fixed: Copies str1 (source) into str2 (destination)
    strcpy(str2, str1);

    printf("second string is %s", str2);

    getch();
    return 0;
}
