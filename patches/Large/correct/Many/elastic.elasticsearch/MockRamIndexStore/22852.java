diff --git a/src/test/java/org/elasticsearch/test/store/MockRamIndexStore.java b/src/test/java/org/elasticsearch/test/store/MockRamIndexStore.java
index 3c653c3..212451a 100644
--- a/src/test/java/org/elasticsearch/test/store/MockRamIndexStore.java
+++ b/src/test/java/org/elasticsearch/test/store/MockRamIndexStore.java
@@ -45,7 +45,7 @@
 
     @Override
     public Class<? extends DirectoryService> shardDirectory() {
-        return MockRamDirecorySerivce.class;
+        return MockRamDirectoryService.class;
     }
 
     @Override
