diff --git a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
index 23fe25a..8a973c3 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
@@ -645,7 +645,7 @@
     int startOffset = 0;
     if (!tokens.isEmpty()) {
       final TokenInfo lastToken = tokens.get(tokens.size() - 1);
-      if (lastToken.contentType == contentType) {
+      if (lastToken.contentType == contentType && info == lastToken.getHyperlinkInfo()) {
         lastToken.endOffset += length; // optimization
         return;
       }
