package javabasic;

public class OptimizingString {

	public static void main(String[] args) {
		//example
		String str1= "abc";
		String str2= new String("abc");
		String str3= str2.intern();
		assertSame(str1==str2);
		assertSame(str2==str3);
		assertSame(str1==str3);
		
		//Why are the output show that?
		/**
		 * line7 当代码中使用第一种方式创建字符串对象时，JVM 首先会检查该对象是否在字符串常量池中，如果在，就返回该对象引用，否则新的字符串将在常量池中被创建。这种方式可以减少同一个值的字符串对象的重复创建，节约内存。
		 * line8 首先在编译类文件时，"abc"常量字符串将会放入到常量结构中，在类加载时，“abc"将会在常量池中创建；其次，在调用 new 时，JVM 命令将会调用 String 的构造函数，同时引用常量池中的"abc” 字符串，在堆内存中创建一个 String 对象；最后，str 将引用 String 对象。
		 * line10	以上说明了str1和str2必然是不相等的 因为引用不一样
		 * line9 
		 * */
	}

	private static void assertSame(boolean b) {
		if (b) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are unequal");
		}
	}

	/**
	 * 	平时做字符串拼接的时候，建议显示地使用 String Builder 来提升系统性能。
	 * */
}
