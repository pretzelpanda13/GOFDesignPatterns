package designpattern.creational.Factory;

/**
 * Hello Panda! Hello Bear Demonstration of Factory Pattern. Create a collection
 * of bears which have same methods but different in categories. =)
 * 
 */
public class DemoBear 
{
    public static void main( String[] args )
    {
        BearFactory bf = new BearFactory();
        
        //panda
        Bear bear= bf.selectBear(BearType.PANDA);
        bear.declareName();
        //polar Bear
        bear=bf.selectBear(BearType.POLARBEAR);
        bear.declareName();
        //probably not a bear
        bear=bf.selectBear(BearType.ANTIBEAR);
        bear.declareName();
        
        
    }
}
