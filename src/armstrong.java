class Class1{


    Class1(){

        System.out.print("class1");

    }



}




class Class2 extends Class1{



    Class2(){

        System.out.print("class2");

    }


}



class armstrong extends Class2{

    armstrong(){
        System.out.println("class3");
    }


    public static void main(String [] args){

        armstrong a = new armstrong();

    }


}
