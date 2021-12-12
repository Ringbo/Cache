diff --git a/src/java/org/apache/cassandra/db/filter/QueryFilter.java b/src/java/org/apache/cassandra/db/filter/QueryFilter.java
index c27d636..3405c46 100644
--- a/src/java/org/apache/cassandra/db/filter/QueryFilter.java
+++ b/src/java/org/apache/cassandra/db/filter/QueryFilter.java
@@ -155,7 +155,7 @@
         // and if its container is deleted, the column must be changed more recently than the container tombstone (2)
         // (since otherwise, the only thing repair cares about is the container tombstone)
         long maxChange = column.mostRecentLiveChangeAt();
-        return (!column.isMarkedForDelete() || column.getLocalDeletionTime() > gcBefore || maxChange > column.getMarkedForDeleteAt()) // (1)
+        return (!column.isMarkedForDelete() || column.getLocalDeletionTime() >= gcBefore || maxChange > column.getMarkedForDeleteAt()) // (1)
                && (!container.isMarkedForDelete() || maxChange > container.getMarkedForDeleteAt()); // (2)
     }
 
