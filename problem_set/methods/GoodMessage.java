package problem_set.methods;

import java.time.LocalTime;
public class GoodMessage {
        public static void main(String[] args) {
            int hour = LocalTime.now().getHour();
            String message;

            message = switch (hour) {
                case 5, 6, 7, 8, 9, 10, 11 -> "Good morning!";
                case 12, 13, 14, 15, 16, 17 -> "Good afternoon!";
                default -> "Good evening!";
            };

            System.out.println(message);
        }
    }
