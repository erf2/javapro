package com.neusoft.daynineteen.FlowerService;

import com.neusoft.daynineteen.FlowerDao.FlowerDao;
import com.neusoft.daynineteen.FlowerDao.IflowerDao;
import com.neusoft.daynineteen.pojo.Flower;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class FlowerService implements IflowerService {
    IflowerDao flowerDao = new FlowerDao();
    @Override
    public List<Flower> query() {
        return flowerDao.query();
    }

    @Override
    public int buy(Flower flower) {
        return flowerDao.buy(flower);
    }

    @Override
    public int sell(int id) {
        return flowerDao.sell(id);
    }

    @Override
    public int exchange(Flower flower) {
        return flowerDao.exchange(flower);
    }

    @Override
    public void quit() {

    }
}
