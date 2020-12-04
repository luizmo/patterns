package patterns;
import java.util.Calendar;

public class SystemClock implements Clock {
    @Override
    public Calendar current() {
        return Calendar.getInstance();
    }
    
}
