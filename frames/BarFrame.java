package frames;

import models.Language;

import javax.swing.*;

public class BarFrame extends JFrame {


    public Language language;
    public BarRouter router;
    public BarLanguages currentLanguage;
    public BarDataProvider dataProvider;
    public BarFrame(){
        super("Bar ZanzibarS");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 700);
        this.language = Language.BULGARIAN;
        dataProvider = new BarDataProvider();
        router = new BarRouter(this);
        currentLanguage = new BarLanguages(this);
        router.showLogin(); //shows the first screen
    }
}
