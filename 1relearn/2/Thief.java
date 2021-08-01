public class Thief {

  // 各パラメーターを定義
  String name;
  int hp;
  int mp;


  // name、hp、mpを指定してインスタンス化する
  public Thief(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  // name、hpを指定してインスタンス化し、mpは5で初期化される
  public Thief(String name, int hp) {
    this(name, hp, 5);
  }

  // nameを指定してインスタンス化し、hpは40、mpは5で初期化される
  public Thief(String name) {
    this(name, 40);
  }
}
