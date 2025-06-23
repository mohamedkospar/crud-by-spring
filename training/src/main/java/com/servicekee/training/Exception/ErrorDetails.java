package com.servicekee.training.Exception;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;
@Data

public class ErrorDetails {
    public String message;
    public String url;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss" , timezone = JsonFormat.DEFAULT_LOCALE)
    public Date timeStamp =new Date(System.currentTimeMillis());

    public ErrorDetails(Date timeStamp, String message, String url) {

        this.timeStamp = timeStamp;
        this.message = message;
        this.url =url;

    }
}
