diff --git a/scribejava-core/src/main/java/com/github/scribejava/core/extractors/RequestTokenExtractor.java b/scribejava-core/src/main/java/com/github/scribejava/core/extractors/RequestTokenExtractor.java
index bc05471..bc518c6 100644
--- a/scribejava-core/src/main/java/com/github/scribejava/core/extractors/RequestTokenExtractor.java
+++ b/scribejava-core/src/main/java/com/github/scribejava/core/extractors/RequestTokenExtractor.java
@@ -15,5 +15,5 @@
      * @param response the contents of the response
      * @return OAuth access token
      */
-    public Token extract(String response);
+    Token extract(String response);
 }
