diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointDeserializer.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointDeserializer.java
index 15e31b6..ded5c66 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointDeserializer.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/taskmanager/transferenvelope/CheckpointDeserializer.java
@@ -89,7 +89,7 @@
 		}
 
 		for (int i = 0; i < SIZEOFLONG; ++i) {
-			l |= (byteBuffer.get((SIZEOFLONG - 1) - i) & 0xff) << (i << 3);
+			l |= (byteBuffer.get((SIZEOFLONG - 1) - i) & 0xffL) << (i << 3);
 		}
 
 		return l;
