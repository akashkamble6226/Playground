#include<iostream>

using namespace std;

int main()

{

int tree_num,row, col, temp;

 cin>>tree_num>>row>>col;

 temp = col % 3;

 

 if(temp!=0 )
 {
   cout<<"It is a mango tree";
 }

 else
 {
   cout<<"It is not a mango tree";
 }

}