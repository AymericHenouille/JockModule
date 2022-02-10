package com.chillycheesy.modulo.pages;

import com.chillycheesy.modulo.ModuloAPI;
import com.chillycheesy.modulo.MyAwesomeModule;
import com.chillycheesy.modulo.pages.subpages.ResourcePage;

public class MyAwesomeModulePageManager {

    public void registerPages(MyAwesomeModule module) {
        final PageManager pageManager = ModuloAPI.getPage().getPageManager();

        final ResourcePage jokePage = new ResourcePage("joke", "web");
        pageManager.registerItem(module, jokePage);
    }

}
