	public static void partOne() {
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

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					//check right
					if (j <= cols - 4 && input[i][j] == 'X' && input[i][j + 1] == 'M' && input[i][j + 2] == 'A' && input[i][j + 3] == 'S') {
						count++;
					}

					//check left
					if (j >= 3 && input[i][j] == 'X' && input[i][j - 1] == 'M' && input[i][j - 2] == 'A' && input[i][j - 3] == 'S') {
						count++;
					}

					//check bottom
					if (i <= rows - 4 && input[i][j] == 'X' && input[i + 1][j] == 'M' && input[i + 2][j] == 'A' && input[i + 3][j] == 'S') {
						count++;
					}

					//check up
					if (i >= 3 && input[i][j] == 'X' && input[i - 1][j] == 'M' && input[i - 2][j] == 'A' && input[i - 3][j] == 'S') {
						count++;
					}

					//check diagonal bottom right
					if (j <= cols - 4 && i <= rows - 4 && input[i][j] == 'X' && input[i + 1][j + 1] == 'M' && input[i + 2][j + 2] == 'A' && input[i + 3][j + 3] == 'S') {
						count++;
					}

					//check diagonal up left
					if (j >= 3 && i >= 3 && input[i][j] == 'X' && input[i - 1][j - 1] == 'M' && input[i - 2][j - 2] == 'A' && input[i - 3][j - 3] == 'S') {
						count++;
					}

					//check diagonal bottom left
					if (j >= 3 && i <= rows - 4 && input[i][j] == 'X' && input[i + 1][j - 1] == 'M' && input[i + 2][j - 2] == 'A' && input[i + 3][j - 3] == 'S') {
						count++;
					}

					//check diagonal up right
					if (j <= cols - 4 && i >= 3 && input[i][j] == 'X' && input[i - 1][j + 1] == 'M' && input[i - 2][j + 2] == 'A' && input[i - 3][3 + j] == 'S') {
						count++;
					}
				}
			}

			System.out.println("D4P1 result: " + count);
		} catch (IOException e) {
			System.out.println("Hiba történt a fájl beolvasása közben: " + e.getMessage());
		}
