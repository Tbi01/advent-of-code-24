private static int dayTwoPartOne() {
		int[][] reports = DataUtil.getReports();
		int safeCounter = 0;
		for (int i = 0; i < reports.length; i++) {

			boolean isSafe = true;
			Integer previousNumber = reports[i][0];
			Boolean isIncrease = null;

			for (int j = 1; j < reports[i].length; j++) {

				int difference = previousNumber - reports[i][j];

				if (difference > 0 && difference <= 3) {
					if (isIncrease == null) {
						isIncrease = false;
					}

					isSafe = !isIncrease;
				} else if (difference < 0 && difference >= -3) {
					if (isIncrease == null) {
						isIncrease = true;
					}

					isSafe = isIncrease;
				} else {
					isSafe = false;
				}

				if (!isSafe) {
					break;
				}

				previousNumber = reports[i][j];
			}
			if (isSafe) {
				safeCounter++;
			}
		}

		System.out.println("D2P1 result: " + safeCounter);
		return safeCounter;
	}
