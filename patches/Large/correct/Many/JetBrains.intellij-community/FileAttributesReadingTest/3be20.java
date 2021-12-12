diff --git a/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java b/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
index da4a197..671241a 100644
--- a/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
+++ b/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
@@ -300,7 +300,7 @@
     final File target = FileUtil.createTempFile(myTempDirectory, "test.", ".txt");
     final File link = IoTestUtil.createHardLink(target.getPath(), myTempDirectory.getPath() + "/link");
 
-    FileAttributes attributes = getAttributes(link);
+    FileAttributes attributes = getAttributes(link, SystemInfo.areSymLinksSupported);  // ignore XP
     assertEquals(FileAttributes.Type.FILE, attributes.type);
     assertEquals(target.length(), attributes.length);
     assertTimestampsEqual(target.lastModified(), attributes.lastModified);
