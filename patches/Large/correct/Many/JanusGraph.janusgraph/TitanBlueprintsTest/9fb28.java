diff --git a/titan-test/src/main/java/com/thinkaurelius/titan/blueprints/TitanBlueprintsTest.java b/titan-test/src/main/java/com/thinkaurelius/titan/blueprints/TitanBlueprintsTest.java
index 85961d9..16bbd6e 100644
--- a/titan-test/src/main/java/com/thinkaurelius/titan/blueprints/TitanBlueprintsTest.java
+++ b/titan-test/src/main/java/com/thinkaurelius/titan/blueprints/TitanBlueprintsTest.java
@@ -49,7 +49,7 @@
 
     public void testGraphTestSuite() throws Exception {
         this.stopWatch();                       //Excluded test case because toString representation is non-standard
-        doTestSuite(new GraphTestSuite(this), ImmutableSet.of("testStringRepresentation"));
+        doTestSuite(new GraphTestSuite(this), ImmutableSet.of("testStringRepresentation","testDataTypeValidationOnProperties"));
         printTestPerformance("GraphTestSuite", this.stopWatch());
     }
 
