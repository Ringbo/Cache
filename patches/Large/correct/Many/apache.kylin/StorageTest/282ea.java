diff --git a/storage/src/test/java/org/apache/kylin/storage/test/StorageTest.java b/storage/src/test/java/org/apache/kylin/storage/test/StorageTest.java
index 99b5540..dafebfe 100644
--- a/storage/src/test/java/org/apache/kylin/storage/test/StorageTest.java
+++ b/storage/src/test/java/org/apache/kylin/storage/test/StorageTest.java
@@ -61,7 +61,7 @@
         CubeManager cubeMgr = CubeManager.getInstance(getTestConfig());
         cube = cubeMgr.getCube("TEST_KYLIN_CUBE_WITHOUT_SLR_EMPTY");
         Assert.assertNotNull(cube);
-        storageEngine = StorageEngineFactory.getStorageEngine(cube, true);
+        storageEngine = StorageEngineFactory.getStorageEngine(cube, false);
         String url = KylinConfig.getInstanceFromEnv().getStorageUrl();
         context = new StorageContext();
         context.setConnUrl(url);
