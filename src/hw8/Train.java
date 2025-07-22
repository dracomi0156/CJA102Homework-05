package hw8;

public class Train implements Comparable<Train> {
	int number;
	String type;
	String start;
	String dest;
	double price;
	
	public Train() {}
	
	public Train(int number, String type, String start, String dest, double price) {
		this.type = type;
		this.start = start;
		this.dest = dest;
		setNumber(number);
		setPrice(price);
		
	}
	
	//getter
	public int getNumber() {
		return this.number;
	}
	public String getType() {
		return this.type;
	}
	public String getStart() {
		return this.start;
	}
	public String getDest() {
		return this.dest;
	}
	public double getPrice() {
		return this.price;
	}
	
	//setter
	public void setNumber(int number) {
		if(number > 0)
			this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public void setPrice(Double price) {
		if(price > 0)
			this.price = price;
	}

	public void printInfo() {
		System.out.print("Number: " + number + "\t Type: " + type + "\t Start: " + start);
		System.out.println("\t Destination: " + dest + "\t Price: " + price );
	}
	
	//override compareTo
	public int compareTo(Train t) {
		if (this.number > t.number) {
			return 1;
		} else if (this.number == t.number) {
			return 0;
		} else {
			return -1;
		}
	}
	
	
	//override equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj != null && this.getClass() == obj.getClass()) {
			if (obj instanceof Train t) {
				if (this.number == t.number && this.type == type && this.start == start 
				&& this.dest == dest && this.price == price)
					return true;
			}
		}
		return false;
		
	}
	
	//override hashCode
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result = prime * result + number;
		result = prime * result + (int)price;
		result = prime * result + (type == null ? 0 : type.hashCode());
		result = prime * result + (start == null ? 0 : start.hashCode());
		result = prime * result + (dest == null ? 0 : dest.hashCode());
		
		return result;
	}
	
}
