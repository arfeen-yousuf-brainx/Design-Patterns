package mypackage;

import java.util.ArrayList;

public class Composite {

}

interface UIComponent {
    void render();

    default void onTap() {
    }
}

class Button implements UIComponent {
    String text;

    public Button(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        // Draws a button
    }

    @Override
    public void onTap() {
        System.out.println("You pressed " + text);
    }
}

class Text implements UIComponent {
    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        // Draws a button
    }
}

class CompositeUIComponent implements UIComponent {
    String tag;
    ArrayList<UIComponent> children = new ArrayList<>();

    public CompositeUIComponent(String tag){
        this.tag = tag;
    }

    @Override
    public void render() {
        for (UIComponent child : children)
            child.render();
    }

    @Override
    public void onTap() {
        System.out.println("You tapped on " + tag);
        for (UIComponent child : children)
            child.render();
    }
}