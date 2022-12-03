import Planes.experimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> planes;



    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> planeList = this.planes;
        List<PassengerPlane> passengerPlane = new ArrayList<>();
        for (Plane plane : planeList) {if (plane instanceof PassengerPlane) {passengerPlane.add((PassengerPlane) plane);}}
        return passengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes)
            if (plane instanceof MilitaryPlane) militaryPlanes.add((MilitaryPlane) plane);
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++)
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity())
                planeWithMaxCapacity = passengerPlanes.get(i);

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++)
        if (militaryPlanes.get(i).getType() == MilitaryType.TRANSPORT)
             transportMilitaryPlanes.add(militaryPlanes.get(i));

    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++)
            if (militaryPlanes.get(i).getType() == MilitaryType.BOMBER)
                bomberMilitaryPlanes.add(militaryPlanes.get(i));

        return bomberMilitaryPlanes;
    }

    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes)
            if (plane instanceof experimentalPlane)
                experimentalPlanes.add((experimentalPlane) plane);

        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, Comparator.comparingInt(Plane::GetMaxFlightDistance));
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        Collections.sort(planes, Comparator.comparingInt(Plane::getMaxSpeed));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, Comparator.comparingInt(Plane::getMinLoadCapacity));
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }


    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
