package api.model;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TimeInterval {
    private Date start;
    private Date end;
    private String duration;
}
