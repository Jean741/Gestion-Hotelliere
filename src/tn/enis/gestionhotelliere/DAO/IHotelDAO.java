package tn.enis.gestionhotelliere.DAO;

import java.util.List;

import tn.enis.gestionhotelliere.entites.Hotel;

public interface IHotelDAO {

	public void addHotel(Hotel hotel);

	public Hotel getHotel(int id);

	public List<Hotel> getHotels();

	public void deleteHotel(int id);

	public void updateHotel(int id);
}
