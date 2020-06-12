package org.launchcode.finalproject.data;

import org.launchcode.finalproject.models.SpendingTracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingTrackerRepository extends CrudRepository<SpendingTracker, Integer> {
}
