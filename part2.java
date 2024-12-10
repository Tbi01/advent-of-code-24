public static int partTwo() {
		int[][] reports = DataUtil.getReports();
		int safeCounter = 0;
		for (int i = 0; i < reports.length; i++) {
			boolean isReportSafe = isReportSafe(reports[i]);
			int j = 0;

			while (!isReportSafe && j < reports[i].length) {
				isReportSafe = isReportSafe(ArrayUtils.remove(reports[i], j));
				j++;
			}

			if (isReportSafe) {
				safeCounter++;
			}
		}

		System.out.println("D2P1 result: " + safeCounter);
		return safeCounter;

	}

	private static boolean isReportSafe(int[] report) {
		boolean isSafe = true;
		Integer previousNumber = report[0];
		Boolean isIncrease = null;

		for (int j = 1; j < report.length; j++) {

			int difference = previousNumber - report[j];

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

			previousNumber = report[j];
		}
		return isSafe;
	}
