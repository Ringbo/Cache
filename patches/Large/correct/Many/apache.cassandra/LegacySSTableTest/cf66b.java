diff --git a/test/unit/org/apache/cassandra/io/sstable/LegacySSTableTest.java b/test/unit/org/apache/cassandra/io/sstable/LegacySSTableTest.java
index f669cd7..84f7158 100644
--- a/test/unit/org/apache/cassandra/io/sstable/LegacySSTableTest.java
+++ b/test/unit/org/apache/cassandra/io/sstable/LegacySSTableTest.java
@@ -94,7 +94,7 @@
     public static void defineSchema() throws ConfigurationException
     {
         String scp = System.getProperty(LEGACY_SSTABLE_PROP);
-        Assert.assertNotNull("System property " + LEGACY_SSTABLE_ROOT + " not set", scp);
+        Assert.assertNotNull("System property " + LEGACY_SSTABLE_PROP + " not set", scp);
 
         LEGACY_SSTABLE_ROOT = new File(scp).getAbsoluteFile();
         Assert.assertTrue("System property " + LEGACY_SSTABLE_ROOT + " does not specify a directory", LEGACY_SSTABLE_ROOT.isDirectory());
