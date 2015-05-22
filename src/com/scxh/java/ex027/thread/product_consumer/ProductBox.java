package com.scxh.java.ex027.thread.product_consumer;

import java.util.ArrayList;

/**
 * ��Ʒ�ж���
 */
class ProductBox {

//    Product[] productbox = new Product[6];  //���Է�6������������
    
	int maxBoxLength = 6;
    ArrayList<Product> productbox  = new  ArrayList<Product>();
    
    int index = 0;
  
    /**
     * ��������������
     * @param p
     */
    public synchronized void push(Product p) {
        while (index == maxBoxLength) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();        
        productbox.add(p);
        index ++;
    }
    /**
     * �����ߴ������ȡ���
     * @return
     */
    public synchronized Product pop() {
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index --;
        int randIndex = (int)(Math.random()*index);
//        System.out.println("randIndex  :"+randIndex);
        return productbox.remove(randIndex);
        
    }
}