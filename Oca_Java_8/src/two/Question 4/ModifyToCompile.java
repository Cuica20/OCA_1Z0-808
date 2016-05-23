public class ModifyToCompile {

	// A - invalid
	// E - invalid

	public void castLine4ToInt() { // B
		long x = 10;
		int y = 2 * (int)x;
	}

	public void changeXToShort() { // C
		short x = 10;
		int y = 2 * x;
	}

	public void cast2TimesXToInt() { // D
		long x = 10;
		int y = (int)(2 * x);
	}

	public void changeDataTypeOnLine4ToLong() { // F
		long x = 10;
		long y = 2 * x;
	}
}