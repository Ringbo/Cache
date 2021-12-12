diff --git a/core/client/src/test/java/alluxio/client/file/FileInStreamTest.java b/core/client/src/test/java/alluxio/client/file/FileInStreamTest.java
index edb2e77..2c2e727 100644
--- a/core/client/src/test/java/alluxio/client/file/FileInStreamTest.java
+++ b/core/client/src/test/java/alluxio/client/file/FileInStreamTest.java
@@ -439,7 +439,7 @@
     try {
       mTestStream.seek(BLOCK_LENGTH);
       Assert.fail("block store should throw exception");
-    } catch (UnavailableException e) {
+    } catch (IOException e) {
       Assert.assertEquals("test IOException", e.getMessage());
     }
   }
