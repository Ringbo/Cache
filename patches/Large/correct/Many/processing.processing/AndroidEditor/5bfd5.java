diff --git a/app/src/processing/mode/android/AndroidEditor.java b/app/src/processing/mode/android/AndroidEditor.java
index 0dd70c9..ab2d424 100644
--- a/app/src/processing/mode/android/AndroidEditor.java
+++ b/app/src/processing/mode/android/AndroidEditor.java
@@ -117,7 +117,7 @@
     JMenuItem exportPackage = Base.newJMenuItemShift(exportPkgTitle, 'E');
     exportPackage.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
-        handleExportApplication();
+        handleExportPackage();
       }
     });
     
