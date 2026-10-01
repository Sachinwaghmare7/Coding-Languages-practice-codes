// this is the square pattern

// #include<iostream>
// using namespace std;

// int main(){
//     int n = 4;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//           cout<<"* ";

//            }
    
//         }
// }


 
// #include<iostream> // this is the rotate trangle pattern
// using namespace std;
// int main(){
//     int n=4;
//     for(int i=0;i<n;i++){
//         for(int j=i;j<n;j++){
//             cout<<"* ";
//         }
//         cout<<endl;
//     }
// }


// #include<iostream> // this is the trangle pattern
// using namespace std;
// int main(){
//     int n = 4;
//     for(int i = 0 ; i  < n; i++){
//         for(int j = 0 ; j<i+1 ; j++){
//             cout<<"* ";

//         }
//         cout<<endl;
//     }
// }



//this number square pattern 
// #include<iostream>
// using namespace std;
// int main(){
//     int n = 4;
//     int m = 3;
//     int num= 1;
//     for(int i=0 ; i<n;i++){
//         for(int j=0;j<m;j++){
//             cout<<num<<" ";
//             num++;

//         }
//         cout<<endl;

//     }
// }


// this is the ABCD square pattern 

// #include<iostream>
// using namespace std;
// int main(){
//     int n=4;
//     for(int i = 0;i<n;i++){
//         char ch = 'A';
//         for(int j=0;j<n;j++){
//             cout<<ch<<" ";
//             ch++;

//         }
//         cout<<endl;
//     }
// }


// this is the return numbers


//paramid print pattern 

#include<iostream>
using namespace std;
int main(){
    int n = 5;
    for(int i = 0;i<n; i++){
        for(int j=0;j<n-i-1;j++){
            cout<<"*";

        }
        cout<<endl;
    }
    int m = 5;
    for(int i = 0;i<m; i++){
        for(int j=0;j<m-i-1;j++){
            cout<<" ";

        }
        for(int j=0;j<m;j++){
            cout<<"*";
        }
        cout<<endl;
    }

}
