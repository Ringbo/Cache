diff --git a/src/com/facebook/buck/json/ProjectBuildFileParser.java b/src/com/facebook/buck/json/ProjectBuildFileParser.java
index 1d04ff5..9a71b1f 100644
--- a/src/com/facebook/buck/json/ProjectBuildFileParser.java
+++ b/src/com/facebook/buck/json/ProjectBuildFileParser.java
@@ -311,7 +311,7 @@
         Preconditions.checkState(deserializedValue instanceof List<?>);
         result = (List<Map<String, Object>>) deserializedValue;
       } catch (BserDeserializer.BserEofException e) {
-        LOG.error(e, "Parser exited while decoding BSER data");
+        LOG.warn(e, "Parser exited while decoding BSER data");
         throw new IOException("Parser exited unexpectedly", e);
       }
     } else {
@@ -367,7 +367,7 @@
         LOG.debug("Waiting for process %s to exit...", buckPyProcess);
         int exitCode = processExecutor.waitForLaunchedProcess(buckPyProcess);
         if (exitCode != 0) {
-          LOG.error("Process %s exited with error code %d", buckPyProcess, exitCode);
+          LOG.warn("Process %s exited with error code %d", buckPyProcess, exitCode);
           throw BuildFileParseException.createForUnknownParseError(
               String.format("Parser did not exit cleanly (exit code: %d)", exitCode));
         }
