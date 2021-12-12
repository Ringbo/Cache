diff --git a/pinot-minion/src/main/java/com/linkedin/pinot/minion/executor/BaseSegmentConversionExecutor.java b/pinot-minion/src/main/java/com/linkedin/pinot/minion/executor/BaseSegmentConversionExecutor.java
index fec71ff..4f36023 100644
--- a/pinot-minion/src/main/java/com/linkedin/pinot/minion/executor/BaseSegmentConversionExecutor.java
+++ b/pinot-minion/src/main/java/com/linkedin/pinot/minion/executor/BaseSegmentConversionExecutor.java
@@ -157,7 +157,7 @@
               return true;
             } catch (HttpErrorStatusException e) {
               int statusCode = e.getStatusCode();
-              if (statusCode == HttpStatus.SC_CONFLICT || statusCode > 500) {
+              if (statusCode == HttpStatus.SC_CONFLICT || statusCode >= 500) {
                 // Temporary exception
                 LOGGER.warn("Caught temporary exception while uploading segment: {}, will retry", segmentName, e);
                 return false;
