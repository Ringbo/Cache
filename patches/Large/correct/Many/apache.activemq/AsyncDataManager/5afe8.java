diff --git a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
index 19fa749..dad3f64 100644
--- a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
+++ b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/AsyncDataManager.java
@@ -292,7 +292,7 @@
         dataFile.decrement();
     }
 
-    DataFile getDataFile(Location item) throws IOException {
+    synchronized DataFile getDataFile(Location item) throws IOException {
         Integer key = Integer.valueOf(item.getDataFileId());
         DataFile dataFile = fileMap.get(key);
         if (dataFile == null) {
@@ -302,7 +302,7 @@
         return dataFile;
     }
     
-    File getFile(Location item) throws IOException {
+    synchronized File getFile(Location item) throws IOException {
         Integer key = Integer.valueOf(item.getDataFileId());
         DataFile dataFile = fileMap.get(key);
         if (dataFile == null) {
@@ -414,7 +414,7 @@
         }
     }
 
-    public void consolidateDataFilesNotIn(Set<Integer> inUse, Integer lastFile) throws IOException {
+    public synchronized void consolidateDataFilesNotIn(Set<Integer> inUse, Integer lastFile) throws IOException {
         Set<Integer> unUsed = new HashSet<Integer>(fileMap.keySet());
         unUsed.removeAll(inUse);
                 
