diff --git a/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/CommonCrawlToNgram2.java b/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/CommonCrawlToNgram2.java
index 1cac9ff..bcd3aec 100644
--- a/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/CommonCrawlToNgram2.java
+++ b/languagetool-dev/src/main/java/org/languagetool/dev/bigdata/CommonCrawlToNgram2.java
@@ -150,7 +150,7 @@
         System.out.printf(Locale.ENGLISH, "Indexing line %d (%.2fMB) - took %dms, avg=%.2f\n", lineCount, mb, thisTime, avgTime);
         lastTime = System.currentTimeMillis();
       }
-      if (++lineCount % 100_000 == 0) {
+      if (lineCount % 100_000 == 0) {
         System.out.println("commit");
         db.commit();
       }
