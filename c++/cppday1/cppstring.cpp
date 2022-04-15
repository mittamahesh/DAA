#include<iostream>
using namespace std;
int main()
{
    string name="Mahesh Reddy";
    cout << "Hello \n";
    cout << name <<endl;
    cout << "length of name is :"<<name.length()<<endl;
    //to find character in particular string
    cout <<name[0] <<endl;
    cout << name[10]<<endl;
    //find index of a character or string
    cout <<name.find("re",0)<<endl;
    //sub string
    cout << name.substr(5,3);
    return 0;
}
