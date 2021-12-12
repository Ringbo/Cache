diff --git a/src/com/facebook/buck/jvm/java/abi/source/api/ErrorSuppressingDiagnosticListener.java b/src/com/facebook/buck/jvm/java/abi/source/api/ErrorSuppressingDiagnosticListener.java
index b058107..b2443be 100644
--- a/src/com/facebook/buck/jvm/java/abi/source/api/ErrorSuppressingDiagnosticListener.java
+++ b/src/com/facebook/buck/jvm/java/abi/source/api/ErrorSuppressingDiagnosticListener.java
@@ -135,7 +135,8 @@
       // flag set to a Diagnostic object without copying it first, and then mutate the set
       // such that it contains the "recoverable" flag. That can cause missing class file errors
       // to be reported as recoverable, when they're really not.
-      if (diagnostic.getCode().equals("compiler.err.cant.access")) {
+      if (diagnostic.getCode().equals("compiler.err.cant.access")
+          || diagnostic.getCode().equals("compiler.err.proc.messager")) {
         return false;
       }
 
