diff --git a/gdx/src/com/badlogic/gdx/utils/BufferUtils.java b/gdx/src/com/badlogic/gdx/utils/BufferUtils.java
index 391c422..b29ffc1 100644
--- a/gdx/src/com/badlogic/gdx/utils/BufferUtils.java
+++ b/gdx/src/com/badlogic/gdx/utils/BufferUtils.java
@@ -301,7 +301,7 @@
 	 */
 	public static long getUnsafeByteBufferAddress(ByteBuffer buffer) {
 		synchronized(unsafeBuffers) {
-			if (unsafeBuffers.contains(buffer, true))
+			if (!unsafeBuffers.contains(buffer, true))
 				return 0;
 		}
 		return getByteBufferAddress(buffer);
