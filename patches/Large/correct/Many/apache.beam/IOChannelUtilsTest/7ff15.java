diff --git a/sdks/java/core/src/test/java/org/apache/beam/sdk/util/IOChannelUtilsTest.java b/sdks/java/core/src/test/java/org/apache/beam/sdk/util/IOChannelUtilsTest.java
index eb35cbe..8db2f75 100644
--- a/sdks/java/core/src/test/java/org/apache/beam/sdk/util/IOChannelUtilsTest.java
+++ b/sdks/java/core/src/test/java/org/apache/beam/sdk/util/IOChannelUtilsTest.java
@@ -95,7 +95,7 @@
   }
 
   @Test
-  public void testResolveMultiplePaths() throws IOException {
+  public void testResolveMultiplePaths() throws Exception {
     String expected =
             tmpFolder.getRoot().toPath().resolve("aa").resolve("bb").resolve("cc").toString();
     assertEquals(expected,
