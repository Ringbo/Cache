diff --git a/compiler/impl/com/intellij/compiler/classParsing/SignatureParser.java b/compiler/impl/com/intellij/compiler/classParsing/SignatureParser.java
index 1219b05..cdf84d0 100644
--- a/compiler/impl/com/intellij/compiler/classParsing/SignatureParser.java
+++ b/compiler/impl/com/intellij/compiler/classParsing/SignatureParser.java
@@ -93,7 +93,7 @@
     buf.append(it.current());
     it.next();     // consume 'L'
     parseSimpleClassTypeSignature(it, buf);
-    while (it.current() == '/') {
+    while (it.current() == '/' || it.current() == '.') { // Eclipse compiler generates '.' for inner classes 
       parseClassTypeSignatureSuffix(it, buf);
     }
     if (it.current() != ';') {
