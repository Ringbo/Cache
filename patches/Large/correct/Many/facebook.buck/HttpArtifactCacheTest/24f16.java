diff --git a/test/com/facebook/buck/rules/HttpArtifactCacheTest.java b/test/com/facebook/buck/rules/HttpArtifactCacheTest.java
index bd3e485..91e8cbd 100644
--- a/test/com/facebook/buck/rules/HttpArtifactCacheTest.java
+++ b/test/com/facebook/buck/rules/HttpArtifactCacheTest.java
@@ -83,7 +83,7 @@
 
   @Test
   public void testStore() throws IOException {
-    connection.setConnectTimeout(1);
+    connection.setConnectTimeout(1000);
     connection.setDoOutput(true);
     connection.setRequestMethod("POST");
     expect(connection.getOutputStream()).andReturn(nullOutputStream());
