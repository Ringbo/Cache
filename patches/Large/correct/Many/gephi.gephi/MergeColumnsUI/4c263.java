diff --git a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/general/actions/MergeColumnsUI.java b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/general/actions/MergeColumnsUI.java
index 3477b1b..32365a7 100644
--- a/DesktopDataLaboratory/src/org/gephi/desktop/datalab/general/actions/MergeColumnsUI.java
+++ b/DesktopDataLaboratory/src/org/gephi/desktop/datalab/general/actions/MergeColumnsUI.java
@@ -352,7 +352,7 @@
         });
 
         infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
-        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gephi/ui/datatable/resources/info.png"))); // NOI18N
+        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gephi/desktop/datalab/resources/info.png"))); // NOI18N
         infoLabel.setText(org.openide.util.NbBundle.getMessage(MergeColumnsUI.class, "MergeColumnsUI.infoLabel.text")); // NOI18N
         infoLabel.setEnabled(false);
 
@@ -386,7 +386,7 @@
                                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
-                                .addComponent(availableStrategiesComboBox, 0, 232, Short.MAX_VALUE)
+                                .addComponent(availableStrategiesComboBox, 0, 218, Short.MAX_VALUE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(infoLabel)
                                 .addContainerGap())))))
