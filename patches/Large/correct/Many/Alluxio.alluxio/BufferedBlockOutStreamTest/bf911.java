diff --git a/clients/unshaded/src/test/java/tachyon/client/block/BufferedBlockOutStreamTest.java b/clients/unshaded/src/test/java/tachyon/client/block/BufferedBlockOutStreamTest.java
index 964fe53..6461108 100644
--- a/clients/unshaded/src/test/java/tachyon/client/block/BufferedBlockOutStreamTest.java
+++ b/clients/unshaded/src/test/java/tachyon/client/block/BufferedBlockOutStreamTest.java
@@ -111,10 +111,10 @@
   @Test
   public void doubleFlush() throws Exception {
     mTestStream.write(INCREASING_BYTES, 1, 10);
-    Assert.assertEquals(0, mTestStream.getBytesFlushed());
+    Assert.assertEquals(0, mTestStream.getFlushedBytes());
     mTestStream.flush();
-    Assert.assertEquals(10, mTestStream.getBytesFlushed());
+    Assert.assertEquals(10, mTestStream.getFlushedBytes());
     mTestStream.flush();
-    Assert.assertEquals(10, mTestStream.getBytesFlushed());
+    Assert.assertEquals(10, mTestStream.getFlushedBytes());
   }
 }
