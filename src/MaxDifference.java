import java.util.Scanner;

public class MaxDifference {

	
	public static void main(String[] args) {

			// processameto stdin
			Scanner in = new Scanner(System.in);
			
			System.out.println("Entre com o total de elementos para o array: ");
			Integer total = in.nextInt();
			
			int[] array = new int[total];
			
			for (int i = 0; i < total; ++i) {
				System.out.println("Digite o elemento " + (i+1) + ": ");
				array[i] = in.nextInt();
			}
			
			System.out.println("Aguarde o processamento...");
			
			try {
				// pesquisa a diferença maxima no array
				int max = new MaxDifference().max(array);
				System.out.println("Max Difference é " + max);
				
			} catch (Exception e) {
				System.err.println("####### Você pode ter passado um caracter alfanumerico para a função. #######");
			} finally {
				in.close();
			}
		
			
	}
	
	public int max(int[] array) throws Exception {
		int max = -1;
		for (int i = 1; i < array.length; i++) {
			for (int j = i -1; j >= 0; j--) {
				// se digito sucessor é menor que um antecessor
				if (array[i] < array[j]) {
					//  então pula para a próxima iteração
					continue;
				}
				// recupera a diferença.
				int tmp = array[i] - array[j];
				// se a diferença for maior que max, então
				if (tmp > max) {
					// atualiza max
					max = tmp;
				}
				
			}
		}
		return max;
	}

}
