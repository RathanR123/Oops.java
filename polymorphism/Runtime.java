package polymorphism;

class Animal{  
        void eat(){
            System.out.println("Animals Eat");
    }  
  }  
  class rabbit extends Animal{ 
        @Override 
        void eat(){
            System.out.println("rabbit Eat carrot");
        } 
    }
  class lion extends Animal{ 
        @Override 
        void eat(){
            System.out.println("lion Eat  meat");
        } 
    }
  class Runtime{
    public static void main(String args[]){ 
        Animal A = new Animal();
        Animal h = new rabbit();   
        Animal o = new lion();    
        A.eat();
        h.eat();
        o.eat();
    }
  }