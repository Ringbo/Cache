diff --git a/src/jorphan/org/apache/jorphan/util/JOrphanUtils.java b/src/jorphan/org/apache/jorphan/util/JOrphanUtils.java
index 09507dc..09bfe17 100644
--- a/src/jorphan/org/apache/jorphan/util/JOrphanUtils.java
+++ b/src/jorphan/org/apache/jorphan/util/JOrphanUtils.java
@@ -633,12 +633,12 @@
                 java.util.regex.Pattern.compile(regex) :  
                 java.util.regex.Pattern.compile(regex, java.util.regex.Pattern.CASE_INSENSITIVE);
         String newText = source;
-        replacement = Matcher.quoteReplacement(replacement);
+        final String replacementQuoted = Matcher.quoteReplacement(replacement);
         Matcher matcher = pattern.matcher(newText);
         int totalReplaced = 0;
         while(true) {
             String previousText = newText;
-            newText = matcher.replaceFirst(replacement);
+            newText = matcher.replaceFirst(replacementQuoted);
             matcher = pattern.matcher(newText);
             if(newText.equals(previousText)) {
                 break;
