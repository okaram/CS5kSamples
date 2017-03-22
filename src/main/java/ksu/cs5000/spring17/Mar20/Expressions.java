package ksu.cs5000.spring17.Mar20;


public class Expressions {

    interface IExpression {
        double getValue();
        String prefixToString();
        String infixToString();
    }

    public static class Constant implements IExpression {
        private double value;
        public Constant(double value) {
            this.value=value;
        }
        public double getValue() {
            return value;
        }
        public String prefixToString(){
            return ""+value;
        }
        public String infixToString(){
            return ""+value;
        }
    }

    public static abstract class BinaryOperator implements IExpression{
        protected IExpression left, right;
        protected String operator;

        public BinaryOperator(String operator, IExpression left, IExpression right) {
            this.operator=operator;
            this.left=left;
            this.right=right;
        }
        public abstract double getValue();
        public String prefixToString() {
            return operator+"( " + left.prefixToString() + ", "+right.prefixToString()+" )";
        }
        public String infixToString() {
            return "( " + left.infixToString() + " "+operator+ " "+right.infixToString()+" )";
        }

    }
    public static class Plus extends BinaryOperator {
        public Plus(IExpression left, IExpression right) {
            super("+",left,right);
        }

        @Override
        public double getValue() {
            return left.getValue()+right.getValue();
        }
    }

    public static class Minus extends BinaryOperator {
        public Minus(IExpression left, IExpression right) {
            super("-",left,right);
        }

        @Override
        public double getValue() {
            return left.getValue()-right.getValue();
        }
    }

    public static class Times extends BinaryOperator {
        public Times(IExpression left, IExpression right) {
            super("*",left,right);
        }

        @Override
        public double getValue() {
            return left.getValue()*right.getValue();
        }
    }

    public static void main(String args[]) {
        IExpression expression=new Plus(
                new Minus(new Constant(3), new Constant(7)),
                new Constant(5));
        System.out.println( expression.infixToString());
        System.out.println( expression.getValue());
    }
}
