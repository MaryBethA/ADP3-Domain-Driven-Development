package za.ac.cput.repository;

import za.ac.cput.Entity.FlightRoute;

import java.util.Set;

public interface IFlightRouteRepository extends IRepository<FlightRoute,String> {

    public Set<FlightRoute> getAll();
}
