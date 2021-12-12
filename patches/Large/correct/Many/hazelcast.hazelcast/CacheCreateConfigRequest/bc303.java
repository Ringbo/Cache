diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/client/CacheCreateConfigRequest.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/client/CacheCreateConfigRequest.java
index 6312b3c..3851c0c 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/client/CacheCreateConfigRequest.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/client/CacheCreateConfigRequest.java
@@ -44,15 +44,15 @@
     private static final int TRY_COUNT = 100;
 
     private CacheConfig cacheConfig;
-    private boolean create;
+    private boolean createAlsoOnOthers;
     private int partitionId;
 
     public CacheCreateConfigRequest() {
     }
 
-    public CacheCreateConfigRequest(CacheConfig cacheConfig, boolean create, int partitionId) {
+    public CacheCreateConfigRequest(CacheConfig cacheConfig, boolean createAlsoOnOthers, int partitionId) {
         this.cacheConfig = cacheConfig;
-        this.create = create;
+        this.createAlsoOnOthers = createAlsoOnOthers;
         this.partitionId = partitionId;
     }
 
@@ -72,7 +72,7 @@
     }
 
     protected Operation prepareOperation() {
-        return new CacheCreateConfigOperation(cacheConfig, create, false);
+        return new CacheCreateConfigOperation(cacheConfig, createAlsoOnOthers, false);
     }
 
     public final int getFactoryId() {
@@ -90,7 +90,7 @@
 
     public void write(PortableWriter writer)
             throws IOException {
-        writer.writeBoolean("c", create);
+        writer.writeBoolean("c", createAlsoOnOthers);
         writer.writeInt("p", partitionId);
         final ObjectDataOutput out = writer.getRawDataOutput();
         out.writeObject(cacheConfig);
@@ -98,7 +98,7 @@
 
     public void read(PortableReader reader)
             throws IOException {
-        create = reader.readBoolean("c");
+        createAlsoOnOthers = reader.readBoolean("c");
         partitionId = reader.readInt("p");
         final ObjectDataInput in = reader.getRawDataInput();
         cacheConfig = in.readObject();
