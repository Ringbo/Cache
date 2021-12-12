diff --git a/common/buildcraft/transport/block/BlockPipeHolder.java b/common/buildcraft/transport/block/BlockPipeHolder.java
index 3385ad0..d115a70 100644
--- a/common/buildcraft/transport/block/BlockPipeHolder.java
+++ b/common/buildcraft/transport/block/BlockPipeHolder.java
@@ -368,9 +368,9 @@
                 between = getWireBetweenHit(target);
             }
 
-            if (part != null) {
+            if (part != null && tile.wireManager.getColorOfPart(part) != null) {
                 return new ItemStack(BCTransportItems.wire, 1, tile.wireManager.getColorOfPart(part).getMetadata());
-            } else if (between != null) {
+            } else if (between != null && tile.wireManager.getColorOfPart(between.parts[0]) != null) {
                 return new ItemStack(BCTransportItems.wire, 1, tile.wireManager.getColorOfPart(between.parts[0]).getMetadata());
             }
         }
