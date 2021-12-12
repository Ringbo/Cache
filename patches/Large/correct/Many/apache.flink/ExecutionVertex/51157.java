diff --git a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/executiongraph/ExecutionVertex.java b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/executiongraph/ExecutionVertex.java
index fa02788..5beea18 100644
--- a/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/executiongraph/ExecutionVertex.java
+++ b/nephele/nephele-server/src/main/java/eu/stratosphere/nephele/executiongraph/ExecutionVertex.java
@@ -408,7 +408,7 @@
 		if (this.cancelRequested.compareAndSet(true, false)) {
 			final TaskCancelResult tsr = cancelTask();
 			if (tsr.getReturnCode() != AbstractTaskResult.ReturnCode.SUCCESS
-				|| tsr.getReturnCode() != AbstractTaskResult.ReturnCode.TASK_NOT_FOUND) {
+				&& tsr.getReturnCode() != AbstractTaskResult.ReturnCode.TASK_NOT_FOUND) {
 				LOG.error("Unable to cancel vertex " + this + ": " + tsr.getReturnCode().toString()
 					+ ((tsr.getDescription() != null) ? (" (" + tsr.getDescription() + ")") : ""));
 			}
