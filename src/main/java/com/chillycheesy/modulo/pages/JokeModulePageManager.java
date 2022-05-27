package com.chillycheesy.modulo.pages;

import com.chillycheesy.modulo.ModuloAPI;
import com.chillycheesy.modulo.JokeModule;
import com.chillycheesy.modulo.pages.natif.ResourcePage;

public class JokeModulePageManager {

    public void registerPages(JokeModule module) {
        final PageManager pageManager = ModuloAPI.getPage().getPageManager();

        final ResourcePage jokePage = new ResourcePage("joke", "web");
        pageManager.registerItem(module, jokePage);
    }

}
