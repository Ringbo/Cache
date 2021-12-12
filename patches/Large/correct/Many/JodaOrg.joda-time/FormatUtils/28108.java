diff --git a/JodaTime/src/java/org/joda/time/format/FormatUtils.java b/JodaTime/src/java/org/joda/time/format/FormatUtils.java
index 9c7ce6a..dba1431 100644
--- a/JodaTime/src/java/org/joda/time/format/FormatUtils.java
+++ b/JodaTime/src/java/org/joda/time/format/FormatUtils.java
@@ -354,7 +354,7 @@
     }
 
     static String createErrorMessage(final String text, final int errorPos) {
-        int sampleLen = errorPos + 20;
+        int sampleLen = errorPos + 32;
         String sampleText;
         if (text.length() <= sampleLen + 3) {
             sampleText = text;
