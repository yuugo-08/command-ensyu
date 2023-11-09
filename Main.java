import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("身長（センチメートル）を入力してください: ");
        double senti = scanner.nextDouble();
        System.out.print("体重（キログラム）を入力してください: ");
        double weight = scanner.nextDouble();

        //メートルになおす
        double meitoru = senti / 100.0;

        // BMIを計算
        double bmi = calculateBMI(meitoru, weight);

        // 適正体重を計算
        double healthyWeight = calculateHealthyWeight(meitoru);

        // BMIと適正体重を出力
        System.out.printf("あなたのBMIは %.2f です。\n", bmi);
        System.out.printf("適正体重は %.2f キログラムです。\n", healthyWeight);

        if (bmi < 18.5) {
            System.out.println("BMIが18.5未満です。適正体重に近づけるために食事と運動に気を付けましょう。");
        } else if (bmi < 25) {
            System.out.println("BMIが適正範囲です。健康な生活を続けましょう。");
        } else {
            System.out.println("BMIが25以上です。適正体重に近づけるために食事と運動に気を付けましょう。");
        }
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static double calculateHealthyWeight(double height) {
        return 22 * height * height;
    }
}
