package com.chillycheesy.modulo;

import com.chillycheesy.modulo.modules.ModuleAdapter;
import com.chillycheesy.modulo.pages.MyAwesomeModulePageManager;

public class JokeModule extends ModuleAdapter {

    private MyAwesomeModulePageManager pageManager;

    @Override
    protected void onLoad() {
        pageManager = new MyAwesomeModulePageManager();
    }

    @Override
    protected void onStart() {
        pageManager.registerPages(this);
    }

}
