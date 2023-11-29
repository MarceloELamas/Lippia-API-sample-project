package api.model;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class timeEntryResponse {

    private String id;
    private String description;
    private List tagIds;
    private String userId;
    private boolean billable;
    private Object taskId;
    private String projectId;
    private String workspaceId;
    private TimeInterval timeInterval;
    private List customFieldValues;
    private String type;
    private Object kioskId;
    private HourlyRate hourlyRate;
    private CostRate costRate;
    private boolean isLocked;

}
