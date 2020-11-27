
public class Customer {

    private int ID;
    private boolean isNew;
    private float total;

    public int getID() {
        return ID;
    }
    public boolean isIsNew() {
        return isNew;
    }
    public float getTotal() {
        return total;
    }




    public void setID(int ID) {
       if(ID>0){
       this.ID = ID;
       }
       else {
         System.out.println("Error: ID 0> : " +ID+ "");
       }
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public void setTotal(float total) {
        if(total>0){
       this.total = total;
       }
       else {
         System.out.println("Error: total : 0 > " +total+ "");
       }
    }

    public Customer(){
    ID = 28;
    isNew = true;
    total = 228;
    }


    public void displayCustomerInfo() {

    System.out.println("Клиент : " +ID);
    System.out.println("Новый клиент : " + isNew);
    System.out.println("Всего за год : " + total);
} 
}
