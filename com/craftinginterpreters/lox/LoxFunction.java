

import java.util.List;

class LoxFunction implements LoxCallable {
    @Override
    public int arity() {
        return 0;
    }
    
    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        return null;
    }
}
