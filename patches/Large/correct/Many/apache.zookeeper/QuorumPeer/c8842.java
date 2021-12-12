diff --git a/src/java/main/org/apache/zookeeper/server/quorum/QuorumPeer.java b/src/java/main/org/apache/zookeeper/server/quorum/QuorumPeer.java
index 66daaf3..42ca580 100644
--- a/src/java/main/org/apache/zookeeper/server/quorum/QuorumPeer.java
+++ b/src/java/main/org/apache/zookeeper/server/quorum/QuorumPeer.java
@@ -1391,7 +1391,7 @@
                     LOG.error("Error closing file: ", e.getMessage());
                 }
             } else {
-                LOG.error("writeToDisk == true but configFilename == null");
+                LOG.info("writeToDisk == true but configFilename == null");
             }
         }
 
