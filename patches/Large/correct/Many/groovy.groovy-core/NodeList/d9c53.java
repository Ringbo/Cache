diff --git a/src/main/groovy/util/NodeList.java b/src/main/groovy/util/NodeList.java
index 2060c0a..2aebe63 100644
--- a/src/main/groovy/util/NodeList.java
+++ b/src/main/groovy/util/NodeList.java
@@ -153,7 +153,7 @@
      */
     public String text() {
         String previousText = null;
-        StringBuffer buffer = null;
+        StringBuilder buffer = null;
         for (Object child : this) {
             String text = null;
             if (child instanceof String) {
@@ -166,7 +166,7 @@
                     previousText = text;
                 } else {
                     if (buffer == null) {
-                        buffer = new StringBuffer();
+                        buffer = new StringBuilder();
                         buffer.append(previousText);
                     }
                     buffer.append(text);
