diff --git a/drools-scorecards/src/main/java/org/drools/scorecards/pmml/ScorecardPMMLGenerator.java b/drools-scorecards/src/main/java/org/drools/scorecards/pmml/ScorecardPMMLGenerator.java
index 1eed98e..5d36863 100644
--- a/drools-scorecards/src/main/java/org/drools/scorecards/pmml/ScorecardPMMLGenerator.java
+++ b/drools-scorecards/src/main/java/org/drools/scorecards/pmml/ScorecardPMMLGenerator.java
@@ -224,7 +224,7 @@
                 }
                 output.getOutputFields().add(outputField);
 
-                if ( pmmlScorecard.isUseReasonCodes() ) {
+                if ( pmmlScorecard.getUseReasonCodes() ) {
                     OutputField reasonCodeField = new OutputField();
                     reasonCodeField.setDataType( DATATYPE.STRING );
                     reasonCodeField.setFeature( RESULTFEATURE.REASON_CODE );
