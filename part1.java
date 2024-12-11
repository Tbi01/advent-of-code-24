public static int partOne() {
		String input = DataUtil.getText();
		Pattern pattern = Pattern.compile("mul\\(\\d+,\\d+\\)");
		Matcher matcher = pattern.matcher(input);
		int sum = 0;
		while (matcher.find()) {
			String match = matcher.group();
			String sub = match.substring(4, match.length() - 1);
			String[] res = sub.split(",");
			sum += Integer.valueOf(res[0]) * Integer.valueOf(res[1]);
		}

		System.out.println("D3P1 result: " + sum);
		return sum;
	}
