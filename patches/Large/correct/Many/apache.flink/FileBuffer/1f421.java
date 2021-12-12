diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/io/channels/FileBuffer.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/io/channels/FileBuffer.java
index f5b7404..ee8d456 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/io/channels/FileBuffer.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/io/channels/FileBuffer.java
@@ -183,7 +183,7 @@
 			}
 
 			bytesWritten += b;
-			this.totalBytesWritten += bytesWritten;
+			this.totalBytesWritten += b;
 			diff = this.bufferSize - this.totalBytesWritten;
 		}
 
