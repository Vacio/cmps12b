class DictionaryTest {
	public static void main(String[] args) {
		Dictionary A = new Dictionary();
		System.out.println(A.isEmpty()); // true
		A.insert("1", "a");
		System.out.println(A.isEmpty()); // false
		System.out.println(A.size()); // 1
	}
}