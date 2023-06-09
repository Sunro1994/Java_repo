package RegularExpression;

public class regularExpression {
public static void main(String[] args) {
	/*
	  	c[a-z]* 					: c로 시작하는 영단어
	  	c[a-z]						: c로 시작하는 두 자리 영단어
	  	c[a-zA-Z] 					: c로 시작하는 두 자리 영단어(a~z또는 A~Z,즉 대소문자 구분 안함)
	  	c[a-zA-Z0-9]				: c로 시작하고 숫자와 영어로 조합된 두 글자
	  	.* 							: 모든 문자열
	  	c.							: c로시작하는 두자리 문자열
	  	c.*							: c로 시작하는 모든 문자열(기호 포함)
	  	c\.							: c.와 일치하는 문자열 '.'은 패턴작성에 사용되는 문자이므로 escape문자인 \을 사용한다.
	  	c\d,c[0-9]					: c와 숫자로 구성된 두자리 문자열
	  	c.*t						: c로 시작하고 t로 끝나는 모든 문자열
	  	[b|c].*	[bc].*	[b-c].*		: b또는c로 시작하는 문자열
	  	[^b|c].* [^bc].* [^b-c].*	: b또는 c로 시작하는 문자열
	  	.*a.*						: a를 포함하는 모든 문자열( * : 0 또는 그 이상의 문자. +와 달리 a로 끝나도 포함한다.
	  	.*a.+						: a를 포함하는 모든 문자열 ( + : 1또는 그이상의 문자. *과 달리 반드시 하나 이상의 문자가 있어야 하므로
	  								  a로 끝나는 단어는 포함하지 않는다.
	  	[b|c],{2}					:b또는c로 시작하는 세자리 문자열. (b또는 c다음에 두자리이므로 모두 세자리)
	  	
	 */
}
}
