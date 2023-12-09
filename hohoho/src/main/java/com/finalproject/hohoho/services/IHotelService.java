package com.finalproject.hohoho.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.finalproject.hohoho.dto.Hotel;
import com.finalproject.hohoho.dto.Services;
import com.finalproject.hohoho.dto.Town;

public interface IHotelService {
	// CRUD models
	public List<Hotel> list(); // List all Hotels
	
	public Page<Hotel> listPageHotels(Pageable pageable); // List all hotels paginated
	public Page<Hotel> listPageHotelsByTown(Pageable pageable, Town town); // List hotels by town paginated
	public Page<Hotel> listPageHotelsBySearch(Pageable pageable, String search); // List hotels by search paginated
	public Page<Hotel> listPageHotelsByStarRatingAvg(Pageable pageable, Integer minStarRatingAvg); // List hotels by minimum StarRating Average paginated
	public Page<Hotel> listPageHotelsByMinNumberRooms(Pageable pageable, Integer minNumberRooms); // List hotels by minNumberRooms paginated
	public Page<Hotel> listPageHotelsByPrice(Pageable pageable, Integer minPrice); // List hotels by min price paginated
	public Page<Hotel> listPageHotelsByPrice(Pageable pageable, Integer minPrice,  Integer maxPrice); // List hotels by price range paginated
	public Page<Hotel> listPageHotelsByServices(Pageable pageable, List<Services> services); // List hotels by services paginated
	
	public Hotel save(Hotel hotel); // (CREATE)

	public Hotel byId(int id); // (READ)

	public Hotel update(Hotel hotel); // (UPDATE)

	public void delete(int id);// (DELETE)
}
