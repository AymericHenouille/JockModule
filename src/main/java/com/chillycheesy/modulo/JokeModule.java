package com.chillycheesy.modulo;

import com.chillycheesy.modulo.modules.Module;
import com.chillycheesy.modulo.pages.JokeModulePageManager;

public class JokeModule extends Module {

    private JokeModulePageManager pageManager;

    @Override
    protected void onLoad() {
        pageManager = new JokeModulePageManager();
    }

    @Override
    protected void onStart() {
        pageManager.registerPages(this);
    }

    @Override
    protected void onStop() { }
}
