class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
    class cat extends Animal{
        void meow(){
            System.out.println("meowing...");
        }
    }
    class Testinheritance3{
        public static void main(String args[]){
            cat C = new cat();
            C.meow();
            C.eat();
        }
    }
