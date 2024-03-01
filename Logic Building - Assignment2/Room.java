/*Create a class "Room" which will hold the "height", "width" and "breadth" of the room
in three fields. This class also has a method "volume()" to calculate the volume of this
room. Create instances "Room" and display the volume of room.*/

class Room{
	float height=15.0f;
	float width=10.0f;
	float breadth=12.0f;
	public static void main(String[] args){
		Room r=new Room();
		r.VolumeOfRoom();
		System.out.println(r.VolumeOfRoom());
	}
	float VolumeOfRoom(){
		return height*width*breadth;
	
	}

}
		