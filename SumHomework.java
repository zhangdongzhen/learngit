package homework1;

public class SumHomework {
	public static void main(String[] args) {
		SumHomework cal = new SumHomework();
		SumHomework cal2 = new SumHomework();
		SumHomework cal3 = new SumHomework();
		System.out.println(cal.ContSum(1000));
		System.out.println(cal2.ContSum1(1000));
		System.out.println(cal3.Sum(3, 10));
	}

	int ContSum(int summax) {
		int n = 1;
		int sum = 0;
		while (sum < summax) {
			sum += n * (n + 1);
			n++;
		}
		return (n - 2);
	}

	int ContSum1(int summax) {
		int n = 1;
		int sum = 0;
		do {
			sum += n * (n + 1);
			n++;
		} while (sum < summax);
		return n - 2;
	}

	int Sum(int begin, int end) {
		int sum = 0;
		for (int i = begin; i < end; i++) {
			sum += i;
		}
		return sum;
	}
}
