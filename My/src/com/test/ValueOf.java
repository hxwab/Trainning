package com.test;

public class ValueOf {

	public static void main(String[] args) {
	
		ValueOf v = new ValueOf();
		v.publci();
  }
	
	public void publci() {
		String str = "abggdf";
		String s=str.valueOf(false);//将参数转化为静态字符串
		System.out.println(s);
		
		int n = str.indexOf("bg");
		System.out.println(n);
		

	}
	
	
	 static int indexOf(char[] source, int sourceOffset, int sourceCount,
             char[] target, int targetOffset, int targetCount,
             int fromIndex) {
		 if (fromIndex >= sourceCount) {
			 return (targetCount == 0 ? sourceCount : -1);
		 }
		 if (fromIndex < 0) {
			 fromIndex = 0;
		 }
		 if (targetCount == 0) {
			 return fromIndex;
		 }

		 char first  = target[targetOffset];
		 int max = sourceOffset + (sourceCount - targetCount);

		 for (int i = sourceOffset + fromIndex; i <= max; i++) {
			 /* Look for first character. */
			 if (source[i] != first) {
				 while (++i <= max && source[i] != first);
			 }

			 /* Found first character, now look at the rest of v2 */
			 if (i <= max) {
				 int j = i + 1;
				 int end = j + targetCount - 1;
				 for (int k = targetOffset + 1; j < end && source[j] ==
						 target[k]; j++, k++);

				 if (j == end) {
					 /* Found whole string. */
					 return i - sourceOffset;
				 }
			 }
		 }
		 return -1;
	 }
}
