/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Torrev_101
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[]{7,4,8,1,5,2};
        int b[]=new int[6];
        int pivo=a.length/2;
        int j=0;
        //For para organizar los elementos
        for(int v=0;v<6;v++){
            //for para organizar los elementos menores al pivote
            for(int i=0;i<pivo-1;i++){
                if(a[i]<a[pivo]){
                    b[j]=a[i];
                    j++;
                }else{
                    
                }
            }
            //for para organizar los elementos mayores al pivote
            for(int i=pivo+1;i<6;i++){
                if(a[i]>a[pivo]){
                    b[j]=a[i];
                    j++;
                }else{
                    
                }                
            }
            b[j+1=a[i-1];
        }
    }
    
}
