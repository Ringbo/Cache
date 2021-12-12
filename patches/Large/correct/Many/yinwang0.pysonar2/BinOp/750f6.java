diff --git a/src/main/java/org/yinwang/pysonar/ast/BinOp.java b/src/main/java/org/yinwang/pysonar/ast/BinOp.java
index dc876d7..1bf838e 100644
--- a/src/main/java/org/yinwang/pysonar/ast/BinOp.java
+++ b/src/main/java/org/yinwang/pysonar/ast/BinOp.java
@@ -81,7 +81,7 @@
         }
 
         // Don't do specific things about string types at the moment
-        if (ltype == Analyzer.self.builtins.BaseStr || rtype == Analyzer.self.builtins.BaseStr) {
+        if (ltype == Analyzer.self.builtins.BaseStr && rtype == Analyzer.self.builtins.BaseStr) {
             return Analyzer.self.builtins.BaseStr;
         }
 
