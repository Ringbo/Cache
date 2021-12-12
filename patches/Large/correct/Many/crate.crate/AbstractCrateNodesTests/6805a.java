diff --git a/testing/src/main/java/org/cratedb/test/integration/AbstractCrateNodesTests.java b/testing/src/main/java/org/cratedb/test/integration/AbstractCrateNodesTests.java
index 0efa3d7..105fc6c 100644
--- a/testing/src/main/java/org/cratedb/test/integration/AbstractCrateNodesTests.java
+++ b/testing/src/main/java/org/cratedb/test/integration/AbstractCrateNodesTests.java
@@ -35,7 +35,7 @@
     }
 
     public void deleteTemporaryDataDirectory(String id) {
-        assert !tmpDataDirs.containsKey(id);
+        assert tmpDataDirs.containsKey(id);
         Path tmpDataDir = tmpDataDirs.get(id);
         if (tmpDataDir != null) {
             FileSystemUtils.deleteRecursively(tmpDataDir.toFile(), true);
