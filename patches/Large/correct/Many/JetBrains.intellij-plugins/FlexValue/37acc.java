diff --git a/flex/src/com/intellij/lang/javascript/flex/debug/FlexValue.java b/flex/src/com/intellij/lang/javascript/flex/debug/FlexValue.java
index 48ac572..fe7b707 100644
--- a/flex/src/com/intellij/lang/javascript/flex/debug/FlexValue.java
+++ b/flex/src/com/intellij/lang/javascript/flex/debug/FlexValue.java
@@ -785,7 +785,7 @@
         type = inQuotes.substring(0, atIndex);
         final int spaceIndex = inQuotes.indexOf(" ", atIndex);
         if (spaceIndex != -1) {
-          additionalInfo = inQuotes.substring(spaceIndex, inQuotes.length());
+          additionalInfo = inQuotes.substring(spaceIndex);
         }
       }
       else {
