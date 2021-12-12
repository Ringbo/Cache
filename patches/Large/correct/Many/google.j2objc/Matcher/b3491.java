diff --git a/jre_emul/android/libcore/luni/src/main/java/java/util/regex/Matcher.java b/jre_emul/android/libcore/luni/src/main/java/java/util/regex/Matcher.java
index 7d81f0b..917818d 100644
--- a/jre_emul/android/libcore/luni/src/main/java/java/util/regex/Matcher.java
+++ b/jre_emul/android/libcore/luni/src/main/java/java/util/regex/Matcher.java
@@ -298,7 +298,7 @@
      */
     public String replaceFirst(String replacement) {
         reset();
-        StringBuffer buffer = new StringBuilder(input.length());
+        StringBuffer buffer = new StringBuffer(input.length());
         if (find()) {
             appendReplacement(buffer, replacement);
         }
@@ -315,7 +315,7 @@
      */
     public String replaceAll(String replacement) {
         reset();
-        StringBuffer buffer = new StringBuilder(input.length());
+        StringBuffer buffer = new StringBuffer(input.length());
         while (find()) {
             appendReplacement(buffer, replacement);
         }
