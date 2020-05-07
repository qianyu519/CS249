package p8_package;

/**
 * Driver class for testing TwoThreeTreeClass
 * 
 * @author MichaelL
 *
 */
public class TwoThreeTreeMainClass
   {

    /**
     * Main/Driver method for testing components of TwoThreeTreeClass
     * 
     * @param args String arguments not used
     */
    public static void main(String[] args)
      {
       TwoThreeTreeClass tttc = new TwoThreeTreeClass();
       
       tttc.addItem( 45 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 42 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 39 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 36 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 33 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 30 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 27 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 24 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 21 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 18 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 15 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 12 );
       System.out.println( tttc.inOrderTraversal() );
       
       tttc.addItem( 9 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 6 );
       System.out.println( tttc.inOrderTraversal() );

       tttc.addItem( 3 );
       System.out.println( tttc.inOrderTraversal() );
       TwoThreeTreeClass tttc2 = new TwoThreeTreeClass(tttc);
       tttc2.addItem(10);
       System.out.println(tttc2.inOrderTraversal());
       
       System.out.println(tttc2.search( 10 ));

      }

   }