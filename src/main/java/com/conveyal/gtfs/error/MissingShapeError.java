package com.conveyal.gtfs.error;

import com.conveyal.gtfs.validator.model.Priority;

import java.io.Serializable;

/**
 * Created by landon on 5/6/16.
 */
public class MissingShapeError extends GTFSError implements Serializable {
    public static final long serialVersionUID = 1L;

    public Priority priority = Priority.MEDIUM;
    public String tripId;

    public MissingShapeError(String tripId) {
        super("trip", 0, "shape_id");
        this.tripId = tripId;
    }

    @Override public String getMessage() {
        return "Trip " + tripId + " is missing a shape";
    }
}
