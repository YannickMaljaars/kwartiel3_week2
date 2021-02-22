package nl.saxion.oop.week2.model;

import java.util.ArrayList;

public class Airplane {
    private int passengerCount;
    private boolean doorsLocked = false;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int maxWeight;
    private int totalLuggageWeight;
    private boolean hasDeparted = false;

    public Airplane(int passengerCount) {
        this.passengerCount = passengerCount;
        this.maxWeight = passengerCount * 25;
    }

    public void boardPassenger(Passenger p) {
        if(hasLockedDoors()){
            throw new IllegalStateException("Doors are locked!");
        }
        if(passengers.size() == passengerCount){
            throw new IllegalArgumentException("No seats left!");
        }
        if (p.getTotalLuggageWeight() > maxWeight) {
            throw new IllegalArgumentException("Too much weight!");
        }
        passengers.add(p);
        totalLuggageWeight = totalLuggageWeight + p.getTotalLuggageWeight();

    }

    public void lockDoors() {
        doorsLocked = true;
    }

    public void unlockDoors(){
        doorsLocked = false;
    }

    public boolean hasLockedDoors(){
        return doorsLocked;
    }

    public void depart() {
        if(!hasLockedDoors()) {
            throw new IllegalStateException("The doors are not locked!");
        }
        if(hasDeparted) {
            throw new IllegalStateException("Plane has already departed!");
        }
        hasDeparted = true;
    }
}
