**StringBuffer와 StringBuilder의 차이 //참조 :https://12bme.tistory.com/42

StringBuffer의 경우 각 메서드별로 Synchronized Keyword가 존재하여, 멀티 스레드 환경에서도 동기화를 지원하는 반면,
StringBuilder는 동기화를 지원하지 않는다.

cf)String, StringBuilder, StringBuffer의 차이점 정리해놓기


**유클리드 호제법  참조 : https://velog.io/@mkdevelop5002/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4N%EA%B0%9C%EC%9D%98-%EC%B5%9C%EC%86%8C%EA%B3%B5%EB%B0%B0%EC%88%98-with-JAVA

유클리드 호제법이란?

static int gcd(int a, int b) {

	while(b!=0) {	
		int r=a%b;
		a=b;
		b=r;
	}
	return a;
}

이와 같이 두수가 있으면 처음에 그 중 한 수(여기서는 b)로 나누고 나머지를 임시 변수(r)에 저장하고 나누어진수(a)는 나눈수(b)가 되고 나눈수(b)는 임시변수(r)이 된다. 그리고 b가 0이 아닐때 까지 반복하다 0이 되면 a를 return 하게 되는데 a가 a,b의 최대공약수가 된다.

최대공약수 관련 문제는 보통 유클리드 호제법이라는 것을 사용한다.

최소공배수 구하는법
간단하다 , 이것 또한 알고리즘 문제에서 가장 많이 쓰이는 식인데
최소공배수 = 두수의 곱 / 두수의 최대공약수

**comparator, comparable, compareTo() 학습   참조: https://m.blog.naver.com/PostView.nhn?blogId=cheesedrive&logNo=220148513502&proxyReferer=https:%2F%2Fwww.google.com%2F

**collection&Map 참조 : https://darksilber.tistory.com/70

**힙(heap) // 출처 : https://ko.wikipedia.org/wiki/%ED%9E%99_(%EC%9E%90%EB%A3%8C_%EA%B5%AC%EC%A1%B0)

heap)은 최댓값 및 최솟값을 찾아내는 연산을 빠르게 하기 위해 고안된 완전이진트리(complete binary tree)를 기본으로 한 자료구조(tree-based structure)로서 다음과 같은 힙 속성(property)을 만족한다.

A가 B의 부모노드(parent node) 이면, A의 키(key)값과 B의 키값 사이에는 대소관계가 성립한다.
힙에는 두가지 종류가 있으며, 부모노드의 키값이 자식노드의 키값보다 항상 큰 힙을 '최대 힙', 부모노드의 키값이 자식노드의 키값보다 항상 작은 힙을 '최소 힙'이라고 부른다.

키값의 대소관계는 오로지 부모노드와 자식노드 간에만 성립하며, 특히 형제 사이에는 대소관계가 정해지지 않는다.

각 노드의 자식노드의 최대개수는 힙의 종류에 따라 다르지만, 대부분의 경우는 자식노드의 개수가 최대 2개인 이진 힙(binary heap)을 사용한다. 2진 힙의 시간 복잡도는 O(log n)이다.

힙에서는 가장 높은(혹은 가장 낮은) 우선순위를 가지는 노드가 항상 뿌리노드에 오게 되는 특징이 있으며, 이를 응용하면 우선순위 큐와 같은 추상적 자료형을 구현할 수 있다.


** 우선순위 큐(PriorityQueue // java.util.PriorityQueue) // 출처 : https://m.blog.naver.com/PostView.nhn?blogId=hyoun1202&logNo=90193398013&proxyReferer=https:%2F%2Fwww.google.com%2F

Queue는 FIFO(First In First Out)방식에 따라 입력된 순서대로 출력되는 자료 구조를 갖는다. 

즉,  큐에 삽입될 때의 시간이 큐에서의 순서를 결정한다. 그러나 우선순위 큐(PriorityQueue)는 입력 시간이 아닌 다른 조건
으로 큐내에서의 순서를 결정할 수 있는데 이때 Comparator 인터페이스가 큐내에서의 순서를 결정하는 역할을 한다.
우선순위 큐는 보통 빅데이타를 분석할 때 빈도수가 가장 높은 단어나 문장들중 상위 N개를 추출할 때 사용된다.


**MYSQL DATE_SUB() VS DATEDIFF()
//DATE_SUB()
This compares the stored value directly to date litterals. Such an expression can take advantage of an index on the date column.

//DATEDIFF()
In, constrast the second expression applies date function datediff() to the date column. This makes the expression non-SARGable, meaning that it will not benefit an index


**MYSql SUBDATE() VS DATE_SUB() // 출처: https://database.guide/subdate-vs-date_sub-in-mysql-whats-the-difference/

요약: DATE_SUB()과 SUBDATE()는 동일한 기능이지만 사용할 떄의 문법에서 차이가 있다. 전자는 하나의 형태를 지원하지만, SUBDATE()는 DATE_SUB()의 형태와 추가적인 형태를 모두(총2개의 형태를) 지원한다.

The difference between the MySQL SUBDATE() and DATE_SUB() functions is exactly the same as the difference between the ADDDATE() and DATE_ADD() functions. One function allows for two different syntax forms, whereas the other allows for just one.

This article demonstrates the difference.


Syntax
Here’s the syntax for each function.

DATE_SUB()
The DATE_SUB() syntax goes like this.

DATE_SUB(date,INTERVAL expr unit)
This accepts a date value, followed by the INTERVAL keyword and the expression and unit for which to subtract from the date supplied by the first argument.

SUBDATE()
The SUBDATE() syntax allows for two forms. You can use either of the following forms.

SUBDATE(date,INTERVAL expr unit)
Or

SUBDATE(expr,days)
The first form is exactly the same as the DATE_SUB() syntax, and when you use this syntax, the SUBDATE() function is a synonym for DATE_SUB().

However, the second syntax form is only available when using the SUBDATE() function, and it allows you to use a shorthand way to specify the number of days to subtract from the date.


**MYSQL 문자열 자르기 // 출처 : http://chongmoa.com/sql/9155
1. 왼쪽에서 문자열 자르기
left(컬럼명 또는 문자열, 왼쪽에서 잘라낼 문자열의 길이)

사용예 : SELECT left("chongmoa.com", 5)
결과 : chong

사용예 : SELECT left("chongmoa.com", 8)
결과 : chongmoa

사용예 : SELECT left("20140323", 4)
결과 : 2014

사용예 : SELECT left("20140323", 6)
결과 : 201403

2. 중간에서 문자열 자르기
substring(컬럼 또는 문자열, 시작위치, 길이);

사용예 : SELECT substring("chongmoa.com", 3, 5)
결과 : ongmo

사용예 : SELECT substring("chongmoa.com", 1, 5)
결과 : chong

SELECT substring("20140323", 1, 4)

사용예 : SELECT substring("20140323", 1, 4)
결과 : 2014

사용예 : SELECT substring("20140323", 1, 6)
결과 : 201403

사용예 : SELECT substring("20140323", 5, 2)
결과 : 03

참고 : substr 함수는 문자열의 일부를 추출하는 함수로 substring 함수의 동의어입니다

3. 오른쪽에서 문자열 자르기
right(컬럼명 또는 문자열, 길이);

사용예 : SELECT right("chongmoa.com", 7)
결과 : moa.com

사용예 : SELECT right("chongmoa.com", 3)
결과 : com

사용예 : SELECT right("20140323", 4)
결과 : 0323

사용예 : SELECT right("20140323", 2)
결과 : 23

4. 구분자 (delimiter) delim가 count 만큼 나오기 전에 스트링 str 에서 서브 스트링을 리턴.
SUBSTRING_INDEX(str,delim,count)

구분자 (delimiter) delim가 count 만큼 나오기 전에 스트링 str 에서 서브 스트링을 리턴한다.
만일 count 가 양수 (positive)라면, 마지막 구분자의 왼쪽에 있는 모든 것들이 리턴된다.
(왼쪽부터 계산이 됨). 만일 count 가 음수일 경우에는, 마지막 구분자의 오른쪽에 있는 모든 것들이 리턴된다 (오른쪽부터 계산됨).
SUBSTRING_INDEX()는 delim에 대한 검색을 할 때 문자의 크기를 구분한다.

사용예 : SELECT SUBSTRING_INDEX('www.chongmoa.com', '.', 2);
결과 : www.chongmoa

사용예 : SELECT SUBSTRING_INDEX('www.chongmoa.com', '.', -2);
결과 : chongmoa.com

사용예 : SELECT SUBSTRING_INDEX('admin@chongmoa.com', '@', -1)
결과 : chongmoa.com

사용예 : SELECT SUBSTRING_INDEX('admin@chongmoa.com', '@', 1)
결과 : admin

이 함수는 다중 바이트를 지원한다.


**IFNULL 함수 // 출처 : https://ra2kstar.tistory.com/75
IFNULL은 해당 필드의 값이 NULL을 반환할때 다른 값으로 출력할 수 있도록 하는 함수이다. 
SELECT IFNULL(필드명, "대체할 값") FROM 테이블명; 
물론 하나의 필드의 값 뿐만아니라 , 연속적으로도 활용 할 수 있다. 
eg) SELECT keyword, IFNULL( common_rep, IFNULL( fur_rep, makeup_rep ) ) as syn_2 FROM syn_color


**MySQL 날짜 데이터에서 일부만 추출하기 // 출처: https://extbrain.tistory.com/60

▶설명
아래에 MySQL 함수들은 날짜 데이터에서 일부만을 추출할 수있습니다.

YEAR : 연도 추출
MONTH : 월 추출
DAY : 일 추출 (DAYOFMONTH와 같은 함수)
HOUR : 시 추출
MINUTE : 분 추출
SECOND : 초 추출

▶사용법

YEAR
YEAR(기준 날짜);

MONTH
MONTH(기준 날짜);

DAY
DAY(기준 날짜);
-- 또는 DAYOFMONTH(기준 날짜);

HOUR
HOUR(기준 날짜);

MINUTE
MINUTE(기준 날짜);




*HashMap // 출처 : https://whatisthenext.tistory.com/81
해싱(Hashing)이란 해시함수(hash function)를 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법을 말한다.

키(key)와 값(value)를 하나의 세트로 묶어서 저장하는 컬렉션 클래스를 구현하는 데 사용
키(key) : 중복될 수 없음
값(value) : 중복될 수 있음.

함수
void clear() : Map의 모든 객체를 삭제
boolean containsKey(Object key) : 지정된 key 객체와 일치하는 Map의 key객체가 있는지 확인
boolean containsValue(Object value) : 지정된 value 객체와 일치하는 Map의 value객체가 있는지 확인
Set entrySet() : Map에 저장되어 있는 key-value쌍을 Map.Entry 타입의 객체로 저장한 "Set"으로 반환
boolean equals(Object o) : 동일한 Map인지 비교
Object get(Object key) : 지정한 key객체에 대응하는 value객체를 찾아서 반환
int hashCode() : 해시코드를 반환
boolean isEmpty() : Map이 비어있는지 확인
Set keySet() : Map에 저장된 모든 key객체를 반환한다.
Object put(Object key, Object Value) : Map에 value객체를 key객체에 연결(mapping)하여 저장
void putAll(Map t) : 지정된 Map의 모든 key-value쌍을 추가
Object remove(Object key) : 지정한 key객체와 일치하는 key-value 객체를 삭제
int size() : Map에 저장된 key-value쌍의 개수를 반환
Collection values() : Map에 저장된 모든 value 객체를 반환

HashMap : 저장은 느리지만 많은 양의 데이터를 검색하는데 뛰어난 성능을 보인다.
또한, Key와 Value값에 null값을 허용하기 때문에 데이터가 빠져있어도 문제되지 않는다.


git config user.name 
git config user.email
위 두 명령어를 통해 git bash에서 등록되어 있는 현재의 계정 이름 / 이메일을 확인 할 수 있습니다.

git config --global user.name 앞으로 사용하게 될 계정
git config --global user.email 앞으로 사용하게 될 이메일

Math.min() //출처- https://jamesdreaming.tistory.com/150

1. System.out.println(Math.min(12, 1));

int 형 12 와 1의 비교 입니다. 
둘중 작은 값을 가져 오는 min() 함수를 이용하였으며 return data type 은 int  형입니다. 

실행 결과는 당연히 1이 리턴 됩니다.


2. System.out.println(Math.min(7.12, 1));

인자 값으로 7.12 와 1 이 있습니다. 
보기에는 double 형 vs int 형의 비교라 생각 할 수 있습니다. 
하지만 함수 자체가 입력 값으로 받는 data type 은 동일 형이어야 합니다. 


즉, 위 코드는 double 형 7.12 vs 1.0 의 비교 입니다. 
실행 결과는 double 형으로 리턴 되므로 1.0 이 리턴 됩니다. 


3. System.out.println(Math.min(1004.12, 1004.34));

보기에도 double vs double 입니다. 리턴 값은 당연히 double 형이구요. 
실행 결과는 1004.12 가 리턴 됩니다. 


1. length
 - arrays(int[], double[], String[])
 - length는 배열의 길이를 알고자 할때 사용

2. length()
 - String related Object(String, StringBuilder etc)
 - length()는 문자열의 길이를 알고자 할때 사용

3. size()
 - Collection Object(ArrayList, Set etc)
 - size()는 컬렉션프레임워크 타입의 길이를 알고자 할때 사용

