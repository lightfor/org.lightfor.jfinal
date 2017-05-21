package org.lightfor.jfinal;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.template.Engine;

/**
 * global config
 * Created by Light on 2017/3/16.
 */
public class Config extends JFinalConfig {

    public void configConstant(Constants me) {
        me.setDevMode(true);
    }
    public void configRoute(Routes me) {
        me.setBaseViewPath("/WEB-INF/views");
        //me.add("/", GenCodeController.class);
    }
    public void configEngine(Engine me) {}
    public void configPlugin(Plugins me) {}
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler("ctx"));
    }

}
