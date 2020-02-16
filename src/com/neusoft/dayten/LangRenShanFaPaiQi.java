package com.neusoft.dayten;

import java.util.*;

/**
 * Created by lan_jia_nao on 2020/2/13.
 */
public class LangRenShanFaPaiQi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("人数规定：12到18人");
        int player = scanner.nextInt();
        if (player < 12 || player > 18) {
            System.out.println("超出游戏人数范围，请在12到18之间选择");
        } else {
            List<String> all = new ArrayList<>();
            List<String> play = new ArrayList<>();
            List<String> di = new ArrayList<>();
            ja(all);
            jja(all, player);
            all.remove("盗贼");
            play.add("盗贼");
            jd(all,di);
            play.addAll(all);
            Collections.shuffle((play));
            System.out.println("手牌"+play);
            System.out.println("底牌"+di);

        }
    }

    public static void ja(List<String> all) {
        for (int i = 0; i < 4; i++) {
            all.add("狼人");
        }
        for (int i = 0; i < 4; i++) {
            all.add("村民");
        }
        all.add("预言家");
        all.add("女巫");
        all.add("丘比特");
        all.add("守护");
        all.add("猎人");
        all.add("村长");
        all.add("盗贼");
    }

    public static void jja(List<String> all, int player) {
        if (player > 12)
            all.add("村民");
        if (player > 13)
            all.add("替罪羊");
        if (player > 14)
            all.add("狼人");
        if (player > 15)
            all.add("村民");
        if (player > 16)
            all.add("村民");
        if (player > 17)
            all.add("吹笛者");
    }

    public static void jd(List<String> all, List<String> di) {
        while (di.size() < 3) {
            Random random = new Random();
            int index = random.nextInt(all.size());
            if (di.contains("狼人") && all.get(index).equals("狼人"))
                continue;
            else
                di.add(all.remove(index));

        }
    }
}
