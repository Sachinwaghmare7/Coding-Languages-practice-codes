#include <iostream>
using namespace std;
int main()
{
    int amount;
    cin >> amount;
    if (amount > 5000)
    {
        if (amount > 10000)
        {
            cout << "shoping";
        }
        else
            cout << "party";
    }
    else if (amount > 2000)
    {
        cout << " enjoy";
    }
    else
    {
        cout << "not enjoy";
    }
}