diff --git a/drools-scorecards/src/test/java/org/drools/scorecards/ScorecardReasonCodeTest.java b/drools-scorecards/src/test/java/org/drools/scorecards/ScorecardReasonCodeTest.java
index 7276f79..e48a74a 100644
--- a/drools-scorecards/src/test/java/org/drools/scorecards/ScorecardReasonCodeTest.java
+++ b/drools-scorecards/src/test/java/org/drools/scorecards/ScorecardReasonCodeTest.java
@@ -68,7 +68,7 @@
         PMML pmml = scorecardCompiler.getPMMLDocument();
         for (Object serializable : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels()){
             if (serializable instanceof Scorecard){
-                assertFalse(((Scorecard) serializable).isUseReasonCodes());
+                assertFalse(((Scorecard) serializable).getUseReasonCodes());
             }
         }
     }
@@ -87,7 +87,7 @@
 
         for (Object serializable : pmmlDocument.getAssociationModelsAndBaselineModelsAndClusteringModels()){
             if (serializable instanceof Scorecard){
-                assertTrue(((Scorecard)serializable).isUseReasonCodes());
+                assertTrue(((Scorecard)serializable).getUseReasonCodes());
                 assertEquals(100.0, ((Scorecard)serializable).getInitialScore(), 0.0);
                 assertEquals("pointsBelow",((Scorecard)serializable).getReasonCodeAlgorithm());
             }
