diff --git a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
index ee02add..63a3ac2 100644
--- a/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
+++ b/src/main/java/org/joda/time/tz/ZoneInfoCompiler.java
@@ -192,7 +192,7 @@
     }
 
     static int parseYear(String str, int def) {
-        str = str.toLowerCase();
+        str = str.toLowerCase(Locale.ENGLISH);
         if (str.equals("minimum") || str.equals("min")) {
             return Integer.MIN_VALUE;
         } else if (str.equals("maximum") || str.equals("max")) {
