diff --git a/xml/impl/src/com/intellij/codeInsight/template/emmet/EmmetParser.java b/xml/impl/src/com/intellij/codeInsight/template/emmet/EmmetParser.java
index 337818e..0a60d6d 100644
--- a/xml/impl/src/com/intellij/codeInsight/template/emmet/EmmetParser.java
+++ b/xml/impl/src/com/intellij/codeInsight/template/emmet/EmmetParser.java
@@ -36,7 +36,7 @@
 
   private int myIndex = 0;
 
-  EmmetParser(List<ZenCodingToken> tokens, CustomTemplateCallback callback, ZenCodingGenerator generator) {
+  public EmmetParser(List<ZenCodingToken> tokens, CustomTemplateCallback callback, ZenCodingGenerator generator) {
     myTokens = tokens;
     myCallback = callback;
     myGenerator = generator;
