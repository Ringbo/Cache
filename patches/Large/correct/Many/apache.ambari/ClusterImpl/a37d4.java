diff --git a/ambari-server/src/main/java/org/apache/ambari/server/state/cluster/ClusterImpl.java b/ambari-server/src/main/java/org/apache/ambari/server/state/cluster/ClusterImpl.java
index 3d2365c..56005f6 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/state/cluster/ClusterImpl.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/state/cluster/ClusterImpl.java
@@ -1415,7 +1415,7 @@
         readWriteLock.writeLock().unlock();
       }
     } finally {
-      clusterGlobalLock.readLock().unlock();
+      clusterGlobalLock.writeLock().unlock();
     }
   }
 
