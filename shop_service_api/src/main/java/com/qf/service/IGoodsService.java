package com.qf.service;

import com.qf.entity.Goods;

import java.util.List;

public interface IGoodsService {
    List<Goods> queryAllGoods();
    int addGoods(Goods goods);
    Goods queryById(int id);
}
