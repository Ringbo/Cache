diff --git a/python/src/com/jetbrains/python/debugger/PyCallSignatureTypeProvider.java b/python/src/com/jetbrains/python/debugger/PyCallSignatureTypeProvider.java
index 984f901..41734ca 100644
--- a/python/src/com/jetbrains/python/debugger/PyCallSignatureTypeProvider.java
+++ b/python/src/com/jetbrains/python/debugger/PyCallSignatureTypeProvider.java
@@ -48,7 +48,7 @@
     if (callable instanceof PyFunction) {
       PyFunction function = (PyFunction)callable;
       PySignature signature = PySignatureCacheManager.getInstance(function.getProject()).findSignature(function);
-      if (signature != null) {
+      if (signature != null && signature.getReturnType() != null) {
         final String typeName = signature.getReturnType().getTypeQualifiedName();
         if (typeName != null) {
           final PyType type = PyTypeParser.getTypeByName(function, typeName);
