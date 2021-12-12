diff --git a/sonar-core/src/main/java/org/sonar/core/measure/MeasureFilterEngine.java b/sonar-core/src/main/java/org/sonar/core/measure/MeasureFilterEngine.java
index 577d1af..6e98b78 100644
--- a/sonar-core/src/main/java/org/sonar/core/measure/MeasureFilterEngine.java
+++ b/sonar-core/src/main/java/org/sonar/core/measure/MeasureFilterEngine.java
@@ -62,7 +62,7 @@
 
     } catch (NumberFormatException e) {
       result.setError(MeasureFilterResult.Error.VALUE_SHOULD_BE_A_NUMBER);
-      LOG.error("Value selected for the metric should be a number: " + context);
+      LOG.debug("Value selected for the metric should be a number: " + context);
     } catch (Exception e) {
       result.setError(MeasureFilterResult.Error.UNKNOWN);
       LOG.error("Fail to execute measure filter: " + context, e);
