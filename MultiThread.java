/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg01tugasakhir;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author yunan
 */
public class MultiThread extends javax.swing.JFrame implements Runnable {
    private static final int MAX_DEPTH = 10;
    private Thread thread;
    private String first_link;
    private String first_tag;
    static ArrayList<String> UrlInduk = new ArrayList<String>();
    static ArrayList<String> UrlAnak = new ArrayList<String>();
    private int ID;
    static String key;
    static String[] splitkey;    
    static ArrayList<String> predikat = new ArrayList<String>();
    static ArrayList<String> sertifikat = new ArrayList<String>();
    /**
     * Creates new form GuiMultiThread2
     */
    public MultiThread() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField = new java.awt.TextField();
        kunci = new java.awt.TextField();
        btnReset = new java.awt.Button();
        btnStart = new java.awt.Button();
        show = new java.awt.TextArea();
        File = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 204, 255));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label1.setText("Implementasi Multi Thread Web Crawling");

        label4.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        label4.setText("Oleh: Yunanti Moga Hasanah 06111940000039; Dosen Pembimbing: Dr. Budi Setiyono, S.Si, MT");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo-ITS-1-300x185.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_matematika-its-besar.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(153, 204, 255));
        panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        label2.setText("Lokasi Penyimpanan Lokal*");

        label3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        label3.setText("Kata Kunci(Keywords)*");

        textField.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        kunci.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        kunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunciActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnReset.setLabel("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnStart.setLabel("Mulai");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        File.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        File.setLabel("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(File, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kunci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(683, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(kunci, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(File, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(292, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void kunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kunciActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        UrlInduk.clear();
        UrlAnak.clear();
        predikat.clear();
        sertifikat.clear();
        key = kunci.getText();
        splitkey = key.split(" ");
        show.setText("Proses crawling...");
        
        // menghitung waktu komputasi
        //Start time
        long begin = System.currentTimeMillis();
        //Starting the watch
        new MultiThread().test();
            
        ArrayList<MultiThread> bots = new ArrayList<>();
        bots.add(new MultiThread("https://www.google.com/search?q=" + key, 1, "div.yuRUbf > a"));
        bots.add(new MultiThread( "https://id.search.yahoo.com/search?p=" + key, 2, "div.compTitle.options-toggle > h3 > a"));
        bots.add(new MultiThread("https://www.bing.com/search?q=" + key, 3, "li.b_algo > h2 > a"));
        for(MultiThread w : bots){
            try{
                w.getThread().join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
            
        MultiThread multi = new MultiThread();
        multi.infoAnak();
        multi.UrlInduk.addAll(multi.UrlAnak);
            
        // Remove duplicates
        ArrayList<String>
        newList = removeDuplicates(multi.UrlInduk);
        newList.removeIf(s -> s.contains("/search?"));
        if(newList.size() > 0){
            MethodVisit();
        }
            
        // untuk excel
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Multi Thread");
        
        // mengambil data excel
        Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();
        data.put(0, new Object[] {"NO", "DATA URL", "PREDIKAT", "SERTIFIKAT"});
        int no = 1;
        for(int l = 0; l < newList.size(); l++){
            data.put(no, new Object[] {no, newList.get(l), predikat.get(l), sertifikat.get(l)});
            no++;
        }
        
        // menulis data ke sheet
        Set<Integer> keyset = data.keySet();
        int rownum = 0;
        for (Integer key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            // menentukan lokasi penyimpanan
            String filePath= textField.getText();
            FileOutputStream out = new FileOutputStream(new File(filePath+".xlsx"));
            workbook.write(out);
            out.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        // aloritma mengitung waktu
        int n = 0;
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                for(int k=0; k<1000; k++){
                    n++;
                }
            }
        }
        //End time
        long end = System.currentTimeMillis();      
     
        long time = end-begin;
        
        show.setText("Ditemukan URL sebanyak " + newList.size() + " dengan waktu komputasi selama " + time + " milliseconds");
    }//GEN-LAST:event_btnStartActionPerformed

    public void test(){
      int num = 0;
      for(int i=0; i<=50; i++){  
         num =num+i;
         System.out.print(num+", ");
      }  
   }
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        UrlInduk.clear();
        UrlAnak.clear();
        predikat.clear();
        sertifikat.clear();
        kunci.setText("");
        show.setText("");
        textField.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        textField.setText(filename);
    }//GEN-LAST:event_FileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultiThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiThread().setVisible(true);
            }
        });
    }
    
    
    public MultiThread(String link, int num, String tag){
        first_link = link;
        first_tag = tag;
        ID = num;
        
        thread = new Thread(this);
        thread.start();
    }
    
    public void run(){
        crawl(1,first_link,first_tag);
    }
    
    private void crawl(int level, String url, String tag){
        if(level <= MAX_DEPTH){
            Document doc = request(url);
            if(doc != null){
                for(Element link : doc.select(tag)){
                    
                    String next_link = link.attr("href");
                    if(UrlInduk.contains(next_link)==false){
                        crawl(level++,next_link, tag);
                    }
                }
            }
        }
    }
    
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();
  
        // Traverse through the first list
        for (T element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
    
    private static Document request(String url){
        try{
            Connection con = Jsoup.connect(url);
            Document doc = con.get();
            
            if(con.response().statusCode()==200){
                String convertUrl = extractYahooClick(url);
                System.out.println(convertUrl);
                UrlInduk.add(convertUrl);
                return doc;
            }
            return null;
        }catch(IOException e){
            return null;
        }
    }
    
    private static String extractYahooClick(String url) {
        for (String splitURL : url.split("/")) {
            if (!splitURL.startsWith("RU=")) continue;

            String extractedURL = splitURL.replace("RU=", "");
            String correctedUrl = decodeURL(extractedURL);

            return StringUtils.isEmpty(correctedUrl) ? url : correctedUrl;
        }
        return url;
    }
    
    public static String decodeURL(String url) {
        try {
            return URLDecoder
                .decode(url.replace("+", "%2B"), "UTF-8")
                .replace("%2B", "+");
        } catch (UnsupportedEncodingException exception) {
            return null;
        }
    }
    
    public Thread getThread(){
        return thread;
    }
    
    public void infoAnak(){
        for (int i = 1; i < UrlInduk.size(); i++){
            Anak(1,UrlInduk.get(i));
        }
    }
    
    public void Anak(int level, String urlAnak){		
//        
            if(level <= 5){
                Document doc = requestAnak(urlAnak);
                
                if(doc != null){
                    for(Element link : doc.select("a")){ //untuk mengambil URL Induk
                        if(link.absUrl("title").contains(key)){
                            String next_link = link.absUrl("href");
                            if(UrlAnak.contains(next_link)==false){
                                Anak(level++, next_link);
                            }
                        }
                    }

                }
            }
//        }
    }
    
    private Document requestAnak(String urlAnak){
        try{
            Connection con = Jsoup.connect(urlAnak);
            Document doc = con.timeout(10000).get();
            
            if(con.response().statusCode()==200){
                if(!UrlAnak.contains(urlAnak)){
                    UrlAnak.add(urlAnak);
                    return doc;
                }
                
            }
            
            return null;
        }
        catch(IOException e){
            return null;
        }
    }
    
//    perhitungan
    public void MethodVisit() {
        //Pengunjungan alamat
        MultiThread multi = new MultiThread();
        for (int i = 0; i < multi.UrlInduk.size(); i++) {
            this.Pengunjungan(multi.UrlInduk.get(i), i);
        }
    }
    
    public void Pengunjungan(String urlInduk, int indeks) {
        double keterkaitan = 0;
        try {
            Document doc = Jsoup.connect(urlInduk).timeout(5000).get();
                //menghitung keterkaitan bagian head
                String Judul = doc.title();
                String tempdoc = Judul.replace("`", "");//menghilangkan `
                String tempdoc1 = tempdoc.replace(",", "");//menghilangkan koma
                String tempdoc2 = tempdoc1.replace("'", "");//menghilangkan 
                String tempdoc3 = tempdoc2.replace(":", "");//menghilangkan :
                String tempdoc4 = tempdoc3.replace("  ", " ");//menghilangkan 2 spasi
                String tempdoc5 = tempdoc4.replace("<", "");//menghilangkan <
                String tempdoc6 = tempdoc5.replace(">", "");//menghilangkan >
                String tempdoc7 = tempdoc6.replace("=", "");//menghilangkan =
                String tempdoc8 = tempdoc7.replace("+", "");//menghilangkan +
                String tempdoc9 = tempdoc8.replace("!", "");//menghilangkan :!
                String tempdoc10 = tempdoc9.replace("~", "");//menghilangkan ~
                String tempdoc11 = tempdoc10.replace("?", "");//menghilangkan ?
                String tempdoc12 = tempdoc11.replace("/", "");//menghilangkan /
                String tempdoc13 = tempdoc12.replace(";", "");//menghilangkan ;
                String tempdoc14 = tempdoc13.replace("[", "");//menghilangkan [
                String tempdoc15 = tempdoc14.replace("]", "");//menghilangkan ]
                String tempdoc16 = tempdoc15.replace("{", "");//menghilangkan {
                String tempdoc17 = tempdoc16.replace("}", "");//menghilangkan }
                String tempdoc18 = tempdoc17.replace("-", "");//menghilangkan -
                String tempdoc19 = tempdoc18.replace("|", "");//menghilangkan |
                String tempdoc20 = tempdoc19.replace("_", "");//menghilangkan _
                String tempdoc21 = tempdoc20.replace("@", "");//menghilangkan @
                String tempdoc22 = tempdoc21.replace("#", "");//menghilangkan #
                String tempdoc23 = tempdoc22.replace("$", "");//menghilangkan $
                String tempdoc24 = tempdoc23.replace("%", "");//menghilangkan %
                String tempdoc25 = tempdoc24.replace("^", "");//menghilangkan ^
                String tempdoc26 = tempdoc25.replace("&", "");//menghilangkan &
                String tempdoc27 = tempdoc26.replace("*", "");//menghilangkan *
                String tempdoc28 = tempdoc27.replace("(", "");//menghilangkan (
                String tempdoc29 = tempdoc28.replace(")", "");//menghilangkan )
                String tempdoc30 = tempdoc29.replace(".", "");//menghilangkan .

                //bagian judul dibagi berdasar spasi(per kata)
                String[] pemisahanspasijudul = tempdoc30.split(" ");
                //bagian judul dibagi berdasar titik(per kalimat)
                String[] pemisahantitikjudul = tempdoc29.split("\\.");

                keterkaitan = keterkaitan + 0.5 * this.peluanglabel(pemisahanspasijudul, pemisahantitikjudul);

                //menghitung keterkaitan bagian body
                String Konten = doc.body().text();
                tempdoc = Konten.replace("`", "");//menghilangkan `
                tempdoc1 = tempdoc.replace(",", "");//menghilangkan koma
                tempdoc2 = tempdoc1.replace("'", "");//menghilangkan 
                tempdoc3 = tempdoc2.replace(":", "");//menghilangkan :
                tempdoc4 = tempdoc3.replace("  ", " ");//menghilangkan 2 spasi
                tempdoc5 = tempdoc4.replace("<", "");//menghilangkan <
                tempdoc6 = tempdoc5.replace(">", "");//menghilangkan >
                tempdoc7 = tempdoc6.replace("=", "");//menghilangkan =
                tempdoc8 = tempdoc7.replace("+", "");//menghilangkan +
                tempdoc9 = tempdoc8.replace("!", "");//menghilangkan :!
                tempdoc10 = tempdoc9.replace("~", "");//menghilangkan ~
                tempdoc11 = tempdoc10.replace("?", "");//menghilangkan ?
                tempdoc12 = tempdoc11.replace("/", "");//menghilangkan /
                tempdoc13 = tempdoc12.replace(";", "");//menghilangkan ;
                tempdoc14 = tempdoc13.replace("[", "");//menghilangkan [
                tempdoc15 = tempdoc14.replace("]", "");//menghilangkan ]
                tempdoc16 = tempdoc15.replace("{", "");//menghilangkan {
                tempdoc17 = tempdoc16.replace("}", "");//menghilangkan }
                tempdoc18 = tempdoc17.replace("-", "");//menghilangkan -
                tempdoc19 = tempdoc18.replace("|", "");//menghilangkan |
                tempdoc20 = tempdoc19.replace("_", "");//menghilangkan _
                tempdoc21 = tempdoc20.replace("@", "");//menghilangkan @
                tempdoc22 = tempdoc21.replace("#", "");//menghilangkan #
                tempdoc23 = tempdoc22.replace("$", "");//menghilangkan $
                tempdoc24 = tempdoc23.replace("%", "");//menghilangkan %
                tempdoc25 = tempdoc24.replace("^", "");//menghilangkan ^
                tempdoc26 = tempdoc25.replace("&", "");//menghilangkan &
                tempdoc27 = tempdoc26.replace("*", "");//menghilangkan *
                tempdoc28 = tempdoc27.replace("(", "");//menghilangkan (
                tempdoc29 = tempdoc28.replace(")", "");//menghilangkan )
                tempdoc30 = tempdoc29.replace(".", "");//menghilangkan .

                //bagian konten dibagi berdasar spasi(per kata)
                String[] pemisahanspasikonten = tempdoc30.split(" ");
                //bagian konten dibagi berdasar titik(per kalimat)
                String[] pemisahantitikkonten = tempdoc29.split("\\.");

                keterkaitan = keterkaitan + 0.5 * this.peluanglabel(pemisahanspasikonten, pemisahantitikkonten);

                if (keterkaitan >= 0.5) {
                    predikat.add("Good");//penyimpanan hasil penghitungan keterkaitan
                } else if (keterkaitan < 0) {
                    predikat.add("Belum diketahui");
                } else {
                    predikat.add("Not Good");
                }
                sertifikat.add("Mampu");
            } catch (Exception ex) {
                sertifikat.add("Belum mampu");
                predikat.add("Belum diketahui");;
            }
        
    }
    
    public double tf(String[] doc, String istilah) {
        double hasil = 0;

        String[] cek = istilah.split(" ");//lebih dari 1 kata
        int[] selisih = new int[cek.length];
        int tempindeks = 0;
        int indeksselisih = 0;
        int indeks = 0;

        for (String kata : doc) {
            if (cek.length > 1) {
                for (int i = tempindeks; i < cek.length; i++) {
                    if (cek[i].equalsIgnoreCase(kata)) {
                        selisih[tempindeks] = indeks;
                        tempindeks++;
                        break;
                    } else if (i > 0 && !cek[i].equalsIgnoreCase(kata)) {
                        tempindeks = 0;
                    }
                }
                if (tempindeks == cek.length) {
                    if (selisih[selisih.length - 1] - selisih[0] == cek.length - 1) {
                        hasil++;
                        tempindeks = 0;
                    }
                }
                indeks++;
            } else if (istilah.equalsIgnoreCase(kata)) {
                hasil++;
            }
        }
        return (hasil * 1.0);
    }
    
    public double peluanglabel(String[] docspasi, String[] docdot) {
        double pakhir = 0; //peluang akhir
        double pa = 0;
        double pb = 1; //keadaan peluang awal
        int urutan = 1;
        double Cw = 0;//urutan untuk kata kunci dan banyaknya pada dokumen
        for (int i = splitkey.length - 1; i >= 0; i--) {
            String term = splitkey[i] + this.katatambahan(urutan);
            Cw = this.tf(docspasi, term);
            pa = Cw / docdot.length * 1.0;
            pakhir = this.rekursifpeluang(pa, pb);
            pb = pakhir;
            urutan++;
        }
        return pakhir;
    }

    public String katatambahan(int indeks) {
        String tambahan = "";
        for (int i = indeks; i > 1; i--) {
            tambahan = tambahan + " " + splitkey[splitkey.length - i + 1];
        }
        return tambahan;
    }

    public double rekursifpeluang(double peluangbutuh, double peluangsyarat) {
        double p = 0;
        p = peluangbutuh / peluangsyarat * 1.0;
        if (peluangsyarat <= 0) {
            if (peluangbutuh != 0) {
                p = peluangbutuh;
            } else {
                p = -1;
            }
        }
        return p;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button File;
    private java.awt.Button btnReset;
    private java.awt.Button btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextField kunci;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.TextArea show;
    private java.awt.TextField textField;
    // End of variables declaration//GEN-END:variables
}
