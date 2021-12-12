diff --git a/camel-core/src/main/java/org/apache/camel/processor/idempotent/FileIdempotentRepository.java b/camel-core/src/main/java/org/apache/camel/processor/idempotent/FileIdempotentRepository.java
index 01796f2..61063ff 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/idempotent/FileIdempotentRepository.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/idempotent/FileIdempotentRepository.java
@@ -51,7 +51,7 @@
     private Map<String, Object> cache;
     private File fileStore;
     private long maxFileStoreSize = 1024 * 1000L; // 1mb store file
-    private AtomicBoolean init = new AtomicBoolean();
+    private final AtomicBoolean init = new AtomicBoolean();
 
     public FileIdempotentRepository() {
     }
@@ -334,7 +334,6 @@
     protected void doStart() throws Exception {
         ObjectHelper.notNull(fileStore, "fileStore", this);
 
-        //CAMEL-12037
         if (this.cache == null) {
         	// default use a 1st level cache
         	this.cache = LRUCacheFactory.newLRUCache(1000);
