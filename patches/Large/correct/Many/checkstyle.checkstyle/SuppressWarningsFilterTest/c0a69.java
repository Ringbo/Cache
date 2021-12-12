diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressWarningsFilterTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressWarningsFilterTest.java
index 64a1bda..0fcd681 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressWarningsFilterTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressWarningsFilterTest.java
@@ -116,7 +116,7 @@
         return checker;
     }
 
-    private String[] removeSuppressed(String[] from, String[] remove) {
+    private static String[] removeSuppressed(String[] from, String[] remove) {
         final Collection<String> coll =
             Lists.newArrayList(Arrays.asList(from));
         coll.removeAll(Arrays.asList(remove));
