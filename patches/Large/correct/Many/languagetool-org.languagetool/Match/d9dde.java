diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
index 4ace34d..bea797e 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
@@ -114,7 +114,7 @@
     }
   }
 
-  public void setSynthesizer(final Synthesizer synth) throws IOException {
+  public void setSynthesizer(final Synthesizer synth) {
     synthesizer = synth;
   }    
 
@@ -123,7 +123,6 @@
    * element.
    * @return String[] array of strings
    * @throws IOException 
-   * .
    */
   public final String[] toFinalString() throws IOException {
     String[] formattedString = new String[1];
