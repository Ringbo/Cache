diff --git a/library/src/main/java/com/bumptech/glide/Registry.java b/library/src/main/java/com/bumptech/glide/Registry.java
index 5d54ccf..f31bf05 100644
--- a/library/src/main/java/com/bumptech/glide/Registry.java
+++ b/library/src/main/java/com/bumptech/glide/Registry.java
@@ -252,7 +252,8 @@
    *
    * @param buckets The list of bucket identifiers in order from highest priority to least priority.
    */
-  public Registry setResourceDecoderBucketPriorityList(List<String> buckets) {
+  // Final to avoid a PMD error.
+  public final Registry setResourceDecoderBucketPriorityList(List<String> buckets) {
     List<String> modifiedBuckets = new ArrayList<>(buckets);
     modifiedBuckets.add(0, BUCKET_PREPEND_ALL);
     modifiedBuckets.add(BUCKET_APPEND_ALL);
