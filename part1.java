public static int partOne() {
		int steps = 25;

		List<Long> stones = Arrays.asList(DataUtil.getStones());

		for (int i = 0; i < steps; i++) {
			System.out.println("Step " + i);
			List<Long> nextStones = new ArrayList<Long>();

			for (Long stone : stones) {
				nextStones.addAll(engraver(stone));
			}
			
			stones = nextStones;
			System.out.println(stones.size());
		}
		System.out.println("D11P1 result: " + stones.size());
		return stones.size();
	}

	private static List<Long> engraver(Long stone) {
		List<Long> newStone = new ArrayList<>();
		String stoneChars = stone.toString();
		if (ZERO.equals(stone)) {
			newStone.add(ONE);
		} else if (stoneChars.length() % 2 == 0) {
			String left = stoneChars.substring(0, stoneChars.length() / 2);
			String right = stoneChars.substring(stoneChars.length() / 2);
			newStone.add(Long.valueOf(left));
			newStone.add(Long.valueOf(right));
		} else {
			newStone.add(stone * 2024L);
		}

		return newStone;
	}
