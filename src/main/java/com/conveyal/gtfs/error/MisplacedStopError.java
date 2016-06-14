package com.conveyal.gtfs.error;

import com.conveyal.gtfs.model.Stop;
import com.conveyal.gtfs.validator.model.Priority;

import java.io.Serializable;

/**
 * Created by landon on 5/11/16.
 */
public class MisplacedStopError extends GTFSError implements Serializable {
    public static final long serialVersionUID = 1L;

    public String affectedEntityId;
    public Priority priority;
    public Stop stop;

    public MisplacedStopError(String affectedEntityId, Stop stop) {
        super("stop", 0, "stop_id");
        this.affectedEntityId = affectedEntityId;
        this.priority = Priority.HIGH;
        this.stop = stop;
    }

    @Override public String getMessage() {
        return String.format("Stop Id %s is misplaced.", affectedEntityId);
    }
}
