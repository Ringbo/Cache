diff --git a/python/src/com/jetbrains/python/documentation/PyDocumentationBuilder.java b/python/src/com/jetbrains/python/documentation/PyDocumentationBuilder.java
index c70c1e1..99aa253 100644
--- a/python/src/com/jetbrains/python/documentation/PyDocumentationBuilder.java
+++ b/python/src/com/jetbrains/python/documentation/PyDocumentationBuilder.java
@@ -480,7 +480,7 @@
     // remove common indentation
     if (cutWidth > 0 && cutWidth < Integer.MAX_VALUE) {
       for (int i = firstIndentedLine; i < lines.length; i += 1) {
-        if (lines[i].length() > cutWidth)
+        if (lines[i].length() >= cutWidth)
           lines[i] = lines[i].substring(cutWidth);
       }
     }
