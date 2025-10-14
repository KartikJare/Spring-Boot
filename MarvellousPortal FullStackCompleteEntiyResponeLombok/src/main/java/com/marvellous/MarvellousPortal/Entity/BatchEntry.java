package com.marvellous.MarvellousPortal.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")

@Data
public class BatchEntry
{
    private ObjectId id;
    private  String name;
    private int fees;
}
