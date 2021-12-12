diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PyGenerateDocstringIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PyGenerateDocstringIntention.java
index b0620d7..f0123dc 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PyGenerateDocstringIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PyGenerateDocstringIntention.java
@@ -108,7 +108,7 @@
 
     PySignature signature = PySignatureCacheManager.getInstance(project).findSignature(function);
 
-    if (signature != null) {
+    if (signature != null && function.getParameterList().getParameters().length > 0) {
 
       addFunctionArguments(function, signature, docstringGenerator);
 
