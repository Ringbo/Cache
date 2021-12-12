diff --git a/plugins/yaml/src/org/jetbrains/yaml/YAMLParserDefinition.java b/plugins/yaml/src/org/jetbrains/yaml/YAMLParserDefinition.java
index b1428a2..05d764b 100644
--- a/plugins/yaml/src/org/jetbrains/yaml/YAMLParserDefinition.java
+++ b/plugins/yaml/src/org/jetbrains/yaml/YAMLParserDefinition.java
@@ -48,7 +48,7 @@
 
   @NotNull
   public TokenSet getStringLiteralElements() {
-    return TokenSet.create(YAMLTokenTypes.SCALAR_STRING, YAMLTokenTypes.SCALAR_DSTRING);
+    return TokenSet.create(YAMLTokenTypes.SCALAR_STRING, YAMLTokenTypes.SCALAR_DSTRING, YAMLTokenTypes.TEXT);
   }
 
   @NotNull
