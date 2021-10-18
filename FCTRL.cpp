#include <iostream>
using namespace std;


int trailingZeroes(int n) {
    int num = 5;
    int count = 0;
    while (n > 0) {
        n = n/num;
        count += n;
    }
    return count;
}

int main() {
	int t;
	int n;
	int result = 0;
	cin >> t;
	
	for(int i=0; i<t; i++) {
	    cin >> n;
	    result = trailingZeroes(n);
	    cout << result << endl;
	}
	return 0;
}
