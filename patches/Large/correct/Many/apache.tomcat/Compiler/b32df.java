diff --git a/java/org/apache/jasper/compiler/Compiler.java b/java/org/apache/jasper/compiler/Compiler.java
index 5c5c48a..ee4204a 100644
--- a/java/org/apache/jasper/compiler/Compiler.java
+++ b/java/org/apache/jasper/compiler/Compiler.java
@@ -334,7 +334,7 @@
                 generateClass(smap);
             }
         } finally {
-            if (tfp != null) {
+            if (tfp != null && ctxt.isPrototypeMode()) {
                 tfp.removeProtoTypeFiles(null);
             }
             // Make sure these object which are only used during the
