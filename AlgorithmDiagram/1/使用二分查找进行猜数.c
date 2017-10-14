#include<stdio.h>

#include<math.h>

#include <time.h> //用到了time函数 


int main()
{  
	int find = generate_random();
   	int a[100];
   	for ( int i = 0; i < 100; i++ ) {
   		a[i] = i;
	}
	/*
	int inpu;
	while( (input = getchar() ) != null ) {
		binary_search(a, find, inpu);
	}
	*/
	
	printf(sizeof(a));
  	return 0;
}


/*
	find 为要找的数
	inpu 为自己输入的数 
*/
void binary_search(int a[], int find, int inpu) {
	
	int low = 0;
	int high = sizeof(a) / 4 - 1;
	
	int middle = ( low + high ) / 2 + 1;
	for ( int i = low; i < high; i++ ) {
		if ( inpu > a[middle]) {
			printf("猜大了!");
			high = middle;
		}else if ( inpu < a[middle] ) {
			printf("猜小了！");
			low = middle;
		}else {
			printf("猜对了")
		}
	}
	
	
	
}

/*
	随机生成一个随机数，并进行返回 
*/

int generate_random() {
	srand((unsigned) time(NULL)); //用时间做种，每次产生随机数不一样
	return rand() % 101;
}

