public static void partTwo() {
		String filePath = "input.txt";

		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
			int count = 0;
			int rows = lines.size();
			int cols = lines.get(0).length();

			char[][] input = new char[rows][cols];

			for (int i = 0; i < rows; i++) {
				input[i] = lines.get(i).toCharArray();
			}

			for (int i = 1; i < rows; i++) {
				for (int j = 1; j < cols; j++) {
					//Find A

					//M M
					// A
					//S S
					if (i < rows - 1 && j < cols - 1 && input[i][j] == 'A' && input[i - 1][j - 1] == 'M' && input[i - 1][j + 1] == 'M' && input[i + 1][j - 1] == 'S' && input[i + 1][j + 1] == 'S') {
						count++;
					}

					//S M
					// A
					//S M
					if (i < rows - 1 && j < cols - 1 && input[i][j] == 'A' && input[i - 1][j - 1] == 'S' && input[i - 1][j + 1] == 'M' && input[i + 1][j - 1] == 'S' && input[i + 1][j + 1] == 'M') {
						count++;
					}

					//S S
					// A
					//M M
					if (i < rows - 1 && j < cols - 1 && input[i][j] == 'A' && input[i - 1][j - 1] == 'S' && input[i - 1][j + 1] == 'S' && input[i + 1][j - 1] == 'M' && input[i + 1][j + 1] == 'M') {
						count++;
					}

					//M S
					// A
					//M S
					if (i < rows - 1 && j < cols - 1 && input[i][j] == 'A' && input[i - 1][j - 1] == 'M' && input[i - 1][j + 1] == 'S' && input[i + 1][j - 1] == 'M' && input[i + 1][j + 1] == 'S') {
						count++;
					}
				}
			}

			System.out.println("D4P1 result: " + count);
		} catch (IOException e) {
			System.out.println("Hiba történt a fájl beolvasása közben: " + e.getMessage());
		}
	}
