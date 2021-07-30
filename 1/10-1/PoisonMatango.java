/* Matangoクラスを継承してPoisonMatangoクラス宣言 */

public class PoisonMatango extends Matango {
  int poisonCount = 5;
  
  // PoisonMatangoインスタンスクラスを宣言
  public PoisonMatango(char suffix) {
    super(suffix);
  }

  // attackメソッドを宣言
  public void attack(Hero h) {
    super.attack(h);

    // 毒攻撃が0でなければ以下を追加で行う
    if(this.poisonCount > 0) {

      // 画面に「さらに毒の胞子をばらまいた！」と表示する
      System.out.println("さらに毒の胞子をばらまいた！");

      // HPの5/1に相当するポイントのダメージを与え、「～ポイントのダメージ」と表示する
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");

      // 毒攻撃の回数を1減らす
      this.poisonCount--;
    }
  }
}
