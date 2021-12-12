diff --git a/python/pluginSrc/com/jetbrains/python/facet/PythonSdkComboBox.java b/python/pluginSrc/com/jetbrains/python/facet/PythonSdkComboBox.java
index aea4a2d..2614935 100644
--- a/python/pluginSrc/com/jetbrains/python/facet/PythonSdkComboBox.java
+++ b/python/pluginSrc/com/jetbrains/python/facet/PythonSdkComboBox.java
@@ -21,7 +21,7 @@
   private Project myProject;
 
   public PythonSdkComboBox() {
-    getComboBox().setRenderer(new SdkListCellRenderer());
+    getComboBox().setRenderer(new SdkListCellRenderer(getComboBox().getRenderer()));
     addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         Sdk selectedSdk = getSelectedSdk();
