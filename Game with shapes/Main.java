#include<iostream>

using namespace std;

int main()
{
  int radius,length,diameter;
  
  cin>>radius>>length;
  
  diameter = 2 * radius;
  
  if(diameter == length)
  {
    
    cout<<"circle can be inside a square";
    
  }
  else
  {
    
    
    cout<<"circle cannot be inside a square";
    
  }
  
  
  
  
 return 0; 
}