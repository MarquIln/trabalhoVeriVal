package org.example;

import java.time.LocalDateTime;

public class Client {
    private boolean Vip;
    private LocalDateTime entry;
    private LocalDateTime exit;

    public Client(boolean Vip, LocalDateTime entry, LocalDateTime exit) {
        this.Vip = Vip;
        this.entry = entry;
        this.exit = exit;
    }

    public boolean isVip() {
        return Vip;
    }

    public LocalDateTime getTimeEntry() {
        return entry;
    }

    public LocalDateTime getTimeExit() {
        return exit;
    }
}
