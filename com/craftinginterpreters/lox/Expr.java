

abstract class Expr {
    interface Visitor<R> {
        // Visitor methods will be added as needed
    }
    
    abstract <R> R accept(Visitor<R> visitor);
}
