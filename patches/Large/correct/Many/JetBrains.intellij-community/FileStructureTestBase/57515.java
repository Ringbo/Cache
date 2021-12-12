diff --git a/platform/testFramework/src/com/intellij/testFramework/FileStructureTestBase.java b/platform/testFramework/src/com/intellij/testFramework/FileStructureTestBase.java
index 5b9fe7a..645d6ae 100644
--- a/platform/testFramework/src/com/intellij/testFramework/FileStructureTestBase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/FileStructureTestBase.java
@@ -66,7 +66,7 @@
   }
 
   protected void checkTree() throws Exception {
-    final String expected = FileUtil.loadFile(new File(getTestDataPath() + "/" + getTreeFileName()));
+    final String expected = FileUtil.loadFile(new File(getTestDataPath() + "/" + getTreeFileName()), true);
     Assert.assertEquals(expected.trim(), PlatformTestUtil.print(getTree(), true).trim());
   }
 
