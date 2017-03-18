package com.github.VickyWang.Proxy;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class RunnerProxy implements CanRun {
    private Runner runner;
    public RunnerProxy(Runner runner) {
        super();
        this.runner = runner;
    }

    private void beforeLog(){
        System.out.println(runner.getName()+"准备起跑");
    }

    private void afterLog(){
        System.out.println(runner.getName()+"完成比赛");
    }

    @Override
    public void run() {
        beforeLog();
        long begin = System.currentTimeMillis();
        runner.run();
        long end = System.currentTimeMillis();
        System.out.println(runner.getName()+"用了"+((end-begin)/1000)+"秒到达终点");
        afterLog();
    }

}