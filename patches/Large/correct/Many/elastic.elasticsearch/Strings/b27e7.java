diff --git a/src/main/java/org/elasticsearch/common/Strings.java b/src/main/java/org/elasticsearch/common/Strings.java
index 8f15f62..7ee2a27 100644
--- a/src/main/java/org/elasticsearch/common/Strings.java
+++ b/src/main/java/org/elasticsearch/common/Strings.java
@@ -1042,7 +1042,7 @@
     }
 
     public static String[] splitStringToArray(final CharSequence s, final char c) {
-        if (s.length() == 0) {
+        if (s == null || s.length() == 0) {
             return Strings.EMPTY_ARRAY;
         }
         int count = 1;
