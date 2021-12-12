diff --git a/src/java/org/apache/hadoop/hbase/regionserver/Store.java b/src/java/org/apache/hadoop/hbase/regionserver/Store.java
index 740d2e6..d918473 100644
--- a/src/java/org/apache/hadoop/hbase/regionserver/Store.java
+++ b/src/java/org/apache/hadoop/hbase/regionserver/Store.java
@@ -882,7 +882,7 @@
           if (timesSeen <= maxVersions && !(expired = isExpired(kv, ttl, now))) {
             // If this value key is same as a deleted key, skip
             if (lastDelete != null &&
-                this.comparator.compare(kv, lastDelete) == 0) {
+                this.comparatorIgnoringType.compare(kv, lastDelete) == 0) {
               deleted = true;
             } else if (kv.isDeleteType()) {
               // If a deleted value, skip
