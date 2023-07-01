package assignmentPackage;

public class PrintAllElememtsOf1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []d = {10.34434, 452.345, 32.45543, 422.333434};
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		
		//Print all elements of 2D Array
		String [][] s = {{"Selenium", ".Net"}, 
				{"Android App Tester", "FullStack"},
				{"Manual Testing"}, {"Automation Testing"}};
		for (int x = 0; x < s.length; x++) {
			for (int y = 0; y < s[x].length; y++) {
				System.out.println(s[x][y]);
			}
		}
		
		//Print all elements of 3D Array
		int [][][] n = {{{10, 20}, {30, 40}},{{50, 60}, {70, 80}},
				{{90, 100}, {110, 120}},{{130, 140}, {150, 160}}};
		for (int l = 0; l < n.length; l++) {
			for(int m = 0; m < n[l].length; m++) {
				for (int k = 0; k < n[l][m].length; k++) {
					System.out.print(n[l][m][k]+" ");
				}
			}
		}
		
		System.out.println();
		
		//Print all elements of 4D Array
		int [][][][] p = {{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
				{{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}};
		for (int q = 0; q < p.length; q++) {
			for(int r = 0; r < p[q].length; r++) {
				for (int t = 0; t < p[q][r].length; t++) {
					for (int u = 0; u < p[q][r][t].length; u++) {
						System.out.print(p[q][r][t][u]+" ");
					}
				}
			}
		}
	}
}
