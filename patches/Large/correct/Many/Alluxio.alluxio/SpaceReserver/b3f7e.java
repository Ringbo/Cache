diff --git a/core/server/worker/src/main/java/alluxio/worker/block/SpaceReserver.java b/core/server/worker/src/main/java/alluxio/worker/block/SpaceReserver.java
index f59adba..3a7c689 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/SpaceReserver.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/SpaceReserver.java
@@ -102,8 +102,8 @@
             mBlockWorker.freeSpace(Sessions.MIGRATE_DATA_SESSION_ID, reservedSpace, tierAlias);
           } catch (WorkerOutOfSpaceException | BlockDoesNotExistException
               | BlockAlreadyExistsException | InvalidWorkerStateException | IOException e) {
-            LOG.warn("SpaceReserver failed to free tier {} to {} bytes used", tierAlias,
-                reservedSpace, e.getMessage());
+            LOG.warn("SpaceReserver failed to free tier {} to {} bytes used for high watermarks: "
+                + "{}", tierAlias, reservedSpace, e.getMessage());
           }
         }
       } else {
@@ -111,7 +111,8 @@
           mBlockWorker.freeSpace(Sessions.MIGRATE_DATA_SESSION_ID, reservedSpace, tierAlias);
         } catch (WorkerOutOfSpaceException | BlockDoesNotExistException
             | BlockAlreadyExistsException | InvalidWorkerStateException | IOException e) {
-          LOG.warn(e.getMessage());
+          LOG.warn("SpaceReserver failed to free tier {} to {} bytes used: {}", tierAlias,
+              reservedSpace, e.getMessage());
         }
       }
     }
