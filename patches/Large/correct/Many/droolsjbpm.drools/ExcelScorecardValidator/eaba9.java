diff --git a/drools-scorecards/src/main/java/org/drools/scorecards/parser/xls/ExcelScorecardValidator.java b/drools-scorecards/src/main/java/org/drools/scorecards/parser/xls/ExcelScorecardValidator.java
index 6e57364..7a34171 100644
--- a/drools-scorecards/src/main/java/org/drools/scorecards/parser/xls/ExcelScorecardValidator.java
+++ b/drools-scorecards/src/main/java/org/drools/scorecards/parser/xls/ExcelScorecardValidator.java
@@ -45,7 +45,7 @@
         ExcelScorecardValidator validator = new ExcelScorecardValidator(scorecard, parseErrors);
         validator.checkForInvalidDataTypes();
         validator.checkForMissingAttributes();
-        if (scorecard.isUseReasonCodes()){
+        if (scorecard.getUseReasonCodes()){
             validator.validateReasonCodes();
             validator.validateBaselineScores();
         }
