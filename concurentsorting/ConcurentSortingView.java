/*
 * ConcurentSortingView.java
 */

package concurentsorting;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.*;
import java.util.*;



/**
 * The application's main frame.
 */
public class ConcurentSortingView extends FrameView {

    /**
     * Array to be sorted 
     */
ArrayList<Integer> myArray1;
ArrayList<Integer> myArray2;
ArrayList<Integer> myArray3;

        //creating an image to Display to the panel
        ArrayImageCreator arrayImage1; 
        ArrayImageCreator arrayImage2;
        ArrayImageCreator arrayImage3;

    
    public ConcurentSortingView(SingleFrameApplication app) {
        super(app);

        initComponents();

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        
        //creating random array
        IntegerRandomArrayCreator iRand = new IntegerRandomArrayCreator(300,200);
        myArray1 = iRand.getArray();
        myArray2 = iRand.getClone();
        myArray3 = iRand.getClone();
       
        
       
       
        //creating an image to Display to the panel
        ArrayImageCreator arrayImage1 = new ArrayImageCreator(myArray1);
        ArrayImageCreator arrayImage2 = new ArrayImageCreator(myArray2);
        ArrayImageCreator arrayImage3 = new ArrayImageCreator(myArray3);
        
        jPanel1.setLayout(new FlowLayout());
        jPanel2.setLayout(new FlowLayout());
        jPanel3.setLayout(new FlowLayout());
        
        jPanel1.add(arrayImage1,0,0);
        jPanel2.add(arrayImage2,0,0);
        jPanel3.add(arrayImage3,0,0);
        
        
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        mainPanel.setName("mainPanel"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(concurentsorting.ConcurentSortingApp.class).getContext().getResourceMap(ConcurentSortingView.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(concurentsorting.ConcurentSortingApp.class).getContext().getActionMap(ConcurentSortingView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
// TODO add your handling code here:
    Thread firstThread = new Thread(new BubbleSort(myArray1,jPanel1,10));
    Thread secondThread = new Thread(new QuickSort(myArray2,jPanel2,10));
    Thread thirdThread = new Thread(new HeapSort(myArray3,jPanel3,10));
    firstThread.start();
    secondThread.start();
    thirdThread.start();
    
}//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    
    
    
    private JDialog aboutBox;
}

/**
 * This class creates a graphical representation of an array
 * @author Catlain Mazilu
 */
class ArrayImageCreator  extends javax.swing.JPanel {
    
    private  BufferedImage myImage;
    private ArrayList<Integer> myList;
   
    
      ArrayImageCreator(){
            super.setPreferredSize(new Dimension(250,100));
      }
      ArrayImageCreator(ArrayList<Integer> myList) {
          super.setPreferredSize(new Dimension(300,200));
          this.myList = myList;
          //System.out.println("ArrayImageCreator has been created! Array elements: " + myList.size());
      }

      //draw the image
      @Override
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        //System.out.println("Paint is running");
          myImage = new BufferedImage(280, 180, BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = myImage.getGraphics();
        
        g2.setColor(new Color(10,10,220));
        
        
        int i=0;
        for (Integer a:myList){
            g2.drawLine(i, 0, i, a);
            i++;
            //System.out.println("Line " + i +","+0+" " + i + ","+a);
        }      

        g.drawImage(myImage, 10, -10, this);
        
        
        g2.dispose();
    
    }
     
  
    /**
       * Sends to the ImageCreator the new ArrayList
       * @param newArray changed elements in Array
       */
    public void setArray(ArrayList<Integer> newArray){
        myList = newArray;
        this.updateUI();
    }


}

//This class creates a random Array of Integer
class IntegerRandomArrayCreator {
    int n=0; //number of elements to create
    int range=0; //maximum value for elements
     ArrayList<Integer> myInternalArray; //internal storage used when clonning 
    /**
     * Constructor for 1 single Array
     * @param n number of elements
     * @param range 
     */
    IntegerRandomArrayCreator(int n, int range){
        this.n = n;
        this.range = range;
    }

    public ArrayList<Integer> getArray(){
        myInternalArray = new ArrayList<Integer>();
        ArrayList<Integer> myArray;
        Random rand = new Random();
  
        for (int i=0; i<n; i++){
            int  number = rand.nextInt(range) + 1;
            myInternalArray.add(number);
            
        }
        //creates a clone of data and returns it
        myArray = getClone();
        return myArray;
    }
    
    /**
     * Returns a clone of internal array
     * @return clone of internal array
     */
    public ArrayList<Integer> getClone(){
         ArrayList<Integer> myArray = new ArrayList<Integer>();
          
        for (Integer i:myInternalArray){
            myArray.add(i);
        }   
         return myArray;
    }
    

}


/*
 * This class sorts an array using Bubble sort meethod
 */
class BubbleSort implements Runnable{
    //Array to be sorted
    protected ArrayList<Integer> myArray;
    
    //received Panel - used to draw on
    protected javax.swing.JPanel myPanel;
    
    protected int myDelay;
    
    //BUG here doesn't get the object initialised as parameter ArrayImageCreator theImage
    /**
     * 
     * @param myArray data to sort
     * @param myPanel graphical panel to output
     * @param Delay Delay between instructions in milliseconds
     */
    public BubbleSort(ArrayList myArray, javax.swing.JPanel myPanel, int myDelay){
        this.myArray = myArray;
        //this.theImage=theImage;
        this.myPanel = myPanel;
        
        this.myDelay = myDelay;
    }
    
    //sorting the Array using Bubble sort
    public void run(){
        System.out.println("Running Bubble");
        
        boolean sorted = true;
        
        do {
            for (int i=0; i<myArray.size()-1; i++)
            {  
              
                
                if (myArray.get(i)>myArray.get(i+1)){
                    int aux = myArray.get(i);
                    myArray.set(i,myArray.get(i+1));
                    myArray.set(i+1,aux);
                      try{
                Thread.sleep(myDelay);
                } catch (Exception e){
                }
                    myPanel.updateUI();
                    
                    sorted = false;  
                }
            }
        } while (!sorted);
        
    }
    
}



/*
 * This class sorts an array using Bubble sort meethod
 */
//http://www.vogella.com/tutorials/JavaAlgorithmsQuicksort/article.html
class QuickSort implements Runnable{
    //Array to be sorted
    protected ArrayList<Integer> myArray;
    
    //received Panel - used to draw on
    protected javax.swing.JPanel myPanel;
    
    protected int myDelay;
    
    //BUG here doesn't get the object initialised as parameter ArrayImageCreator theImage
    /**
     * 
     * @param myArray data to sort
     * @param myPanel graphical panel to output
     * @param Delay Delay between instructions in milliseconds
     */
    public QuickSort(ArrayList myArray, javax.swing.JPanel myPanel, int myDelay){
        this.myArray = myArray;
        //this.theImage=theImage;
        this.myPanel = myPanel;
        
        this.myDelay = myDelay;
    }
    
     private void quicksort(int low, int high) {
        int i = low, j = high;
        System.out.println("Low is " + low + " High is " + high);
        // Get the pivot element from the middle of the list
        int pivot = myArray.get(low + (high-low)/2);
        System.out.println("pivot is " + pivot);
        // Divide into two lists
        while (i <= j) {
              
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (myArray.get(i) < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (myArray.get(j) > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = myArray.get(i);
        myArray.set(i,myArray.get(j));
        myArray.set(j,temp);
        try{
                Thread.sleep(myDelay);
                } catch (Exception e){
                }
        myPanel.updateUI();
    }
    
    
    
    //sorting the Array using Bubble sort
    public void run(){
        System.out.println("Running QuickSort");
        
                quicksort(0,myArray.size()-1);
        
              
                
     System.out.println("QS end run");
    }
    
}
 

class HeapSort implements Runnable{
    //Array to be sorted
    protected ArrayList<Integer> myArray;
    
    //received Panel - used to draw on
    protected javax.swing.JPanel myPanel;
    private int n;
    protected int myDelay;
    
    //BUG here doesn't get the object initialised as parameter ArrayImageCreator theImage
    /**
     * 
     * @param myArray data to sort
     * @param myPanel graphical panel to output
     * @param Delay Delay between instructions in milliseconds
     */
    public HeapSort(ArrayList myArray, javax.swing.JPanel myPanel, int myDelay){
        this.myArray = myArray;
        //this.theImage=theImage;
        this.myPanel = myPanel;
        this.n = myArray.size();
        this.myDelay = myDelay;
    }
    
      
    /* Sort Function */
    public void sort()
    {       
        heapify();        
        for (int i = n; i > 0; i--)
        {
            swap(0, i);
            n = n-1;
            maxheap(0);
        }
    }     
    /* Function to build a heap */   
    public void heapify()
    {
        n = myArray.size()-1;
        for (int i = n/2; i >= 0; i--)
            maxheap(i);        
    }
    /* Function to swap largest element in heap */        
    public void maxheap(int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= n && myArray.get(left) > myArray.get(i))
            max = left;
        if (right <= n && myArray.get(right) > myArray.get(max))        
            max = right;
 
        if (max != i)
        {
            swap(i, max);
            maxheap(max);
        }
    }    
    /* Function to swap two numbers in an array */
    public void swap(int i, int j)
    {
        int tmp = myArray.get(i);
        myArray.set(i,myArray.get(j));
        myArray.set(j,tmp); 
        try{
                Thread.sleep(myDelay);
                } catch (Exception e){
                }
        myPanel.updateUI();
    }    
    
    
    
    //sorting the Array using Bubble sort
    public void run(){
        System.out.println("Running QuickSort");
        
                sort();
        
    }    
}
 









