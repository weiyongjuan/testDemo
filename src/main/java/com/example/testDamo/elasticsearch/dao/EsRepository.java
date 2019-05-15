package com.example.testDamo.elasticsearch.dao;

import com.example.testDamo.elasticsearch.bean.EsBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EsRepository extends ElasticsearchRepository<EsBean,Long> {

}
