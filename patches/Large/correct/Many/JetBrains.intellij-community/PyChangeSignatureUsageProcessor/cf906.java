diff --git a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
index a00dce1..baa96c9 100644
--- a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
+++ b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
@@ -272,7 +272,7 @@
       }
 
       builder.append(info.getName());
-      if (info.getOldIndex() != -1) {
+      if (info.getOldIndex() != -1 && info.getOldIndex() < oldParameters.length) {
         final PyParameter parameter = oldParameters[info.getOldIndex()];
         if (parameter instanceof PyNamedParameter) {
           final PyAnnotation annotation = ((PyNamedParameter)parameter).getAnnotation();
