diff --git a/java/java-tests/testSrc/com/intellij/openapi/vfs/VfsUtilTest.java b/java/java-tests/testSrc/com/intellij/openapi/vfs/VfsUtilTest.java
index a0a9c87..74faaf1 100644
--- a/java/java-tests/testSrc/com/intellij/openapi/vfs/VfsUtilTest.java
+++ b/java/java-tests/testSrc/com/intellij/openapi/vfs/VfsUtilTest.java
@@ -74,7 +74,7 @@
     File file1 = new File(PathManagerEx.getTestDataPath());
     file1 = new File(file1, "vfs");
     file1 = new File(file1, "findFileByUrl");
-    file0 = VfsUtil.findFileByURL(file1.toURL());
+    file0 = VfsUtil.findFileByURL(file1.toURI().toURL());
     assertNotNull(file0);
     assertTrue(file0.isDirectory());
     final VirtualFile[] children = file0.getChildren();
@@ -93,7 +93,7 @@
     assertEquals(2, list.size());     // "CVS" dir ignored
 
     File file2 = new File(file1, "test.zip");
-    URL url2 = file2.toURL();
+    URL url2 = file2.toURI().toURL();
     url2 = new URL("jar", "", url2.toExternalForm() + "!/");
     url2 = new URL(url2, "com/intellij/installer");
     url2 = new URL(url2.toExternalForm());
@@ -102,7 +102,7 @@
     assertTrue(file0.isDirectory());
 
     File file3 = new File(file1, "1.txt");
-    file0 = VfsUtil.findFileByURL(file3.toURL());
+    file0 = VfsUtil.findFileByURL(file3.toURI().toURL());
     String content = VfsUtil.loadText(file0);
     assertNotNull(file0);
     assertFalse(file0.isDirectory());
@@ -186,12 +186,12 @@
       assertEquals("File:"+child.getPath()+"; mod:"+ new Date(mod)+"; io:"+new File(child.getPath()).lastModified(),timestamp[i], mod);
     }
 
-    Thread.sleep(300);
+    Thread.sleep(2000);  // todo[r.sh] find a way to get timestamps with millisecond granularity on Linux ?
     for (int i=0;i< N;i++) {
       File file = new File(temp, i + ".txt");
       FileUtil.writeToFile(file, "xxx".getBytes());
       long modified = file.lastModified();
-      assertTrue(timestamp[i] != modified);
+      assertTrue("File:" + file.getPath() + "; time:" + modified, timestamp[i] != modified);
       timestamp[i] = modified;
       assertTrue(children[i].getTimeStamp() != modified);
     }
