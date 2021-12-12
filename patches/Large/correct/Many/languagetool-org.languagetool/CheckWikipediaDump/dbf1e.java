diff --git a/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/wikipedia/CheckWikipediaDump.java b/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/wikipedia/CheckWikipediaDump.java
index 2291922..5bcbce0 100644
--- a/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/wikipedia/CheckWikipediaDump.java
+++ b/trunk/JLanguageTool/src/dev/de/danielnaber/languagetool/dev/wikipedia/CheckWikipediaDump.java
@@ -78,7 +78,7 @@
     }
     int maxArticles = 0;
     if (args.length == 6) {
-      maxArticles = Integer.parseInt(args[4]);
+      maxArticles = Integer.parseInt(args[5]);
     }
     String[] ruleIds = null;
     if (!"-".equals(args[4])) {
