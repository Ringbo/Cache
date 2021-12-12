diff --git a/dom/openapi/src/com/intellij/util/xml/converters/DelimitedListConverter.java b/dom/openapi/src/com/intellij/util/xml/converters/DelimitedListConverter.java
index f4f0e8c..ff7290a 100644
--- a/dom/openapi/src/com/intellij/util/xml/converters/DelimitedListConverter.java
+++ b/dom/openapi/src/com/intellij/util/xml/converters/DelimitedListConverter.java
@@ -90,7 +90,7 @@
     for (T t : ts) {
       final String s = toString(t);
       if (s != null) {
-        if (buffer.length() == 0) {
+        if (buffer.length() != 0) {
           buffer.append(delimiter);
         }
         buffer.append(s);
