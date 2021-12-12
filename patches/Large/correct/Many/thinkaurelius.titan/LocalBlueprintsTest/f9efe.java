diff --git a/src/test/java/com/thinkaurelius/titan/blueprints/LocalBlueprintsTest.java b/src/test/java/com/thinkaurelius/titan/blueprints/LocalBlueprintsTest.java
index 5b31c34..6d52d70 100644
--- a/src/test/java/com/thinkaurelius/titan/blueprints/LocalBlueprintsTest.java
+++ b/src/test/java/com/thinkaurelius/titan/blueprints/LocalBlueprintsTest.java
@@ -54,7 +54,7 @@
 
     public void testKeyIndexableGraphTestSuite() throws Exception {
         this.stopWatch();                                   //Excluded test cases because Titan does not yet support dropping or modifying key indexes
-        doTestSuite(new KeyIndexableGraphTestSuite(this), ImmutableSet.of("testAutoIndexKeyDroppingWithPersistence","testReIndexingOfElements","testGettingVerticesAndEdgesWithKeyValue"));
+        doTestSuite(new KeyIndexableGraphTestSuite(this), ImmutableSet.of("testAutoIndexKeyDroppingWithPersistence","testReIndexingOfElements"));
         printTestPerformance("KeyIndexableGraphTestSuite", this.stopWatch());
     }
 
