package com.gerasimchuk.interviewhelper.domain.repository;

import com.gerasimchuk.interviewhelper.domain.document.InterviewItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface InterviewItemRepository extends ElasticsearchRepository<InterviewItem,String> {

}
