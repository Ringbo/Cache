diff --git a/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java b/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
index 671241a..deb9810 100644
--- a/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
+++ b/platform/util/testSrc/com/intellij/openapi/util/io/FileAttributesReadingTest.java
@@ -310,7 +310,7 @@
     assertTrue(target.length() > 0);
     assertTimestampsEqual(attributes.lastModified - 5000, target.lastModified());
 
-    attributes = getAttributes(link);
+    attributes = getAttributes(link, SystemInfo.areSymLinksSupported);  // ignore XP
     assertEquals(FileAttributes.Type.FILE, attributes.type);
     assertEquals(target.length(), attributes.length);
     assertTimestampsEqual(target.lastModified(), attributes.lastModified);
