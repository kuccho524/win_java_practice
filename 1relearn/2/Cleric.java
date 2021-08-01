/* Clericクラス */

public class Cleric {

  // 各ステータスを宣言
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  // セルフエイドを唱えるとMPを5消費し、HP最大になる
  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた");
    this.mp -= 5;
    this.hp = MAX_HP;
    System.out.println("体力が全回復した");
  }

  // 「祈る」をするとMPが回復する。祈った秒数によってMPの回復量が変わる
  public int pray(int sec) {
    System.out.println(this.name + "は天に向かって祈った");

    // 回復量は祈った秒数のランダムで0～2ポイントの補正を加える
    int recovery = new java.util.Random().nextInt(3) + sec;

    // 回復した時に最大MPを超えないようにする
    int actualRecovery = Math.min(this.MAX_MP - this.mp, recovery);

    /* 

    ～ Math.min() ～
    引数に指定した 2 つの値のうち、どちらか小さいほうの値を取得するには Math クラスで用意されている min メソッドを使用します。 min メソッドはクラスメソッドです。引数のデータ型によって同じ名前のメソッドがいくつか用意されていますが、例として int 型の値を引数に取るメソッドを確認します。

    パラメータ:
    a - 引数
    b - 別の引数

    戻り値:
    aとbのどちらか小さい方。
    */

    // MPを回復する
    this.mp += actualRecovery;
    System.out.println("MPが" + actualRecovery + "回復した");
    return actualRecovery;
  }
}