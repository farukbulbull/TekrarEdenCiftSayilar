public class TekrarEdenSayılar {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 2, 4, 6, 8, 10, 12};
        int[] duplicates = new int[numbers.length];
        int duplicateIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    boolean isAlreadyAdded = false;
                    for (int k = 0; k < duplicateIndex; k++) {
                        if (duplicates[k] == numbers[i]) {
                            isAlreadyAdded = true;
                            break;
                        }
                    }
                    if (!isAlreadyAdded) {
                        duplicates[duplicateIndex++] = numbers[i];
                    }
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar: ");
        for (int i = 0; i < duplicateIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}
