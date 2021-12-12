diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
index 78bf806..84e74db 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/filters/CSVFilter.java
@@ -69,7 +69,7 @@
      * Adds a IntFilter to the set.
      * @param filter the IntFilter to add.
      */
-    public void addFilter(IntFilter filter) {
+    public final void addFilter(IntFilter filter) {
         filters.add(filter);
     }
 
