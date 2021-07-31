public class PoisonMatango extends Matango {
  int PoisonCount = 5;

  public PoisonMatango(char suffix) {
    super(suffix);
  }

  // PoisonMatangoのattackメソッド
  public void attack(Hero h) {

    // 通常の攻撃を行う
    super.attack(h);

    // 毒攻撃の残り回数が0でなければ、毒をまく
    if(this.PoisonCount > 0) {

      // 「さらに毒の胞子をばらまいた」と出力
      System.out.println("さらに毒の胞子をばらまいた");

      // 体力の1/5相当のダメージを与える
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ");

      // 毒攻撃の回数を減らす
      PoisonCount--;
    }
  }
}
