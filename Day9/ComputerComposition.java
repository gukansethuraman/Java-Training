package Day9;

class CPU {

    void showCPU() {
        System.out.println("Intel i5 Processor");
    }
}

class Computer {

    CPU cpu = new CPU();

    void display() {
        System.out.println("Computer Details");
        cpu.showCPU();
    }
}

public class ComputerComposition {

    public static void main(String[] args) {

        Computer c = new Computer();
        c.display();
    }
}