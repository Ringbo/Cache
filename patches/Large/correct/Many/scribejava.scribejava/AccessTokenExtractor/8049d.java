diff --git a/scribejava-core/src/main/java/com/github/scribejava/core/extractors/AccessTokenExtractor.java b/scribejava-core/src/main/java/com/github/scribejava/core/extractors/AccessTokenExtractor.java
index dcf7b16..ec14ca2 100644
--- a/scribejava-core/src/main/java/com/github/scribejava/core/extractors/AccessTokenExtractor.java
+++ b/scribejava-core/src/main/java/com/github/scribejava/core/extractors/AccessTokenExtractor.java
@@ -15,5 +15,5 @@
      * @param response the contents of the response
      * @return OAuth access token
      */
-    public Token extract(String response);
+    Token extract(String response);
 }
