#include<iostream>
using namespace std;

int main()
{
  int max_lmt, waight;
  
  cin>>max_lmt>>waight;
  
  if(waight > max_lmt)
  {
   
    cout<<"Sorry, you can't enter";
    
  }
  else if(waight < max_lmt)
  {
     cout<<"Yes, you can enter.";
  }
  else
  {
    
    cout<<"Yes, you can enter. Kindly use a rope.";
    
  }
  
  
 return 0; 
}