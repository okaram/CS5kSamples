package ksu.cs5000.spring17.Mar15;


public class Main {
    public static double sumOfPrices(Product[] products) {
        double sum =0;
        for(Product p : products) {
            sum += p.price;
        }
        return sum;
    }

    static double highestPrice(Product[] products) {
        double high=products[0].price;
        for(Product p : products) {
            if(p.price>high)
                high=p.price;
        }
        return high;
    }

    static Product highestPricedProduct(Product[] products) {
        Product high=products[0];
        for(Product p : products) {
            if(p.price > high.price)
                high=p;
        }
        return high;
    }

    public static void nomain(String args[]) {
        Product p1=new Product("P1", 1.1);
        Product p2=new Product("P2", 2.2);
        Product []products={p1,p2, new Product("p3",-3.3)};

        System.out.println(sumOfPrices(products));
        System.out.println(highestPrice(products));
        System.out.println(highestPricedProduct(products));
        System.out.println(highestPricedProduct(products).price);
    }

    static int addAllElements(int [] array) {
        int sum=0;
        for(int num : array) {
            sum+=num;
        }
        return sum;
    }

    static int addAllElements(int [][]matrix) {
        int sum=0;
        for( int [] row : matrix) {
/*            for(int num : row) {
                sum+=num;
            }
*/
            sum += addAllElements(row);
        }
        return sum;
    }

    static int smallestElement(int [][]matrix) {
        int low=matrix[0][0];
        for( int [] row : matrix) {
            for(int num : row) {
                if(num < low)
                    low = num;
            }
        }
        return low;
    }

    public static void main2(String args[]) {
        int [] [] matrix= {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println( matrix.length );
        System.out.println( addAllElements(matrix));
        System.out.println( smallestElement(matrix));
    }

    public static void main(String args[]) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(22);
        s.push(222);
        System.out.println(s);
        System.out.println(s.top());
    }
}
