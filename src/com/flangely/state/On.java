package com.flangely.state;

/**
 * @program design-pattern
 * @description: 打开开关
 * @author: flangely
 * @create: 2019/09/15 10:49
 */
public class On implements State {
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("WARN!!!通电状态无需再开");
    }

    @Override
    public void switchOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("OK!!!灯灭");
    }
}