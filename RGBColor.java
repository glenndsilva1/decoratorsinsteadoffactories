package nofactory;

class RGBColor implements Color {
	  private final Color origin;
	  RGBColor(int red, int green, int blue) {
	    this.origin = new HexColor(red , green, blue);
	  }
	  
	@Override
	public Color lighter() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int hex() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
