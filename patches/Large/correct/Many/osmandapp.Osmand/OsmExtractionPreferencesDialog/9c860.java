diff --git a/DataExtractionOSM/src/net/osmand/swing/OsmExtractionPreferencesDialog.java b/DataExtractionOSM/src/net/osmand/swing/OsmExtractionPreferencesDialog.java
index 4229860..f8681b4 100644
--- a/DataExtractionOSM/src/net/osmand/swing/OsmExtractionPreferencesDialog.java
+++ b/DataExtractionOSM/src/net/osmand/swing/OsmExtractionPreferencesDialog.java
@@ -123,9 +123,9 @@
 		label = new JLabel("City admin level : ");
         panel.add(label);
         constr = new GridBagConstraints();
-        constr.ipadx = 6;
+        constr.ipadx = 5;
         constr.gridx = 0;
-        constr.gridy = 1;
+        constr.gridy = 2;
         constr.anchor = GridBagConstraints.WEST;
         l.setConstraints(label, constr);
         
@@ -136,9 +136,9 @@
         constr = new GridBagConstraints();
         constr.weightx = 1;
         constr.fill = GridBagConstraints.HORIZONTAL;
-        constr.ipadx = 6;
+        constr.ipadx = 5;
         constr.gridx = 1;
-        constr.gridy = 1;
+        constr.gridy = 2;
         l.setConstraints(cityAdminLevel, constr);
 		
 //		supressWarning = new JCheckBox();
