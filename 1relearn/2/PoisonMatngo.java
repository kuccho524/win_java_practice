public class PoisonMatngo extends Matango {
  int PoisonCount = 5;

  public PoisonMatngo(char suffix) {

    // 親クラスからsuffixを呼び出す
    super(suffix);

    public void attack(Hero h) {

      // 通常攻撃を行う
      super.attack(h);

      // PoisonCountが0より大きい時のアクション
      if(PoisonCount > 0) {
        System.out.println("さらに毒の胞子をばらまいた");

        // 体力の1/5相当のダメージを与える
        int dmg = h.hp / 5;
        h.hp -= dmg;
        System.out.println(dmg + "ポイントのダメージ");

        // PoisonCountを1減らす
        PoisonCount--;
      }
    }
  }
}
