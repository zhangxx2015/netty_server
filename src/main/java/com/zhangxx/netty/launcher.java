package com.zhangxx.netty;

import com.zhangxx.netty.RESTServer;

public class launcher {
    public static void main(String[] args) {
        RESTServer server = new RESTServer(8088);
        server.start();
    }
}
