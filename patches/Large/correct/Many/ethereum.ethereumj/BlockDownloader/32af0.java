diff --git a/ethereumj-core/src/main/java/org/ethereum/sync/BlockDownloader.java b/ethereumj-core/src/main/java/org/ethereum/sync/BlockDownloader.java
index 8c8775b..7716298 100644
--- a/ethereumj-core/src/main/java/org/ethereum/sync/BlockDownloader.java
+++ b/ethereumj-core/src/main/java/org/ethereum/sync/BlockDownloader.java
@@ -339,8 +339,8 @@
 
         if (logger.isDebugEnabled()) logger.debug(
                 "{}: Blocks waiting to be proceed: lastBlock.number: [{}]",
-                blocks.get(blocks.size() - 1).getNumber(),
-                name
+                name,
+                blocks.get(blocks.size() - 1).getNumber()
         );
     }
 
