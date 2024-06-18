package nofactory;

class PantoneColor implements Color {
	  private final Color origin;
	  
	  PantoneColor(Color color) {
	    this.origin = color;
	  }
	  
	  @Override
	  public Color lighter() {
	    final Color next;
	    if (this.origin.hex() == 0xBF1932) {
	      next = new RGBColor(1,2,3);
	    } else {
	      next = this.origin.lighter();
	    }
	    return new PantoneColor(next);
	  }
	  
	  @Override
	  public int hex() {
		return this.origin.hex();
	  }
}
	
