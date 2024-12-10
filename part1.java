private static Integer dayOnePartOne() {
		List<Integer> listA = getListA().stream().sorted().toList();
		List<Integer> listB = getListB().stream().sorted().toList();
		List<Integer> distances = new ArrayList<>();
		int sum = 0;
		if (listA.size() != listB.size()) {
			System.out.println("A két lista mérete nem egyezik!");
			return null;
		}

		for (int i = 0; i < listA.size(); i++) {
			int distance = Math.abs(listA.get(i) - listB.get(i));
			distances.add(distance);
			sum += distance;
		}
		System.out.println("result: " + sum);
		return sum;
	}
