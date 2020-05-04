#include<iostream>
using namespace std;
int main()
{
  
  int num1,num2,ch;
  cin>>num1>>num2>>ch;
  switch (ch)
  {
   
    case 1: 
      
          cout<<"Enter first number : Enter second number : Menu\n";
          cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
          cout<<"\n"<<num1 + num2;
          break;
      
    case 2: 
      
          cout<<"Enter first number : Enter second number : Menu\n";
          cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
          cout<<"\n"<<num1 - num2;
          break;
      
    case 3: 
      
        cout<<"Enter first number : Enter second number : Menu\n";
        cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
        cout<<"\n"<<num1 * num2;
        break;
      
    case 4: 
      
        cout<<"Enter first number : Enter second number : Menu\n";
        cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
        cout<<"\n"<<num1 / num2;
        break;
      
      
    case 5: 
      
        cout<<"Enter first number : Enter second number : Menu\n";
        cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
        cout<<"\n"<<num1 % num2;
        break;
      
    default:
      
        cout<<"Enter first number : Enter second number : Menu\n";
        cout<<"1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
        cout<<"\nInvalid operation";
        break;
      
      
      
      
      
      
      
    
    
    
  }
  
 
 return 0; 
}
