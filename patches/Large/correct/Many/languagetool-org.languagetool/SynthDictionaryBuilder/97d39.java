diff --git a/languagetool-standalone/src/main/java/org/languagetool/dev/SynthDictionaryBuilder.java b/languagetool-standalone/src/main/java/org/languagetool/dev/SynthDictionaryBuilder.java
index d8d5ef1..127068d 100644
--- a/languagetool-standalone/src/main/java/org/languagetool/dev/SynthDictionaryBuilder.java
+++ b/languagetool-standalone/src/main/java/org/languagetool/dev/SynthDictionaryBuilder.java
@@ -35,7 +35,7 @@
    */
   private static final String POLISH_IGNORE_REGEX = ":neg|qub|depr";
 
-  public SynthDictionaryBuilder(File infoFile) throws IOException {
+  SynthDictionaryBuilder(File infoFile) throws IOException {
     super(infoFile);
   }
 
