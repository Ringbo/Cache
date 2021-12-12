diff --git a/solr/src/test/org/apache/solr/core/RAMDirectoryFactoryTest.java b/solr/src/test/org/apache/solr/core/RAMDirectoryFactoryTest.java
index 16ef98a..c5090a2 100644
--- a/solr/src/test/org/apache/solr/core/RAMDirectoryFactoryTest.java
+++ b/solr/src/test/org/apache/solr/core/RAMDirectoryFactoryTest.java
@@ -30,7 +30,7 @@
  */
 public class RAMDirectoryFactoryTest extends TestCase {
   public void testOpenReturnsTheSameForSamePath() throws IOException {
-    final Directory directory = new RAMDirectory();
+    final Directory directory = new RefCntRamDirectory();
     RAMDirectoryFactory factory = new RAMDirectoryFactory() {
       @Override
       Directory openNew(String path) throws IOException {
@@ -40,16 +40,16 @@
     String path = "/fake/path";
     Directory dir1 = factory.open(path);
     Directory dir2 = factory.open(path);
-    assertEquals("RAMDirectoryFactory should not create new instance of RAMDirectory " +
+    assertEquals("RAMDirectoryFactory should not create new instance of RefCntRamDirectory " +
         "every time open() is called for the same path", directory, dir1);
-    assertEquals("RAMDirectoryFactory should not create new instance of RAMDirectory " +
+    assertEquals("RAMDirectoryFactory should not create new instance of RefCntRamDirectory " +
         "every time open() is called for the same path", directory, dir2);
   }
 
   public void testOpenSucceedForEmptyDir() throws IOException {
     RAMDirectoryFactory factory = new RAMDirectoryFactory();
     Directory dir = factory.open("/fake/path");
-    assertNotNull("RAMDirectoryFactory should create RAMDirectory even if the path doen't lead " +
+    assertNotNull("RAMDirectoryFactory should create RefCntRamDirectory even if the path doen't lead " +
         "to index directory on the file system", dir);
   }
 }
