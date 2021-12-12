diff --git a/plugins/ant/src/com/intellij/lang/ant/AntParserDefinition.java b/plugins/ant/src/com/intellij/lang/ant/AntParserDefinition.java
index e0b4b40..7379b4c 100644
--- a/plugins/ant/src/com/intellij/lang/ant/AntParserDefinition.java
+++ b/plugins/ant/src/com/intellij/lang/ant/AntParserDefinition.java
@@ -15,7 +15,7 @@
 
   private final ParserDefinition myXmlParserDef;
 
-  AntParserDefinition() {
+  public AntParserDefinition() {
     myXmlParserDef = LanguageParserDefinitions.INSTANCE.forLanguage(StdLanguages.XML);
   }
 
