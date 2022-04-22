package philosophyjava.examples.example22;

abstract class GenericWithCreate<T> {
    final T element;

    public GenericWithCreate() {
        this.element = create();
    }

    protected abstract T create();
}
