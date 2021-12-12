diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointSerializer.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointSerializer.java
index 1ad8e2b..ce707b6 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointSerializer.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointSerializer.java
@@ -124,7 +124,7 @@
 
 		for (int i = 0; i < SIZEOFLONG; ++i) {
 			final int shift = i << 3; // i * 8
-			byteBuffer.put((SIZEOFLONG - 1) - i, (byte) ((longToSerialize & (0xff << shift)) >>> shift));
+			byteBuffer.put((SIZEOFLONG - 1) - i, (byte) ((longToSerialize & (0xffL << shift)) >>> shift));
 		}
 	}
 }
