package com.qf.service;

import com.qf.entity.Goods;

import java.util.List;

public interface ISearchService {
    List<Goods> searchByKeyWord(String keyWord);
    int addGoods(Goods goods);
}
