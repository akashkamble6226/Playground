#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int total_number_of_balls, total_number_of_runs, runs_scored, balls_bowled;
  
  cin>>total_number_of_balls>> total_number_of_runs>> runs_scored>> balls_bowled;
  
  float overs=(total_number_of_balls/6);
  cout<<overs<<endl;
  
  float over_finished=((int)(balls_bowled/6))+(balls_bowled%6)/10.0;
  cout<<over_finished<<endl;
  
  float cur_runrate=(runs_scored)/over_finished;
  cout<<fixed<<setprecision(1)<<cur_runrate<<endl;
  
  float total_runrate=total_number_of_runs/overs;
  cout<<fixed<<setprecision(1)<<total_runrate<<endl;
  
  if(total_runrate<cur_runrate)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
  
  
  return 0;
}