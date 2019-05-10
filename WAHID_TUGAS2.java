package asistensi;
import javax.swing.JOptionPane;
public class WAHID_TUGAS2 extends javax.swing.JFrame {
public WAHID_TUGAS2() {
        initComponents();
    }

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtextx = new javax.swing.JTextField();
        jtexth = new javax.swing.JTextField();
        jtextsoal = new javax.swing.JTextField();
        jsoalcombo = new javax.swing.JComboBox<>();
        jhitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jreset = new javax.swing.JButton();
        jtexta = new javax.swing.JTextField();
        jtextn = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("APROKSIMASI");

        jLabel2.setText("a: ");

        jLabel3.setText("n: ");

        jLabel4.setText("x: ");

        jLabel5.setText("Hasil");

        jsoalcombo.setBackground(new java.awt.Color(255, 255, 102));
        jsoalcombo.setForeground(new java.awt.Color(51, 51, 0));
        jsoalcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soal", "Soal 2", "Soal 4", "Soal 7" }));
        jsoalcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsoalcomboActionPerformed(evt);
            }
        });

        jhitung.setBackground(new java.awt.Color(102, 255, 102));
        jhitung.setForeground(new java.awt.Color(0, 51, 0));
        jhitung.setText("Hitung");
        jhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhitungActionPerformed(evt);
            }
        });

        jLabel6.setText("Masukkan Nilai");

        jreset.setBackground(new java.awt.Color(255, 51, 51));
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtextx, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jtexth, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtexta)
                            .addComponent(jtextn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jreset)
                                .addGap(13, 13, 13)
                                .addComponent(jsoalcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtextsoal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jhitung))
                        .addGap(280, 280, 280))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jsoalcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtextsoal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtextn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jhitung))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtexth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jreset))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsoalcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsoalcomboActionPerformed
        switch(jsoalcombo.getSelectedIndex()){
            case 1:
                jtextsoal.setText("f(x) = sin(2x)");
                break;
            case 2:
                jtextsoal.setText("f(x) = ln(-x)");
                break;
            case 3:
                jtextsoal.setText("f(x) = xe^2x ");
                break;
            
        }
    }//GEN-LAST:event_jsoalcomboActionPerformed
public static double faktorial(int angka) {
        if(angka==1 || angka==0){
            return 1;
        }else{
            return angka*faktorial(angka-1);
        }
    }
    private void jhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jhitungActionPerformed
        double a = Double.parseDouble(jtexta.getText());
        double n = Double.parseDouble(jtextn.getText());
        double x = Double.parseDouble(jtextx.getText());
        double [] f = new double[1000];
        double fungsi=0;
        double es = 0.5 * Math.pow(10, 2-n);
        
        switch(jsoalcombo.getSelectedIndex()){
            case 1:
                f[0] = Math.sin(Math.toRadians(2*a))+ Math.cos(Math.toRadians(2*a))*(Math.toRadians(x-a));
                for(int i=1; i<1000; i++){
                    f[i]=f[i-1] + ((Math.pow(-1,i)*Math.sin(Math.toRadians(2*a))
                            *Math.pow(Math.toRadians(x-a),2*i))/faktorial(2*i)) + 
                            ((Math.pow(-1,i)*Math.pow(2,2*i+1)*Math.cos(Math.toRadians(2*a))
                            *Math.pow(Math.toRadians(x-a),2*i+1))/faktorial(2*i+1));
                    double ea = ((f[i]-f[i-1])/f[i])*100;
                    if(Math.abs(ea)<es){
                        fungsi += f[i];
                        break;
                    }
                }
                double hasil1 = Math.floor(fungsi*1000)/1000;
                jtexth.setText(String.valueOf(hasil1));
                break;
            case 2:
                if (a > 0){
                    JOptionPane.showMessageDialog(null, "Nilai a harus kurang dari atau sama dengan 0 !!!");
                }
                if (x > 0){
                    JOptionPane.showMessageDialog(null, "Nilai x harus kurang dari atau sama dengan 0 !!!");
                }
                f[0] = Math.log(-a);
                for(int i=1; i<1000; i++){
                    f[i]=f[i-1] + (Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
                    double ea = ((f[i]-f[i-1])/f[i])*100;
                    if(Math.abs(ea)<es){
                        fungsi += f[i];
                        break;
                    }
                }
                double hasil2 = Math.floor(fungsi*1000)/1000;
                jtexth.setText(String.valueOf(hasil2));
                break;
            case 3:
               f[0] = a*Math.exp(2*a);
               double p;
               double q = 1;
               for(int i=1; i<1000; i++){
                   p = Math.pow(2,i);
                   f[i] = f[i-1] + (p*a*Math.exp(2*x)+q*Math.exp(2*a))*Math.pow(x-a,i)/faktorial(i);
                   q = 2*q+p;
                   double ea = ((f[i]-f[i-1])/f[i])*100;
                   if(Math.abs(ea)<es){
                       fungsi += f[i];
                       break;
                   }
               }
               double hasil3 = Math.floor(fungsi*100)/100;
               jtexth.setText(String.valueOf(hasil3));
               break;
            case 0:
                JOptionPane.showMessageDialog(null, "Masukkan Soal");
        }
    }//GEN-LAST:event_jhitungActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed

        jtexta.setText("");
        jtextn.setText("");
        jtextx.setText("");
        jtexth.setText("");
    }//GEN-LAST:event_jresetActionPerformed
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WAHID_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton jhitung;
    private javax.swing.JButton jreset;
    private javax.swing.JComboBox<String> jsoalcombo;
    private javax.swing.JTextField jtexta;
    private javax.swing.JTextField jtexth;
    private javax.swing.JTextField jtextn;
    private javax.swing.JTextField jtextsoal;
    private javax.swing.JTextField jtextx;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new WAHID_TUGAS2().setVisible(true);
        }
    }
}
