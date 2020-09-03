class Seat extends Bus{
	private int seatId;
	private boolean isReserved;
	private String passengerName;
	private int counter = 0;
	private int seat;

	Seat(){
		seatId = 0;
		isReserved = false;
		passengerName = null;
	}

	Seat(int seatId, boolean isReserved, String passengerName){
		this.seatId = seatId;
		this.isReserved = isReserved;
		this.passengerName = passengerName;
	}

	public void setSeatId(int seatId){
		this.seatId = seatId;
	}

	public int getSetId(){
		return this.seatId;
	}

	public void setisReserved(boolean isReserved){
		this.isReserved = isReserved;
	}
	public boolean getisReserved(){
		return this.isReserved;
	}

	public void setPassangerName(String passengerName){
		this.passengerName = passengerName;
	}
	public String getPassangerName(){
		return this.passengerName;
	}

	public void booking(String passengerName){
		if(!getisReserved()){
			setPassangerName(passengerName);
			setSeatId(counter++);
			setisReserved(true);
			seat = super.booking();
		}
	}

	public void cancel(){
		setisReserved(false);
		super.cancel();
	}
}