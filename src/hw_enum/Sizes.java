package hw_enum;

public enum Sizes {
    XS(44){
        public void getDescription(){
            System.out.println("44 size");
        }
    },
    S(46){
        public void getDescription(){
            System.out.println("46 size");
        }
    },
    M(48){
        public void getDescription(){
            System.out.println("48 size");
        }
    },
    L(50){
        public void getDescription(){
            System.out.println("50 size");
        }
    },
    XL(52){
        public void getDescription(){
            System.out.println("52 size");
        }
    },
    XXL(54){
        public void getDescription(){
            System.out.println("54 size");
        }
    };

    int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    abstract void getDescription();
}
