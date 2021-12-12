diff --git a/service/src/java/org/apache/hive/service/cli/operation/SQLOperation.java b/service/src/java/org/apache/hive/service/cli/operation/SQLOperation.java
index 1a2be8b..773dd51 100644
--- a/service/src/java/org/apache/hive/service/cli/operation/SQLOperation.java
+++ b/service/src/java/org/apache/hive/service/cli/operation/SQLOperation.java
@@ -257,11 +257,12 @@
       /**
        * If the operation was cancelled by another thread, or the execution timed out, Driver#run
        * may return a non-zero response code. We will simply return if the operation state is
-       * CANCELED, TIMEDOUT or CLOSED, otherwise throw an exception
+       * CANCELED, TIMEDOUT, CLOSED or FINISHED, otherwise throw an exception
        */
       if ((getStatus().getState() == OperationState.CANCELED)
           || (getStatus().getState() == OperationState.TIMEDOUT)
-          || (getStatus().getState() == OperationState.CLOSED)) {
+          || (getStatus().getState() == OperationState.CLOSED)
+          || (getStatus().getState() == OperationState.FINISHED)) {
         LOG.warn("Ignore exception in terminal state", e);
         return;
       }
