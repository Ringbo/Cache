diff --git a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
index 3540788..2ae42d8 100644
--- a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
+++ b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
@@ -440,7 +440,7 @@
       int endPos, String docID) {
     if (startPos == 0) {
       try {
-        paragraphMatches = langTool.check(paraText, false,
+        paragraphMatches = langTool.check(paraText, true,
             JLanguageTool.ParagraphHandling.ONLYPARA);
         this.docID = docID;
       } catch (Throwable t) {
