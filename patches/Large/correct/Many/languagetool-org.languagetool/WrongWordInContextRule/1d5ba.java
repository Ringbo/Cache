diff --git a/languagetool-core/src/main/java/org/languagetool/rules/WrongWordInContextRule.java b/languagetool-core/src/main/java/org/languagetool/rules/WrongWordInContextRule.java
index 1a9de70..4cd6e48 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/WrongWordInContextRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/WrongWordInContextRule.java
@@ -222,11 +222,11 @@
       return ignoreCase + "\\b(" + str + ")\\b";
     }
     
-    public void setWord(int i, String word) {
+    void setWord(int i, String word) {
       words[i] = Pattern.compile(addBoundaries(word));
     }
     
-    public void setContext(int i, String context) {
+    void setContext(int i, String context) {
       contexts[i] = Pattern.compile(addBoundaries(context));
     }
     
