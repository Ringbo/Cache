diff --git a/shared/io-delta-shared/test/unit/com/liferay/io/delta/ByteChannelReaderTest.java b/shared/io-delta-shared/test/unit/com/liferay/io/delta/ByteChannelReaderTest.java
index ea5e1f7..d975e2d 100644
--- a/shared/io-delta-shared/test/unit/com/liferay/io/delta/ByteChannelReaderTest.java
+++ b/shared/io-delta-shared/test/unit/com/liferay/io/delta/ByteChannelReaderTest.java
@@ -40,7 +40,7 @@
 		ByteChannelReader byteChannelReader = new ByteChannelReader(
 			readableByteChannel, length);
 
-		ByteBuffer byteBuffer = byteChannelReader.getBuffer();
+		final ByteBuffer byteBuffer = byteChannelReader.getBuffer();
 
 		Answer answer = new Answer<Integer>() {
 
