package com.neusoft.daynineteen.FlowerTest;

import com.neusoft.daynineteen.FlowerUtil.FlowerUtil;
import com.neusoft.daynineteen.FlowerWeb.FlowerWeb;
import com.neusoft.daynineteen.pojo.Flower;

import java.util.List;

/**
 * Created by lan_jia_nao on 2020/2/19.
 */
public class FlowerTest {
    public static void main(String[] args) {
        /*FlowerWeb flowerWeb = new FlowerWeb();
        flowerWeb.showmenue();
        flowerWeb.input();*/
        List<Flower> list = FlowerUtil.executeQuery("select id,name,color.weather,no from flower", Flower.class);
        System.out.println(list);
    }
}
