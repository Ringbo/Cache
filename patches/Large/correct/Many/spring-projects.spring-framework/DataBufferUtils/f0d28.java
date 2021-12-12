diff --git a/spring-web-reactive/src/main/java/org/springframework/core/io/buffer/support/DataBufferUtils.java b/spring-web-reactive/src/main/java/org/springframework/core/io/buffer/support/DataBufferUtils.java
index 3c9aedd..85b475e 100644
--- a/spring-web-reactive/src/main/java/org/springframework/core/io/buffer/support/DataBufferUtils.java
+++ b/spring-web-reactive/src/main/java/org/springframework/core/io/buffer/support/DataBufferUtils.java
@@ -200,7 +200,7 @@
 					try {
 						dataBuffer.write(byteBuffer);
 						release = false;
-						sub.emit(dataBuffer);
+						sub.next(dataBuffer);
 					}
 					finally {
 						if (release) {
