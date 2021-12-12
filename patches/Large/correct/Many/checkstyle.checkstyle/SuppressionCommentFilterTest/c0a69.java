diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilterTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilterTest.java
index 030343e..f504635 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilterTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/filters/SuppressionCommentFilterTest.java
@@ -227,7 +227,7 @@
         return checker;
     }
 
-    private String[] removeSuppressed(String[] from, String[] remove) {
+    private static String[] removeSuppressed(String[] from, String[] remove) {
         final Collection<String> coll =
             Lists.newArrayList(Arrays.asList(from));
         coll.removeAll(Arrays.asList(remove));
