diff --git a/python/src/com/jetbrains/python/psi/types/PyTypeParser.java b/python/src/com/jetbrains/python/psi/types/PyTypeParser.java
index 2d569ed..3cfd280 100644
--- a/python/src/com/jetbrains/python/psi/types/PyTypeParser.java
+++ b/python/src/com/jetbrains/python/psi/types/PyTypeParser.java
@@ -53,7 +53,7 @@
     }
 
     final PsiFile anchorFile = anchor.getContainingFile();
-    if (anchor instanceof PyFile) {
+    if (anchorFile instanceof PyFile) {
       final PyClass aClass = ((PyFile)anchorFile).findTopLevelClass(type);
       if (aClass != null) {
         return new PyClassType(aClass, false);
