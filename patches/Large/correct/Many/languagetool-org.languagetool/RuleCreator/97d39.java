diff --git a/languagetool-standalone/src/main/java/org/languagetool/dev/RuleCreator.java b/languagetool-standalone/src/main/java/org/languagetool/dev/RuleCreator.java
index bf544bf..b856995 100644
--- a/languagetool-standalone/src/main/java/org/languagetool/dev/RuleCreator.java
+++ b/languagetool-standalone/src/main/java/org/languagetool/dev/RuleCreator.java
@@ -162,10 +162,10 @@
     }
   }
 
-  class OccurrenceInfo {
+  static class OccurrenceInfo {
     private final String ngram;
     private final long occurrence;
-    public OccurrenceInfo(String ngram, long occurrence) {
+    OccurrenceInfo(String ngram, long occurrence) {
       this.ngram = ngram;
       this.occurrence = occurrence;
     }
