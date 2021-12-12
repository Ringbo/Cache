diff --git a/plugins/ant/src/com/intellij/lang/ant/AntSupport.java b/plugins/ant/src/com/intellij/lang/ant/AntSupport.java
index 2cbd76f..73d4a1d 100644
--- a/plugins/ant/src/com/intellij/lang/ant/AntSupport.java
+++ b/plugins/ant/src/com/intellij/lang/ant/AntSupport.java
@@ -40,7 +40,7 @@
     }
   }
 
-  public static AntLanguage getLanguage() {
+  public static synchronized AntLanguage getLanguage() {
     if (ourLanguage == null) {
       if (ourFileType == null) {
         ourFileType = new AntFileType();
@@ -50,7 +50,7 @@
     return ourLanguage;
   }
 
-  public static AntChangeVisitor getChangeVisitor() {
+  public static synchronized AntChangeVisitor getChangeVisitor() {
     if (ourChangeVisitor == null) {
       ourChangeVisitor = new AntChangeVisitor();
     }
