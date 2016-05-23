public class DataTypeConversion {

	byte x = 5;
	byte y = 10;

	public void asInt(){ // A
		int z = x+y;
	}

	public void asLong(){ // B
		long z= x+y;
	}

	public void asBoolean(){ // Invalid
		boolean z=x+y;
	}

	public void asDouble(){ // D
		double z=x+y;
	}

	public void asShort(){ // Invalid
		short z=x+y;
	}

	public void asByte(){ // Invalid
		byte z=x+y;
	}
}