diff --git a/underfs/swift/src/main/java/alluxio/underfs/swift/SwiftInputStream.java b/underfs/swift/src/main/java/alluxio/underfs/swift/SwiftInputStream.java
index 4052437..9aca99d 100644
--- a/underfs/swift/src/main/java/alluxio/underfs/swift/SwiftInputStream.java
+++ b/underfs/swift/src/main/java/alluxio/underfs/swift/SwiftInputStream.java
@@ -124,7 +124,7 @@
     DownloadInstructions downloadInstructions  = new DownloadInstructions();
     final long blockSize = getBlockSize();
     final long endPos = mPos + blockSize - (mPos % blockSize);
-    downloadInstructions.setRange(new SwiftRange(mPos, endPos));
+    downloadInstructions.setRange(new MidPartLongRange(mPos, endPos));
     mStream = storedObject.downloadObjectAsInputStream(downloadInstructions);
   }
 
