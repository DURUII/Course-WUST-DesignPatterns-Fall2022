package Expr1;

/**
 * provide one and only one instance of an object
 * @param <T>
 */
public interface Resource<T> {
    T getParameter();
    void setParameter(T t);
}
