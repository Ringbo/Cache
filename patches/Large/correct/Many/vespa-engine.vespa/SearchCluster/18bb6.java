diff --git a/container-search/src/main/java/com/yahoo/search/dispatch/SearchCluster.java b/container-search/src/main/java/com/yahoo/search/dispatch/SearchCluster.java
index a0c7447..0d50702 100644
--- a/container-search/src/main/java/com/yahoo/search/dispatch/SearchCluster.java
+++ b/container-search/src/main/java/com/yahoo/search/dispatch/SearchCluster.java
@@ -155,7 +155,7 @@
 
     /** Returns the n'th (zero-indexed) group in the cluster if possible */
     public Optional<Group> group(int n) {
-        if (orderedGroups.size() < n) {
+        if (orderedGroups.size() > n) {
             return Optional.of(orderedGroups.get(n));
         } else {
             return Optional.empty();
