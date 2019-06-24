package composition;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Belvedere", "Warszawa, ul.Matejki");

        Room room1 = new Room("11", 1);
        Room room2 = new Room("14", 1);
        Room room3 = new Room("21", 2);
        Room room4 = new Room("35", 3);

        TV tv1 = new TV("111-ABC", "Panasonic", 32, "4K");
        TV tv2 = new TV("222-DEF", "Sony", 48, "HD");

        AirConditioner airConditioner1 = new AirConditioner("333-ABC", "LG 1234", 3500, 60);
        AirConditioner airConditioner2 = new AirConditioner("444-ZSD", "GRE P6", 3000, 55);

        Restaurant restaurant = new Restaurant("Apetit", "08:00-16:00");

        room1.setTv(tv1);
        room1.getAirConditioner(airConditioner1);
        room2.setTv(tv2);
        room3.setAirConditioner(airConditioner2);
        hotel.setRooms(new Room[]{room1, room2, room3, room4});
        hotel.setRestaurant(restaurant);
        restaurant.setHotel(hotel);

        System.out.println(hotel);
    }
}
