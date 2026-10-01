#include <iostream>
using namespace std;

int main()
{
    char button;
    cout << "enter the character";
    cin >> button;
    switch (button)
    {
    case 'a':
        cout << "hello" << endl;
        break;
    case 'b':
        cout << "namste" << endl;
        break;
    case 'c':
        cout << "good" << endl;
        break;
    default:
        cout << "no any comment avilable";
        break;
    }
    return 0;
}