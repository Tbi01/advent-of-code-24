//Not working yet

public static int partTwo() {
		StringBuilder input = new StringBuilder(DataUtil.getText());
		final String doString = "do()";
		final String dontString = "don't()";
		int dontIndex = -1;
		int doIndex = -1;
		String text = input.toString();
		input = new StringBuilder();
		do {
			dontIndex = text.indexOf(dontString);
			if (dontIndex == -1) {
				input.append(text);
				break;
			}
			doIndex = text.substring(dontIndex).indexOf(doString);
			if (doIndex == -1) {
				input.append(text);
				break;
			}

			input.append(text.substring(0, dontIndex));
			text = text.substring(dontIndex + doIndex + 4);
		} while (dontIndex != -1 && doIndex != -1);

		Pattern pattern = Pattern.compile("mul\\(\\d+,\\d+\\)");
		Matcher matcher = pattern.matcher(input.toString());
		int sum = 0;
		while (matcher.find()) {
			String match = matcher.group();
			String sub = match.substring(4, match.length() - 1);
			String[] res = sub.split(",");
			sum += Integer.valueOf(res[0]) * Integer.valueOf(res[1]);
		}

		System.out.println("D3P2 result: " + sum);
		return sum;
	}
