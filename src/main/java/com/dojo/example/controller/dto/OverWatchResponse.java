package com.dojo.example.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "data"
})
public class OverWatchResponse
{
    @JsonProperty("data")
    private List<Datum> data = null;

    /**
     * No args constructor for use in serialization
     */
    public OverWatchResponse()
    {
    }

    /**
     * @param data
     */
    public OverWatchResponse(List<Datum> data)
    {
        super();
        this.data = data;
    }

    @JsonProperty("data")
    public List<Datum> getData()
    {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).append("data", data).toString();
    }

}
