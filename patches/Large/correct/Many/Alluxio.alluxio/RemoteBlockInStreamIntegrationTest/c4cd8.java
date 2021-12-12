diff --git a/tests/src/test/java/alluxio/client/RemoteBlockInStreamIntegrationTest.java b/tests/src/test/java/alluxio/client/RemoteBlockInStreamIntegrationTest.java
index 610bf38..21204df 100644
--- a/tests/src/test/java/alluxio/client/RemoteBlockInStreamIntegrationTest.java
+++ b/tests/src/test/java/alluxio/client/RemoteBlockInStreamIntegrationTest.java
@@ -431,7 +431,7 @@
       Assert.assertEquals(k / 2, is.skip(k / 2));
       Assert.assertEquals(k / 2, is.read());
       is.close();
-      Assert.assertFalse(mFileSystem.getStatus(uri).getInMemoryPercentage() == 100);
+      Assert.assertTrue(mFileSystem.getStatus(uri).getInMemoryPercentage() == 100);
 
       if (k >= 3) {
         is = mFileSystem.openFile(uri, mReadCache);
@@ -441,7 +441,7 @@
         Assert.assertEquals(t, is.skip(t));
         Assert.assertEquals(2 * t + 1, is.read());
         is.close();
-        Assert.assertFalse(mFileSystem.getStatus(uri).getInMemoryPercentage() == 100);
+        Assert.assertTrue(mFileSystem.getStatus(uri).getInMemoryPercentage() == 100);
       }
     }
   }
