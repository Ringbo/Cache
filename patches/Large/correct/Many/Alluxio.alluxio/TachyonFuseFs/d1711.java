diff --git a/integration/fuse/src/main/java/tachyon/fuse/TachyonFuseFs.java b/integration/fuse/src/main/java/tachyon/fuse/TachyonFuseFs.java
index 429d866..b1f6776 100644
--- a/integration/fuse/src/main/java/tachyon/fuse/TachyonFuseFs.java
+++ b/integration/fuse/src/main/java/tachyon/fuse/TachyonFuseFs.java
@@ -438,7 +438,7 @@
     LOG.trace("readdir({}) [Tachyon: {}]", path, turi);
 
     try {
-      if (mTFS.exists(turi)) {
+      if (!mTFS.exists(turi)) {
         return -ErrorCodes.ENOENT();
       }
       final URIStatus status = mTFS.getStatus(turi);
