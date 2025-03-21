package Expr7;

abstract class Buff implements Component {
    Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component!=null)
            component.operation();
    }
}
