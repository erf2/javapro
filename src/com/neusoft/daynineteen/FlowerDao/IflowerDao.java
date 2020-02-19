package com.neusoft.daynineteen.FlowerDao;

import com.neusoft.daynineteen.pojo.Flower;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public interface IflowerDao {
    List<Flower> query();
    int buy(Flower flower);
    int  sell(int id);
    int exchange(Flower flower);
    void quit();
}
