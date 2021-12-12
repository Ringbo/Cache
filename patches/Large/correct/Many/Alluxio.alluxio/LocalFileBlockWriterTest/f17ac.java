diff --git a/core/common/src/test/java/alluxio/worker/block/io/LocalFileBlockWriterTest.java b/core/common/src/test/java/alluxio/worker/block/io/LocalFileBlockWriterTest.java
index 4d5f014..998ebf7 100644
--- a/core/common/src/test/java/alluxio/worker/block/io/LocalFileBlockWriterTest.java
+++ b/core/common/src/test/java/alluxio/worker/block/io/LocalFileBlockWriterTest.java
@@ -29,7 +29,7 @@
 /**
  * Tests for the {@link LocalFileBlockWriter} class.
  */
-public class LocalFileBlockWriterTest {
+public final class LocalFileBlockWriterTest {
   private static final long TEST_BLOCK_SIZE = 1024;
 
   private LocalFileBlockWriter mWriter;
