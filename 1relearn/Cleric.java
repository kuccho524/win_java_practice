public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    
    // セルフエイドを唱えるとHPが最大になり、MPは5消費する
    System.out.println(this.name + "はセルフエイドを唱えた");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {

    // いのるをした場合のアクション
    System.out.println(this.name + "は" + sec + "秒祈った");

    // 理論上の回復量を乱数を用いて計算する 
    int recover = new java.util.Random().nextInt(3) + sec;

    // 実際の回復量を計算する
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}
