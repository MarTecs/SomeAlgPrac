#include<stdio.h>

#include<math.h>

#include <time.h> //�õ���time���� 


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
	find ΪҪ�ҵ���
	inpu Ϊ�Լ�������� 
*/
void binary_search(int a[], int find, int inpu) {
	
	int low = 0;
	int high = sizeof(a) / 4 - 1;
	
	int middle = ( low + high ) / 2 + 1;
	for ( int i = low; i < high; i++ ) {
		if ( inpu > a[middle]) {
			printf("�´���!");
			high = middle;
		}else if ( inpu < a[middle] ) {
			printf("��С�ˣ�");
			low = middle;
		}else {
			printf("�¶���")
		}
	}
	
	
	
}

/*
	�������һ��������������з��� 
*/

int generate_random() {
	srand((unsigned) time(NULL)); //��ʱ�����֣�ÿ�β����������һ��
	return rand() % 101;
}

