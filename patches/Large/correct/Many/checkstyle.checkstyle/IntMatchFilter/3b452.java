diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
index d0667b6..cdbd4dc 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/IntMatchFilter.java
@@ -31,7 +31,7 @@
      * Constructs a MatchFilter for an int.
      * @param matchValue the matching int.
      */
-    public IntMatchFilter(int matchValue) {
+    IntMatchFilter(int matchValue) {
         this.matchValue = matchValue;
     }
 
