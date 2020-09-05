public class RoomCarpet {

   RoomDimension size = new RoomDimension();
   double carpetCost;
   
   public RoomCarpet() {
   }
   
   //Calculate total cost of carpet
   double totalCost() {
      return(size.getArea() * carpetCost);
   }
}