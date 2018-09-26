package com.csse.cssebackend.service;

import java.util.List;
import com.csse.cssebackend.model.*;

public interface JourneyService {

	List<Journey> getall();
	Journey addJourney(Journey s);
}
