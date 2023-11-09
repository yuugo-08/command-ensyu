import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.print(i +"人目" + ": 身長（センチメートル）を入力してください: ");
            double senti = scanner.nextDouble();
            System.out.print(i + "人目" + ": 体重（キログラム）を入力してください: ");
            double weight = scanner.nextDouble();

            // センチメートルをメートルに変換
            double meitoru = senti / 100.0;

            // BMIを計算
            double bmi = calculateBMI(meitoru, weight);

            double healthyWeight = calculateHealthyWeight(meitoru);

            System.out.println(i + "人目" + ": あなたのBMIは " + String.format("%.2f", bmi) + " です。");
            System.out.println(i + "人目" + ": 適正体重は " + String.format("%.2f", healthyWeight) + " kgです。");


            if (bmi < 18.5) {
                System.out.println(i + "人目" +": BMIが18.5未満です。適正体重に近づけるために食事と運動に気を付けましょう.");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println(i + "人目" + ": BMIが適正範囲です。健康な生活を続けましょう.");
            } else {
                System.out.println(i + "人目" + ": BMIが25以上です。適正体重に近づけるために食事と運動に気を付けましょう.");
            }
        }
    }

    
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

 
    public static double calculateHealthyWeight(double height) {
        return 22 * height * height;
    }
}
