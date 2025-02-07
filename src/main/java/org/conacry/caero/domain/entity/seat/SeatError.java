package org.conacry.caero.domain.entity.seat;


import org.conacry.caero.domain.primitive.exception.CodedException;

public final class SeatError {
    public static final String SEAT_NUMBER_VALUE_IS_REQUIRED = "3d1f50e6-001";
    public static final String ILLEGAL_SEAT_NUMBER_VALUE = "3d1f50e6-002";
    public static final String SEAT_ID_VALUE_IS_REQUIRED = "3d1f50e6-003";
    public static final String ILLEGAL_SEAT_ID_VALUE = "3d1f50e6-004";

    public static CodedException errSeatNumberValueIsRequired() {
        var errMsg = "Value to create SeatNumber is required";
        return new CodedException(SEAT_NUMBER_VALUE_IS_REQUIRED, errMsg);
    }

    public static CodedException errIllegalSeatNumberValue(String value) {
        var errMsg = String.format("Illegal value = '%s' format to create SeatNumber", value);
        return new CodedException(ILLEGAL_SEAT_NUMBER_VALUE, errMsg);
    }

    public static CodedException errSeatIDValueIsRequired() {
        var errMsg = "Value to create SeatID is required";
        return new CodedException(SEAT_ID_VALUE_IS_REQUIRED, errMsg);
    }

    public static CodedException errIllegalSeatIDValue(String valueStr, Throwable cause) {
        var errMsg = String.format("Illegal value = '%s' format to create SeatID", valueStr);
        return new CodedException(ILLEGAL_SEAT_ID_VALUE, errMsg, cause);
    }

    private SeatError() {
    }
}
