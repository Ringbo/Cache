diff --git a/src/edu/stanford/nlp/international/spanish/SpanishVerbStripper.java b/src/edu/stanford/nlp/international/spanish/SpanishVerbStripper.java
index 59df89a..72aa237 100644
--- a/src/edu/stanford/nlp/international/spanish/SpanishVerbStripper.java
+++ b/src/edu/stanford/nlp/international/spanish/SpanishVerbStripper.java
@@ -73,7 +73,7 @@
    *
    * @param dictPath the path to the dictionary file
    */
-  private HashMap<String, String> setupDictionary(String dictPath) {
+  private static HashMap<String, String> setupDictionary(String dictPath) {
     HashMap<String, String> dictionary = new HashMap<>();
     BufferedReader br = null;
     try {
@@ -83,7 +83,7 @@
         if (words.length < 3) {
           System.err.printf("SpanishVerbStripper: adding words to dict, missing fields, ignoring line: %s%n", line);
         } else {
-          dict.put(words[0], words[2]);
+          dictionary.put(words[0], words[2]);
         }
       }
     } catch (UnsupportedEncodingException e) {
