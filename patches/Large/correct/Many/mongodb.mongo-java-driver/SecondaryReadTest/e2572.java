diff --git a/src/test/com/mongodb/SecondaryReadTest.java b/src/test/com/mongodb/SecondaryReadTest.java
index 2703d6e..8f97e18 100644
--- a/src/test/com/mongodb/SecondaryReadTest.java
+++ b/src/test/com/mongodb/SecondaryReadTest.java
@@ -83,7 +83,7 @@
 
             final DBCollection col = loadCleanDbCollection(mongo);
 
-            insertTestData(col, new WriteConcern(getSecondaryCount(testHosts) + 1));
+            insertTestData(col, new WriteConcern(getSecondaryCount(testHosts) + 1, 10000));
 
             // Get the opcounter/query data for the hosts.
             loadQueryCount(testHosts, true);
@@ -209,7 +209,7 @@
     private void insertTestData(final DBCollection pCol, WriteConcern writeConcern) throws Exception {
         // Insert some test data.
         for (int idx=0; idx < 1000; idx++) {
-            WriteConcern curWriteConcern = idx == 999 ? WriteConcern.NONE : writeConcern;
+            WriteConcern curWriteConcern = (idx < 999) ? WriteConcern.NONE : writeConcern;
             WriteResult writeResult = pCol.insert(new BasicDBObject(), curWriteConcern);
             writeResult.getLastError().throwOnError();
         }
