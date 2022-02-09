package com.chillycheesy.modulo.pages;

import com.chillycheesy.modulo.ModuloAPI;
import com.chillycheesy.modulo.MyAwesomeModule;
import com.chillycheesy.modulo.pages.subpages.ResourcePage;

public class MyAwesomeModulePageManager {

    public void registerPages(MyAwesomeModule module) {
        final PageManager pageManager = ModuloAPI.getPage().getPageManager();

        final Page jock = new Page("jock", "Pas de Benoit ici :c ...");
        final ResourcePage resourcePage = new ResourcePage("benoit", "web");
        jock.addSubPage(resourcePage);
        pageManager.registerItem(module, jock);
    }

}
