#include<iostream>
using namespace std;
int main()
{
  
 int boat_wgt,adult_wgt=75,child_wgt=30,adult_inp,child_inp , adult, child;
  
  cin>>boat_wgt>>adult_inp>>child_inp;
  
  adult = adult_inp * adult_wgt;
  child = child_inp * child_wgt;
  
  
  
  
  if (adult + child < boat_wgt  )
  {
    cout<<"Boat is stable";
  }
  else
  {
    
   cout<<"Boat will drow"; 
  }
 
  return 0 ;
  
}