import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.example.Client;
import org.example.Park;
import org.junit.jupiter.api.Test;

public class ParkTest {
  @Test
  public void testCalculate10hoursNonVip() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 22, 0));
    Park park = new Park();
    assertEquals(25.9, park.calculate(client), 0.01);
  }

  @Test
  public void testPernoiteNonVip() {
    Client client = new Client(false, LocalDateTime.of(2022, 1, 1, 18, 0, 0), LocalDateTime.of(2022, 1, 2, 10, 0, 0));
    Park park = new Park();
    assertEquals(50, park.calculate(client), 0.01);
  }

  @Test
  public void testPernoiteVip() {
    Client client = new Client(true, LocalDateTime.of(2022, 1, 1, 18, 0, 0), LocalDateTime.of(2022, 1, 2, 10, 0, 0));
    Park park = new Park();
    assertEquals(25, park.calculate(client), 0.01);
  }

  @Test
  public void testCalculate3hours() {
    Client client = new Client(true, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 15, 0));
    Park park = new Park();
    assertEquals(5.45, park.calculate(client));
  }

  @Test
  public void testCalculate15min() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 12, 15));
    Park park = new Park();
    assertEquals(0, park.calculate(client));
  }

  @Test
  public void testCalculate2hours() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 14, 0));
    Park park = new Park();
    assertEquals(5.9, park.calculate(client));
  }

  @Test
  public void testCalculate16min() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 12, 16));
    Park park = new Park();
    assertEquals(5.9, park.calculate(client));
  }

  @Test
  public void testCalculate2hours1min() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 14, 1));
    Park park = new Park();
    assertEquals(8.4, park.calculate(client));
  }

  @Test
  public void testCalculate2hours59min() {
    Client client = new Client(false, LocalDateTime.of(2021, 1, 1, 12, 0), LocalDateTime.of(2021, 1, 1, 14, 59));
    Park park = new Park();
    assertEquals(8.4, park.calculate(client));
  }
}
