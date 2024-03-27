package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 22, 0));
        Client client2 = new Client(false, LocalDateTime.of(2022, 1, 1, 18, 0, 0), LocalDateTime.of(2022, 1, 2, 10, 0, 0));
        Client client3 = new Client(true, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 15, 0));

        Park park = new Park();

        System.out.println(park.calculate(client));
        System.out.println(park.calculate(client2));
        System.out.println(park.calculate(client3));
    }
}
