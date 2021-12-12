diff --git a/src/fitnesse/wiki/WikiPageFactory.java b/src/fitnesse/wiki/WikiPageFactory.java
index c086a8c..f601c7c 100644
--- a/src/fitnesse/wiki/WikiPageFactory.java
+++ b/src/fitnesse/wiki/WikiPageFactory.java
@@ -4,9 +4,9 @@
 
 import fitnesse.wikitext.parser.VariableSource;
 
-public interface WikiPageFactory<T extends WikiPage> {
+public interface WikiPageFactory {
 
-  WikiPage makePage(File path, String pageName, T parent, VariableSource variableSource);
+  WikiPage makePage(File path, String pageName, WikiPage parent, VariableSource variableSource);
 
   boolean supports(File path);
 }
