diff --git a/common/buildcraft/core/marker/volume/MessageVolumeBoxes.java b/common/buildcraft/core/marker/volume/MessageVolumeBoxes.java
index c21be8e..73c77d1 100644
--- a/common/buildcraft/core/marker/volume/MessageVolumeBoxes.java
+++ b/common/buildcraft/core/marker/volume/MessageVolumeBoxes.java
@@ -74,7 +74,7 @@
                 }
                 PacketBufferBC buf = new PacketBufferBC(Unpooled.buffer());
                 volumeBox.toBytes(buf);
-                return Pair.of(buffer, volumeBox);
+                return Pair.of(buf, volumeBox);
             })
             .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
 
