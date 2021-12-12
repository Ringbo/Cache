diff --git a/python/src/com/jetbrains/python/psi/impl/CallArgumentsMappingImpl.java b/python/src/com/jetbrains/python/psi/impl/CallArgumentsMappingImpl.java
index 0ce343b..6cf66bd 100644
--- a/python/src/com/jetbrains/python/psi/impl/CallArgumentsMappingImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/CallArgumentsMappingImpl.java
@@ -278,7 +278,7 @@
     }
     // map unmapped named params to **kwarg
     if (myKwdArg != null) {
-      for (int j = implicitOffset; j != parameters.size(); ++j) {
+      for (int j = implicitOffset; j < parameters.size(); ++j) {
         final PyParameter par = parameters.get(j);
         final PyNamedParameter namedParameter = par.getAsNamed();
         if (namedParameter != null && !namedParameter.isKeywordContainer()
