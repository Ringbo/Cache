diff --git a/titan-cassandra/src/main/java/com/thinkaurelius/titan/diskstorage/cassandra/astyanax/AstyanaxStoreManager.java b/titan-cassandra/src/main/java/com/thinkaurelius/titan/diskstorage/cassandra/astyanax/AstyanaxStoreManager.java
index 04e7d46..9e9fe68 100644
--- a/titan-cassandra/src/main/java/com/thinkaurelius/titan/diskstorage/cassandra/astyanax/AstyanaxStoreManager.java
+++ b/titan-cassandra/src/main/java/com/thinkaurelius/titan/diskstorage/cassandra/astyanax/AstyanaxStoreManager.java
@@ -219,7 +219,7 @@
     private final int retrySuspendWindow;
     private final RetryBackoffStrategy retryBackoffStrategy;
 
-    private final Map<String, AstyanaxOrderedKeyColumnValueStore> openStores;
+    private final Map<String, AstyanaxKeyColumnValueStore> openStores;
 
     public AstyanaxStoreManager(Configuration config) throws StorageException {
         super(config);
@@ -250,7 +250,7 @@
         this.keyspaceContext = getContextBuilder(config, maxConnsPerHost, "Keyspace").buildKeyspace(ThriftFamilyFactory.getInstance());
         this.keyspaceContext.start();
 
-        openStores = new HashMap<String, AstyanaxOrderedKeyColumnValueStore>(8);
+        openStores = new HashMap<String, AstyanaxKeyColumnValueStore>(8);
     }
 
     @Override
@@ -285,11 +285,11 @@
     }
 
     @Override
-    public synchronized AstyanaxOrderedKeyColumnValueStore openDatabase(String name) throws StorageException {
+    public synchronized AstyanaxKeyColumnValueStore openDatabase(String name) throws StorageException {
         if (openStores.containsKey(name)) return openStores.get(name);
         else {
             ensureColumnFamilyExists(name);
-            AstyanaxOrderedKeyColumnValueStore store = new AstyanaxOrderedKeyColumnValueStore(name, keyspaceContext.getClient(), this, retryPolicy);
+            AstyanaxKeyColumnValueStore store = new AstyanaxKeyColumnValueStore(name, keyspaceContext.getClient(), this, retryPolicy);
             openStores.put(name, store);
             return store;
         }
