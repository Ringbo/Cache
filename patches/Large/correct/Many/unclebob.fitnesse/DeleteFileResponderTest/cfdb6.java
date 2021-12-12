diff --git a/src/fitnesse/responders/files/DeleteFileResponderTest.java b/src/fitnesse/responders/files/DeleteFileResponderTest.java
index 9e2b584..63537e9 100644
--- a/src/fitnesse/responders/files/DeleteFileResponderTest.java
+++ b/src/fitnesse/responders/files/DeleteFileResponderTest.java
@@ -16,17 +16,17 @@
   private FitNesseContext context;
 
   public void setUp() {
-    FileUtil.makeDir("testdir");
+    FileUtil.makeDir(FitNesseUtil.base);
     request = new MockRequest();
-    context = FitNesseUtil.makeTestContext(null);
+    context = FitNesseUtil.makeTestContext();
   }
 
   public void tearDown() throws Exception {
-    FileUtil.deleteFileSystemDirectory("testdir");
+    FileUtil.deleteFileSystemDirectory(FitNesseUtil.base);
   }
 
   public void testDelete() throws Exception {
-    File file = new File("testdir/testfile");
+    File file = new File(FitNesseUtil.base + "/testfile");
     assertTrue(file.createNewFile());
     DeleteFileResponder responder = new DeleteFileResponder();
     request.addInput("filename", "testfile");
@@ -38,7 +38,7 @@
   }
 
   public void testDeleteDirectory() throws Exception {
-    File dir = new File("testdir/dir");
+    File dir = new File(FitNesseUtil.base + "/dir");
     assertTrue(dir.mkdir());
     File file = new File(dir, "testChildFile");
     assertTrue(file.createNewFile());
