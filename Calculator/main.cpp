//
// Created by Elhadi Elhadi on 2019-04-20.
//

#include <cmath>
#include <iostream>
#include <string>
#include <vector>
#include <array>
#include <list>

using namespace std;

double addFunction(double &x, double &y);
double subtractFunction(double &x, double &y);
double divideFunction(double &x, double &y);
double multiplyFunction(double &x, double &y);
double meanFunction(double array[], int size);


int main() {

    int size;
    double array[size];

    string choice;

    cout << "Are you calculating the mean of a sample? " << endl;
    cout << "Yes or No" << endl;
    cin >> choice;

    if(choice == "Yes" || choice == "yes" || choice == "YES") {
        double total;
        cout << "\n\nEnter the size of sample" << endl;
        cin >> size;
        cout << "Enter the numbers in the sample" << endl;
        for (int i=0;i<size;i++) {
            cin >> array[i];
            cout << "mean after input number " << i << " is: " << meanFunction(array,size) << endl;
        }

    }


 if (choice == "No" || choice == "no" || choice == "nO" || choice == "NO") {

    double val1 = 0, val2 = 0;
    int numofOperations = 0;

    cout << "\nThen please Enter the two values you would like to calculate if not calculating mean: " << endl;
    cin >> val1;
    cin >> val2;

    cout << "Which operation would you like to execute? " << endl;
    cout << "1) Addition" << endl;
    cout << "2) Subtraction" << endl;
    cout << "3) Multiply" << endl;
    cout << "4) Divide" << endl;

    cout << "\nEnter the value of your selection (1,2,3,4,5)" << endl;

    int operation;

    cin >> operation;

    switch (operation) {

        double result;
        case 1 :

            cout << "\ncalculating addition..." << endl;
            result = addFunction(val1, val2);
            cout << "Result: " << result;
            break;

        case 2:
            cout << "\ncalculating subtraction..." << endl;
            result = subtractFunction(val1, val2);
            cout << "Result: " << result;
            break;

        case 3:
            cout << "\ncalculating multiplication..." << endl;
            result = multiplyFunction(val1, val2);
            cout << "Result: " << result;
            break;

        case 4:
            cout << "\ncalculating division..." << endl;
            result = divideFunction(val1, val2);
            cout << "Result: " << result;
            break;

        case 5:


        default:
            cout << "Invalid option, please rerun program to try again" << endl;
            break;


    }


}
 else {
     cout << "invalid choice please rerun program" << endl;
     return 12;
 }



    return 0;
}




double addFunction(double &x, double &y) {

    double sum;
    sum = x + y;

    return sum;

}


double subtractFunction(double &v,double &q) {
    double subtract;
    subtract = v - q;

    return subtract;
}

double divideFunction(double &e, double &n) {
    double divide;
    divide = e/n;

    return divide;
}

double multiplyFunction(double &n, double &z) {
    double multiply;
    multiply = n * z;

    return multiply;
}

double meanFunction(double array[],int size) {
    double sum=0;
    double mean=0;
    for (int i=0;i<size;i++) {

        sum+=array[i];
    }

    mean = sum/size;

    return mean;



}



