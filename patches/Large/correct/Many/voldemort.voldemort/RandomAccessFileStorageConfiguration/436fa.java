diff --git a/src/java/voldemort/store/readonly/RandomAccessFileStorageConfiguration.java b/src/java/voldemort/store/readonly/RandomAccessFileStorageConfiguration.java
index b71445a..35ef6f1 100644
--- a/src/java/voldemort/store/readonly/RandomAccessFileStorageConfiguration.java
+++ b/src/java/voldemort/store/readonly/RandomAccessFileStorageConfiguration.java
@@ -38,7 +38,7 @@
     private final long fileAccessWaitTimeoutMs;
     private final File storageDir;
     private final Set<ObjectName> registeredBeans;
-    private final int cacheSize;
+    private final long cacheSize;
 
     public RandomAccessFileStorageConfiguration(VoldemortConfig config) {
         this.numFileHandles = config.getReadOnlyStorageFileHandles();
@@ -46,7 +46,7 @@
         this.fileAccessWaitTimeoutMs = config.getReadOnlyFileWaitTimeoutMs();
         this.numBackups = config.getReadOnlyBackups();
         this.registeredBeans = Collections.synchronizedSet(new HashSet<ObjectName>());
-        this.cacheSize = config.getReadOnlyBackups();
+        this.cacheSize = config.getReadOnlyCacheSize();
     }
 
     public void close() {
