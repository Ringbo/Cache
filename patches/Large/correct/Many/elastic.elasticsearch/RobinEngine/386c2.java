diff --git a/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java b/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
index 103ecca..7505aa2 100644
--- a/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
+++ b/src/main/java/org/elasticsearch/index/engine/robin/RobinEngine.java
@@ -1018,7 +1018,7 @@
                     ((EnableMergePolicy) indexWriter.getConfig().getMergePolicy()).enableMerge();
                 }
                 if (optimize.onlyExpungeDeletes()) {
-                    indexWriter.expungeDeletes(false);
+                    indexWriter.forceMergeDeletes(false);
                 } else if (optimize.maxNumSegments() <= 0) {
                     indexWriter.maybeMerge();
                     possibleMergeNeeded = false;
