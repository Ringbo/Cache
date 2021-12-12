diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
index f9ce84c..b263b35 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/Main.java
@@ -150,7 +150,7 @@
       int lineOffset = 0;           
       List<String> unknownWords = new ArrayList<String>();
       StringBuilder sb = new StringBuilder();      
-      for (int ruleIndex = 0; ruleIndex <=runCount; ruleIndex++) {
+      for (int ruleIndex = 0; ruleIndex <runCount; ruleIndex++) {
       int matches = 0;
       long sentences = 0;        
       final long startTime = System.currentTimeMillis();
