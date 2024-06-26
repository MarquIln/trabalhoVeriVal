package org.example;

import java.time.Duration;

public class Park {
    private double TarifaFixa = 5.9;
    private double addTarifa = 2.5;
    private Duration LimitedStay = Duration.ofHours(2);

    public double calculate(Client client) {
        Duration duration = Duration.between(client.getTimeEntry(), client.getTimeExit());
        long stayedMinutes = duration.toMinutes();

        if (stayedMinutes <= 15) {
            return 0;
        }

        if (client.getTimeEntry().toLocalDate().isEqual(client.getTimeExit().toLocalDate())) {
            if (duration.compareTo(LimitedStay) <= 0) {
                return client.isVip() ? TarifaFixa * 0.5 : TarifaFixa;
            }

            long extendedHours = (stayedMinutes - LimitedStay.toMinutes() + 59) / 60;
            double tariff = client.isVip() ? TarifaFixa * 0.5 : TarifaFixa;
            tariff += extendedHours * addTarifa;
            return tariff;
        } else {
            return client.isVip() ? 50 * 0.5 : 50;
        }
    }
}