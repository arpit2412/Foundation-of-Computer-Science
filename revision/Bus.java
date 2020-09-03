class Bus{
	private int busId;
	private int capacity;
	private int numberOfSeatsAvaliable;
	private boolean busIsAvailable;
	private int seats[];
	private int seatno =0;

	Bus(){
		busId = 0;
		capacity = 0;
		numberOfSeatsAvaliable = 0;
		busIsAvailable = true;
	}

	Bus(int busId, int capacity, int numberOfSeatsAvaliable, boolean busIsAvailable, int[] seats){
		this.busId = busId;
		this.capacity = capacity;
		this.numberOfSeatsAvaliable = numberOfSeatsAvaliable;
		this.busIsAvailable = busIsAvailable;
		this.seats = seats;
	}
	public void setbusId(int id){
		this.busId = busId;
	}
	public int getbusId(){
		return this.busId;
	}
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return this.capacity;
	}
	public void setnumberOfSeatsAvaliable(int numberOfSeatsAvaliable){
		this.numberOfSeatsAvaliable = numberOfSeatsAvaliable;
	}
	public int getnumberOfSeatsAvaliable(){
		return this.numberOfSeatsAvaliable;
	}
	public void setbusIsAvailable(boolean busIsAvailable){
		this.busIsAvailable = busIsAvailable;
	}
	public boolean getbusIsAvailable(){
		return this.busIsAvailable;
	}

	public void setSeats(int seats[]){
		this.seats = seats;
	}

	public int[] getSeats(){
		return this.seats;
	}

	public int booking(){
		if(busIsAvailable){
			busId++;
			if(numberOfSeatsAvaliable<=capacity && numberOfSeatsAvaliable!=0){
				seatno++;
				return seats[seatno];
			}else{
				return -1;
			}
		}else{
			busId++;
			return -1;
		}

	}
	public void cancel(){
		seatno--;
		numberOfSeatsAvaliable++;
	}

	
}