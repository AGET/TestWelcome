package com.aldo.aget.testwelcome;

import com.stephentuso.welcome.WelcomeScreenBuilder;
import com.stephentuso.welcome.ui.WelcomeActivity;
import com.stephentuso.welcome.util.WelcomeScreenConfiguration;

/**
 * Created by Work on 12/07/16.
 */

public class TestWelcomeActivity extends WelcomeActivity {
    //.theme(R.style.WelcomeScreenTheme_Light)
    @Override
    protected WelcomeScreenConfiguration configuration() {
        return new WelcomeScreenBuilder(this)
                .theme(R.style.WelcomeScreenTheme)
                .defaultTitleTypefacePath("Montserrat-Bold.ttf")
                .defaultHeaderTypefacePath("Montserrat-Bold.ttf")
                .defaultBackgroundColor(R.color.default_background_color)
                .titlePage(R.drawable.photo, "Titulo",R.color.blue_background)
                .basicPage(R.drawable.photo, "Una cabecera", "Texto aleatorio.", R.color.colorAccent)
                .basicPage(R.drawable.photo, "Otras cosas", "Mas texto.",R.color.orange_background)
                .parallaxPage(R.layout.parallax, "Simple parallax", "Texto informativo ...", R.color.purple_background, 0.2f, 2f)
                .swipeToDismiss(true)
                .build();
    }
}
