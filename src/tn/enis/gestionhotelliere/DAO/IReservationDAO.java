package tn.enis.gestionhotelliere.DAO;

import java.util.List;

import tn.enis.gestionhotelliere.entites.Reservation;

public interface IReservationDAO {

	public void addReservation(Reservation reservation);

	public Reservation getReservation(int id);

	public List<Reservation> getReservations();

	public List<Reservation> getReservationByClient(String email);

	public void deleteReservation(int id);

	public void updateReservation(int id);

}
