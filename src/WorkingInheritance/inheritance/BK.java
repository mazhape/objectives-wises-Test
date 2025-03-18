package WorkingInheritance.inheritance;

class AK {
    AK() {
        print();  // Calls overridden method in BK
    }

    void print() {
        System.out.print("AK ");
    }
}

class BK extends AK {
    int i = 4;

    public static void main(String[] args) {
        AK a = new BK();
        a.print(); // Calls BK's print()
    }

    void print() {
        System.out.print(i + " ");
    }
}

//It will print 0 4