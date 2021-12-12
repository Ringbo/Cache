diff --git a/spring-core/src/main/java/org/springframework/core/io/buffer/DataBufferUtils.java b/spring-core/src/main/java/org/springframework/core/io/buffer/DataBufferUtils.java
index a519449..5dccfff 100644
--- a/spring-core/src/main/java/org/springframework/core/io/buffer/DataBufferUtils.java
+++ b/spring-core/src/main/java/org/springframework/core/io/buffer/DataBufferUtils.java
@@ -164,7 +164,7 @@
 			try {
 				ByteBuffer byteBuffer = ByteBuffer.allocate(chunkSize);
 				int read;
-				if ((read = channel.read(byteBuffer)) > 0) {
+				if ((read = channel.read(byteBuffer)) >= 0) {
 					byteBuffer.flip();
 					boolean release = true;
 					DataBuffer dataBuffer = this.dataBufferFactory.allocateBuffer(read);
