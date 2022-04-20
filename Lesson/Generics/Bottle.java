package Lesson.Generics;

public class Bottle<T extends Drink> {
    private T content;

    public boolean isEmpty() {
        return content == null;
    }

    public fill(Drink drink) {
        if(!isEmpty) throw new IllegalStateException();
        content = drink;
    }

    public T empty() {
        return content;
    }
}
