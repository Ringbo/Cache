diff --git a/parceler-api/src/main/java/org/parceler/MapsUtil.java b/parceler-api/src/main/java/org/parceler/MapsUtil.java
index 9fcd829..74afc6f 100644
--- a/parceler-api/src/main/java/org/parceler/MapsUtil.java
+++ b/parceler-api/src/main/java/org/parceler/MapsUtil.java
@@ -37,7 +37,7 @@
      * @param expectedSize
      * @return HashMap capacity that avoids rehashing.
      */
-    static int initialHashMapCapacity(int expectedSize) {
+    public static int initialHashMapCapacity(int expectedSize) {
         if (expectedSize < 0) {
             throw new ParcelerRuntimeException("Expected size must be non-negative");
         }
