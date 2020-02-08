package a;

class Animal {

	public static class Dog {

		private void print(int a, int b, int c) {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
		}


		public void bark() {
			int a = 1;
			int b = 2;
			int c = 3;

			print(a, b, c);
		}
	}

	public static class Cat {

		public void scratch() {
			int x = 1;
		}
	}
}

