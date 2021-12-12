diff --git a/java/org/apache/jasper/compiler/Generator.java b/java/org/apache/jasper/compiler/Generator.java
index d967f1e..e2f4a0d 100644
--- a/java/org/apache/jasper/compiler/Generator.java
+++ b/java/org/apache/jasper/compiler/Generator.java
@@ -586,7 +586,7 @@
                 out.println("\");");
             }
         }
-        if (packages.size() == 0) {
+        if (classes.size() == 0) {
             out.printin("_jspx_imports_classes = null;");
             out.println();
         } else {
