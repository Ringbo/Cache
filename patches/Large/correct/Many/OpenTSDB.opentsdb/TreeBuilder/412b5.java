diff --git a/src/tree/TreeBuilder.java b/src/tree/TreeBuilder.java
index 9ce606a..282c92a 100644
--- a/src/tree/TreeBuilder.java
+++ b/src/tree/TreeBuilder.java
@@ -758,7 +758,7 @@
    * @throws IllegalStateException if the tag UIDMetas have not be set
    */
   private void parseTagkRule() {
-    final ArrayList<UIDMeta> tags = meta.getTags();
+    final List<UIDMeta> tags = meta.getTags();
     if (tags == null || tags.isEmpty()) {
       throw new IllegalStateException(
         "Tags for the timeseries meta were null");
