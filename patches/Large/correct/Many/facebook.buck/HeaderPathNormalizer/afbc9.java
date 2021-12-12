diff --git a/src/com/facebook/buck/cxx/HeaderPathNormalizer.java b/src/com/facebook/buck/cxx/HeaderPathNormalizer.java
index ec85c59..b860183 100644
--- a/src/com/facebook/buck/cxx/HeaderPathNormalizer.java
+++ b/src/com/facebook/buck/cxx/HeaderPathNormalizer.java
@@ -124,7 +124,12 @@
 
     private <K, V> void put(Map<K, V> map, K key, V value) {
       V previous = map.put(key, value);
-      Preconditions.checkState(previous == null || previous.equals(value));
+      Preconditions.checkState(previous == null || previous.equals(value),
+          "Expected header path to be consistent but key %s mapped to different values: " +
+              "(old: %s, new: %s)",
+          key,
+          previous,
+          value);
     }
 
     public Builder addSymlinkTree(SourcePath root, ImmutableMap<Path, SourcePath> headerMap) {
