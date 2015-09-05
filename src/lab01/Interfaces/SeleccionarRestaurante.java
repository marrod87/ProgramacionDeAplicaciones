/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JTree;
import lab01.Clases.Restaurante;
import lab01.Handlers.Fabrica;

/**
 *
 * @author gera
 */
public class SeleccionarRestaurante extends javax.swing.JInternalFrame {
    private ICtrlUsuario ICU;
        
    
    //DefaultTreeModel modelo;
    public SeleccionarRestaurante() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
        //modelo = (DefaultTreeModel) treeCat.getModel();
        modelRest = new DefaultListModel();
        this.cargarTree();
        this.cargarRestaurantesTree();
    }
    DefaultListModel modelRest;

    
    public void cargarTree(){
        Map cats; 
        cats=ICU.retColCat();
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categorias");
        //raiz = (DefaultMutableTreeNode)treeCat.getLastSelectedPathComponent();
        if (raiz != null){
            Iterator it = cats.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry map = (Map.Entry) it.next();
                //raiz.insert(new DefaultMutableTreeNode(map.getKey().toString()), 0);
                DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(map.getKey().toString());
                raiz.add(nodo);
            }  
            DefaultTreeModel model = new DefaultTreeModel(raiz);
            this.treeCat.setModel(model);
//            modelo.reload(raiz);
        }
//        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Categorias");
//        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
//        
//        Iterator it = cats.entrySet().iterator();
//        while(it.hasNext()){
//            Map.Entry map = (Map.Entry) it.next();
//        }
    }
    
    public void cargarRestaurantesTree(){
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
        Map lstRest = ICU.listaDataRestaurantes();   
                
//String cli = this.cliente.getText();
        Iterator rest = lstRest.entrySet().iterator();
        while(rest.hasNext()){
            Map.Entry mapRest = (Map.Entry) rest.next();
            Restaurante r = ICU.getRestauranteByNickname(mapRest.getKey().toString());
            Map catsRest = r.obtenerColeccion();
            Iterator itCatRest = catsRest.entrySet().iterator();
        //Iterator itret = ret.entrySet().iterator();
            Map cats;
            cats=ICU.retColCat();
            while(itCatRest.hasNext()){
                Iterator it = cats.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry mapCats = (Map.Entry) it.next();
                    if (itCatRest.hasNext()){
                        Map.Entry mapCatRest = (Map.Entry) itCatRest.next();
                    if (mapCatRest.getKey() == mapCats.getKey()){
                        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(mapCats.getKey().toString());
                        DefaultMutableTreeNode nodoRes = new DefaultMutableTreeNode(mapCatRest.getKey().toString());
                        raiz.add(nodoRes);
                        DefaultTreeModel model = new DefaultTreeModel(raiz);
                        this.treeCat.setModel(model);
                    }

                    }
                }
           
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeCat = new javax.swing.JTree();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Categorias");
        treeCat.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeCat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree treeCat;
    // End of variables declaration//GEN-END:variables
}
