diff --git a/src/java/com/twitter/common/text/util/TokenStreamSerializer.java b/src/java/com/twitter/common/text/util/TokenStreamSerializer.java
index d3c602d..f77cebc 100644
--- a/src/java/com/twitter/common/text/util/TokenStreamSerializer.java
+++ b/src/java/com/twitter/common/text/util/TokenStreamSerializer.java
@@ -217,7 +217,8 @@
       Version version;
       int numTokens;
 
-      @Override public boolean incrementToken() {
+      @Override
+      public final boolean incrementToken() {
         if (token < numTokens) {
           token++;
           try {
