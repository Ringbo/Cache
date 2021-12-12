diff --git a/java/org/apache/jasper/compiler/Compiler.java b/java/org/apache/jasper/compiler/Compiler.java
index 2171268..86810a9 100644
--- a/java/org/apache/jasper/compiler/Compiler.java
+++ b/java/org/apache/jasper/compiler/Compiler.java
@@ -496,7 +496,7 @@
             try {
                 String key = include.getKey();
                 URL includeUrl;
-                if (key.startsWith("jar:")) {
+                if (key.startsWith("jar:") || key.startsWith("file:")) {
                     includeUrl = new URL(key);
                 } else {
                     includeUrl = ctxt.getResource(include.getKey());
