diff --git a/test/unit/voldemort/scheduled/SlopPusherTest.java b/test/unit/voldemort/scheduled/SlopPusherTest.java
index aa9101d..c197f70 100644
--- a/test/unit/voldemort/scheduled/SlopPusherTest.java
+++ b/test/unit/voldemort/scheduled/SlopPusherTest.java
@@ -54,7 +54,7 @@
     @Override
     protected void setUp() throws Exception {
         repo = new StoreRepository();
-        repo.setSlopStore(new SlopStorageEngine(new InMemoryStorageEngine<ByteArray, byte[], byte[]>("slop"), 2));
+        repo.setSlopStore(new SlopStorageEngine(new InMemoryStorageEngine<ByteArray, byte[], byte[]>("slop"), 3));
         repo.addNodeStore(0, new InMemoryStorageEngine<ByteArray, byte[], byte[]>(STORE_NAME));
         repo.addNodeStore(1, new InMemoryStorageEngine<ByteArray, byte[], byte[]>(STORE_NAME));
         this.failingNodeId = 2;
