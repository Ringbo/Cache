diff --git a/languagetool-dev/src/test/java/org/languagetool/dev/eval/LanguageDetectionEval.java b/languagetool-dev/src/test/java/org/languagetool/dev/eval/LanguageDetectionEval.java
index 21b6cbf..913adfe 100644
--- a/languagetool-dev/src/test/java/org/languagetool/dev/eval/LanguageDetectionEval.java
+++ b/languagetool-dev/src/test/java/org/languagetool/dev/eval/LanguageDetectionEval.java
@@ -43,7 +43,7 @@
   private int totalInputs = 0;
   private int totalFailures = 0;
 
-  public LanguageDetectionEval() {
+  LanguageDetectionEval() {
     languageIdentifier = new LanguageIdentifier();
   }
 
@@ -138,7 +138,7 @@
   }
 
   class DetectionException extends RuntimeException {
-    public DetectionException(String s) {
+    DetectionException(String s) {
       super(s);
     }
   }
