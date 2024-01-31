package com.engeto.ja.computers;

import java.time.LocalDate;

public final class Room {
    private final int roomNumber;
    private final int capacity;
    private final boolean balcony;
    private final int price;
    private final boolean seaview;

    public Room(int roomNumber, int capacity, boolean balcony, int price, boolean seaview) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.balcony = balcony;
        this.price = price;
        this.seaview = seaview;
    }

//    public Room() {int roomNumber = 0, int capacity, boolean hasBalcony, boolean hasSeaview, int price);{
//        this.roomNumber = roomNumber;
//        this.capacity = capacity;
//        this.balcony = hasBalcony;
//        this.seaview = hasSeaview;
//        this.price = price;
}