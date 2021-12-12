diff --git a/engine/src/main/java/org/terasology/world/block/internal/BlockManagerImpl.java b/engine/src/main/java/org/terasology/world/block/internal/BlockManagerImpl.java
index a07ef64..03cdfd8 100644
--- a/engine/src/main/java/org/terasology/world/block/internal/BlockManagerImpl.java
+++ b/engine/src/main/java/org/terasology/world/block/internal/BlockManagerImpl.java
@@ -197,7 +197,7 @@
             newState.blocksById.put(block.getId(), block);
             newState.idByUri.put(block.getURI(), block.getId());
         } else {
-            logger.info("Failed to register block {} - no id", block, block.getId());
+            logger.info("Failed to register block {} - no id", block);
         }
         newState.blocksByUri.put(block.getURI(), block);
     }
