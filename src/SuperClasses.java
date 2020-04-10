public class SuperClasses{

    public void FindSuperClasses(Object o){
        Class subclass=o.getClass();
        Class superclass=subclass.getSuperclass();
        while(superclass != null) {
            String className=superclass.getName();
            System.out.println(className);
            subclass=superclass;
            superclass=subclass.getSuperclass();
        }
    }
}
