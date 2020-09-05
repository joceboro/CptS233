public class RoomCarpet {

   RoomDimension size = new RoomDimension();
   double carpetCost;
   
   public RoomCarpet() {
   }
   
   double totalCost() {
      return(size.getArea() * carpetCost);
   }
}