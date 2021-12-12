diff --git a/servers/src/test/java/tachyon/master/lineage/meta/LineageStoreTest.java b/servers/src/test/java/tachyon/master/lineage/meta/LineageStoreTest.java
index 81f3310..74ddffa 100644
--- a/servers/src/test/java/tachyon/master/lineage/meta/LineageStoreTest.java
+++ b/servers/src/test/java/tachyon/master/lineage/meta/LineageStoreTest.java
@@ -105,12 +105,12 @@
   }
 
   @Test
-  public void reportLostFileTest() {
+  public void reportLostFileTest() throws LineageDoesNotExistException {
     long fileId = 1;
     mThrown.expect(LineageDoesNotExistException.class);
     mThrown.expectMessage(ExceptionMessage.LINEAGE_OUTPUT_FILE_NOT_EXIST.getMessage(fileId));
 
-    mLineageStore.requestFilePersistence(fileId);
+    mLineageStore.reportLostFile(fileId);
   }
 
   @Test
