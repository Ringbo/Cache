diff --git a/plugins/ui-designer/testData/MethodCallInSuperTest.java b/plugins/ui-designer/testData/MethodCallInSuperTest.java
index 1fc78f1..2edd20d 100644
--- a/plugins/ui-designer/testData/MethodCallInSuperTest.java
+++ b/plugins/ui-designer/testData/MethodCallInSuperTest.java
@@ -20,11 +20,11 @@
   private JComponent myRootComponent;
 
   public MethodCallInSuperTest() {
-    super(getNullFrame(), "", true);
+    super(getNullDialog(), "", true);
     getContentPane().add(myRootComponent);
   }
   
-  private static JFrame getNullFrame() {
+  private static JDialog getNullDialog() {
     return null;
   }
 }
\ No newline at end of file
