package api.model;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class updateTimeEntryResponse {
    public String id;
    public String description;
    public Object tagIds;
    public String userId;
    public boolean billable;
    public Object taskId;
    public Object projectId;
    public TimeInterval timeInterval;
    public String workspaceId;
    public boolean isLocked;
    public List<Object> customFieldValues;
    public String type;
    public Object kioskId;
}
