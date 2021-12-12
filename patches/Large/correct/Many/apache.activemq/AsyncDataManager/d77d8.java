diff --git a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
index 14af8c6..19fa749 100644
--- a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
+++ b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
@@ -604,7 +604,7 @@
         }
     }
 
-    public ByteSequence read(Location location) throws IOException, IllegalStateException {
+    public synchronized ByteSequence read(Location location) throws IOException, IllegalStateException {
         DataFile dataFile = getDataFile(location);
         DataFileAccessor reader = accessorPool.openDataFileAccessor(dataFile);
         ByteSequence rc = null;
