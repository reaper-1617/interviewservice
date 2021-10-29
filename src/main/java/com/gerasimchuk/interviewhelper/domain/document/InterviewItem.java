package com.gerasimchuk.interviewhelper.domain.document;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Document(indexName = "interview")
@Data
public class InterviewItem {

    @Id
    private String id;
    String question;
    String answer;
    List<String> tags;
    float rate;

}