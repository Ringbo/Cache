diff --git a/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/ExportGermanNouns.java b/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/ExportGermanNouns.java
index ad7d231..6658665 100644
--- a/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/ExportGermanNouns.java
+++ b/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/ExportGermanNouns.java
@@ -45,7 +45,7 @@
   }
   
   private Set<String> getWords() throws IOException {
-    final FSA fsa = FSA.getInstance(JLanguageTool.getDataBroker().getFromResourceDirAsStream(DICT_FILENAME));
+    final FSA fsa = FSA.read(JLanguageTool.getDataBroker().getFromResourceDirAsStream(DICT_FILENAME));
     String lastTerm = null;
     final Set<String> set = new HashSet<String>();
     for (ByteBuffer bb : fsa) {
