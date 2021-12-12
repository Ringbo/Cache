diff --git a/languagetool-dev/src/main/java/org/languagetool/dev/eval/AtDEvaluator.java b/languagetool-dev/src/main/java/org/languagetool/dev/eval/AtDEvaluator.java
index bbef02b..46b7615 100644
--- a/languagetool-dev/src/main/java/org/languagetool/dev/eval/AtDEvaluator.java
+++ b/languagetool-dev/src/main/java/org/languagetool/dev/eval/AtDEvaluator.java
@@ -56,7 +56,7 @@
   /**
    * @param urlPrefix e.g. {@code http://de.service.afterthedeadline.com/checkDocument?key=test&data=}
    */
-  public AtDEvaluator(String urlPrefix) {
+  AtDEvaluator(String urlPrefix) {
     this.urlPrefix = urlPrefix;
   }
 
