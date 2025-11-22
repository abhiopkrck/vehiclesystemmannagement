#include <iostream>
using namespace std;
int main(){
    int choice;
    int a,b,c;
    do
    {
        cout<<"\n1.Addition\n";
        cout<<"2.Subtraction\n";
        cout<<"3.Multiplication\n";
        cout<<"4.Division\n";
        cout<<"5.Exit\n";
        cout<<"Enter your choice\n:";
        cin>>choice;
        if (choice >=1 && choice <=5)
        {
            cout<<"Enter first number :";
            cin>>a;
            cout<<"Enter second number: ";
            cin>>b;
        }else{
            a=b=0;
        }
        switch (choice)
        {
        case 1:
           c=a+b;
           cout<<"Addition is:"<<c;
            break;
        case 2:
           c=a-b;
           cout<<"Subtraction is:"<<c;
            break;
        case 3:
           c=a*b;
           cout<<"Multiplication is:"<<c;
            break;
        case 4:
           c=a/b;
           cout<<"Division is:"<<c;
            break;
        case 5:
            break;
        
        default:
            break;
        }
        
    } while (choice !=0);
    return 0;
}