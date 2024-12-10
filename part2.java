private static Integer dayOnePartTwo() {
		List<Integer> listA = getListA();
		List<Integer> listB = getListB();
		AtomicInteger sum = new AtomicInteger();
		listA.forEach(a -> sum.addAndGet(a * (int) listB.stream().filter(b -> Objects.equals(a, b)).count()));

		System.out.println("D1P2 result: " + sum.get());
		return sum.get();
	}
