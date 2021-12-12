diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/GenericUnpairedBracketsRule.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/GenericUnpairedBracketsRule.java
index 2e2e81f..d4a7921 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/GenericUnpairedBracketsRule.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/GenericUnpairedBracketsRule.java
@@ -164,9 +164,9 @@
 
   public void uniqueMapInit() {
     uniqueMap = new HashMap<String, Boolean>();
-    for (int j = 1; j < endSymbols.length; j++) {
+    for (int j = 0; j < endSymbols.length; j++) {
       int found = 0;
-      for (int i = 1; i < endSymbols.length; i++) {
+      for (int i = 0; i < endSymbols.length; i++) {
         if (endSymbols[i].equals(endSymbols[j])) {
           found++;
         }
