diff --git a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
index 4acae0b..210ae17 100644
--- a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
+++ b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
@@ -387,12 +387,12 @@
         return data.getMeanColumns();
     }
 
-    public static ColumnFamilyStore createColumnFamilyStore(Keyspace keyspace, String columnFamily, boolean loadSSTables) throws ConfigurationException
+    public static ColumnFamilyStore createColumnFamilyStore(Keyspace keyspace, String columnFamily, boolean loadSSTables)
     {
         return createColumnFamilyStore(keyspace, columnFamily, StorageService.getPartitioner(), Schema.instance.getCFMetaData(keyspace.getName(), columnFamily), loadSSTables);
     }
 
-    public static ColumnFamilyStore createColumnFamilyStore(Keyspace keyspace, String columnFamily, IPartitioner partitioner, CFMetaData metadata) throws ConfigurationException
+    public static ColumnFamilyStore createColumnFamilyStore(Keyspace keyspace, String columnFamily, IPartitioner partitioner, CFMetaData metadata)
     {
         return createColumnFamilyStore(keyspace, columnFamily, partitioner, metadata, true);
     }
@@ -401,7 +401,7 @@
                                                                          String columnFamily,
                                                                          IPartitioner partitioner,
                                                                          CFMetaData metadata,
-                                                                         boolean loadSSTables) throws ConfigurationException
+                                                                         boolean loadSSTables)
     {
         // get the max generation number, to prevent generation conflicts
         Directories directories = Directories.create(keyspace.getName(), columnFamily);
@@ -412,7 +412,7 @@
             Descriptor desc = entry.getKey();
             generations.add(desc.generation);
             if (!desc.isCompatible())
-                throw new ConfigurationException(String.format("Incompatible SSTable found.  Current version %s is unable to read file: %s.  Please run upgradesstables.",
+                throw new RuntimeException(String.format("Incompatible SSTable found.  Current version %s is unable to read file: %s.  Please run upgradesstables.",
                                                                Descriptor.Version.CURRENT, desc));
         }
         Collections.sort(generations);
