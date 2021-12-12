diff --git a/src/java/org/apache/lucene/document/NumberTools.java b/src/java/org/apache/lucene/document/NumberTools.java
index 11a8cd4..d202519 100644
--- a/src/java/org/apache/lucene/document/NumberTools.java
+++ b/src/java/org/apache/lucene/document/NumberTools.java
@@ -55,7 +55,7 @@
             + "1y2p0ij32e8e7";
 
     /**
-     * the length of (all) strings returned by {@link #longToString}
+     * The length of (all) strings returned by {@link #longToString}
      */
     public static final int STR_SIZE = MIN_STRING_VALUE.length();
 
@@ -100,7 +100,7 @@
      */
     public static long stringToLong(String str) {
         if (str == null) {
-            throw new IllegalArgumentException("string cannot be null");
+            throw new NullPointerException("string cannot be null");
         }
         if (str.length() != STR_SIZE) {
             throw new NumberFormatException("string is the wrong size");
