package Chapter11;

public interface Human extends Creature {
	void talk();
	void watch();
	void hear();

	// さらに、親インタフェースからrun()を継承する
	void run();

	/*
	 * 継承元と継承先が同種（classとclass、interfaceとinterface）の場合は継承(extends)
	 * 異種の場合（interfaceとclass、classとinterface）の場合は実装（implements）
	 * 両方利用することも可
	 */
}
