class employee{
    float salary=40000;
}
class inherit extends employee{
    int bonus=10000;
    public static void main(String args[]){
            inherit p=new inherit();
            System.out.println("programmer salary is"+p.salary);
                 System.out.println("programmer bonud is"+p.bonus);
    }
}
