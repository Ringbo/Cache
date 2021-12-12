diff --git a/core/src/main/java/tachyon/client/BlockHandlerLocal.java b/core/src/main/java/tachyon/client/BlockHandlerLocal.java
index 1a29264..e3b6fe1 100644
--- a/core/src/main/java/tachyon/client/BlockHandlerLocal.java
+++ b/core/src/main/java/tachyon/client/BlockHandlerLocal.java
@@ -21,7 +21,8 @@
  */
 public final class BlockHandlerLocal extends BlockHandler {
 
-  private final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_TYPE);
+  private static final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_TYPE);
+
   private final RandomAccessFile mLocalFile;
   private final FileChannel mLocalFileChannel;
   private boolean mPermission = false;
