/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perpus;

/**
 *
 * @author Ajisaka
 */
public class pengembalian extends javax.swing.JFrame {

    /** Creates new form pengembalian */
    public pengembalian() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_tglkembali = new javax.swing.JTextField();
        txt_kodebuku = new javax.swing.JTextField();
        txt_nim = new javax.swing.JTextField();
        txt_judul = new javax.swing.JTextField();
        txt_denda = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_rakbuku = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_peminjaman = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_pengembalian = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_history = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pencarian = new javax.swing.JTextField();
        btn_tambahbuku = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 689, -1, 99));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PERPUSTAKAAN DIGITAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 952, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 887, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("electronic library");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Denda                 :  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        txt_tglkembali.setBackground(new java.awt.Color(255, 255, 255));
        txt_tglkembali.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_tglkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tglkembaliActionPerformed(evt);
            }
        });
        jPanel1.add(txt_tglkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 460, -1));

        txt_kodebuku.setBackground(new java.awt.Color(255, 255, 255));
        txt_kodebuku.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_kodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebukuActionPerformed(evt);
            }
        });
        jPanel1.add(txt_kodebuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 460, -1));

        txt_nim.setBackground(new java.awt.Color(255, 255, 255));
        txt_nim.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nimActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 460, -1));

        txt_judul.setBackground(new java.awt.Color(255, 255, 255));
        txt_judul.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_judulActionPerformed(evt);
            }
        });
        jPanel1.add(txt_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 460, -1));

        txt_denda.setBackground(new java.awt.Color(255, 255, 255));
        txt_denda.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dendaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 460, -1));

        txt_nama.setBackground(new java.awt.Color(255, 255, 255));
        txt_nama.setPreferredSize(new java.awt.Dimension(480, 31));
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 460, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PENGEMBALIAN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nama                :  ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NIM                    :  ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Kode Buku        :  ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Judul                  :  ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tgl. Kembali      :  ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(20, 90, 114));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Untitled design (2)_1.png"))); // NOI18N

        btn_rakbuku.setBackground(new java.awt.Color(20, 90, 114));
        btn_rakbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rakbukuMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/rak buku (1).png"))); // NOI18N
        jLabel2.setText("Rak buku ");

        javax.swing.GroupLayout btn_rakbukuLayout = new javax.swing.GroupLayout(btn_rakbuku);
        btn_rakbuku.setLayout(btn_rakbukuLayout);
        btn_rakbukuLayout.setHorizontalGroup(
            btn_rakbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_rakbukuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        btn_rakbukuLayout.setVerticalGroup(
            btn_rakbukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_rakbukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_peminjaman.setBackground(new java.awt.Color(20, 90, 114));
        btn_peminjaman.setPreferredSize(new java.awt.Dimension(50, 51));
        btn_peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_peminjamanMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/peminjaman-removebg-preview (1).png"))); // NOI18N
        jLabel5.setText("Peminjaman");

        javax.swing.GroupLayout btn_peminjamanLayout = new javax.swing.GroupLayout(btn_peminjaman);
        btn_peminjaman.setLayout(btn_peminjamanLayout);
        btn_peminjamanLayout.setHorizontalGroup(
            btn_peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_peminjamanLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btn_peminjamanLayout.setVerticalGroup(
            btn_peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_pengembalian.setBackground(new java.awt.Color(0, 255, 0));
        btn_pengembalian.setPreferredSize(new java.awt.Dimension(50, 51));
        btn_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pengembalianMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/pengembalian-removebg-preview (3).png"))); // NOI18N
        jLabel6.setText("Pengembalian");

        javax.swing.GroupLayout btn_pengembalianLayout = new javax.swing.GroupLayout(btn_pengembalian);
        btn_pengembalian.setLayout(btn_pengembalianLayout);
        btn_pengembalianLayout.setHorizontalGroup(
            btn_pengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pengembalianLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_pengembalianLayout.setVerticalGroup(
            btn_pengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_history.setBackground(new java.awt.Color(20, 90, 114));
        btn_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_historyMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/history-removebg-preview (1).png"))); // NOI18N
        jLabel7.setText("History");

        javax.swing.GroupLayout btn_historyLayout = new javax.swing.GroupLayout(btn_history);
        btn_history.setLayout(btn_historyLayout);
        btn_historyLayout.setHorizontalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_historyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        btn_historyLayout.setVerticalGroup(
            btn_historyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_historyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(20, 90, 114));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/logout-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(941, 941, 941)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rakbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_rakbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_history, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 142, 550));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/kisspng-computer-icons-google-search-symbol-mobile-search-search-for-5ada4b52364384.2521474115242555702223-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 50, 30));

        pencarian.setBackground(new java.awt.Color(255, 255, 255));
        pencarian.setForeground(new java.awt.Color(0, 0, 0));
        pencarian.setText("     Search");
        pencarian.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pencarianMouseClicked(evt);
            }
        });
        jPanel1.add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 450, 32));

        btn_tambahbuku.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambahbuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tambahhbuku (1).png"))); // NOI18N
        btn_tambahbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahbukuMouseClicked(evt);
            }
        });
        jPanel1.add(btn_tambahbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 100, 30));

        btn_kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/kembali-removebg-preview (1).png"))); // NOI18N
        btn_kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kembaliMouseClicked(evt);
            }
        });
        jPanel1.add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 30, -1));

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/hapus-removebg-preview (1).png"))); // NOI18N
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/simpan-removebg-preview (3).png"))); // NOI18N
        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/Untitled design (1).png"))); // NOI18N
        jLabel4.setText("RAK BUKU");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 890, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tglkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tglkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tglkembaliActionPerformed

    private void txt_kodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebukuActionPerformed

    private void txt_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimActionPerformed

    private void txt_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_judulActionPerformed

    private void txt_dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dendaActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_rakbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rakbukuMouseClicked
        dispose();
        rakbuku n = new rakbuku();
        n.setVisible(true);
    }//GEN-LAST:event_btn_rakbukuMouseClicked

    private void btn_peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_peminjamanMouseClicked
        peminjaman b = new peminjaman();
        b.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_peminjamanMouseClicked

    private void btn_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pengembalianMouseClicked
        pengembalian c = new pengembalian();
        c.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pengembalianMouseClicked

    private void btn_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_historyMouseClicked
        dispose();
        history d = new history();
        d.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_historyMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        dispose();
        logout e = new logout();
        e.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencarianMouseClicked
     genre x = new genre ();
       x.setVisible(true);
       dispose();
    }//GEN-LAST:event_pencarianMouseClicked

    private void btn_tambahbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahbukuMouseClicked
        tambahbuku v = new tambahbuku();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_tambahbukuMouseClicked

    private void btn_kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kembaliMouseClicked
        dispose();
        rakbuku n = new rakbuku();
        n.setVisible(true);
    }//GEN-LAST:event_btn_kembaliMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        reset();
    }//GEN-LAST:event_btn_hapusMouseClicked
public void reset(){
txt_nama.setText("");
 txt_nim.setText("");
 txt_kodebuku.setText("");
 txt_judul.setText("");
 txt_tglkembali.setText("");
 txt_denda.setText("");
}
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
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_hapus;
    private javax.swing.JPanel btn_history;
    private javax.swing.JLabel btn_kembali;
    private javax.swing.JPanel btn_peminjaman;
    private javax.swing.JPanel btn_pengembalian;
    private javax.swing.JPanel btn_rakbuku;
    private javax.swing.JLabel btn_simpan;
    private javax.swing.JLabel btn_tambahbuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField pencarian;
    private javax.swing.JTextField txt_denda;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_kodebuku;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_tglkembali;
    // End of variables declaration//GEN-END:variables

}
