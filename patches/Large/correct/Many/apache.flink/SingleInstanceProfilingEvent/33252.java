diff --git a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/SingleInstanceProfilingEvent.java b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/SingleInstanceProfilingEvent.java
index e7545fa..f51658a 100644
--- a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/SingleInstanceProfilingEvent.java
+++ b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/SingleInstanceProfilingEvent.java
@@ -86,7 +86,7 @@
 
 		final SingleInstanceProfilingEvent singleInstanceProfilingEvent = (SingleInstanceProfilingEvent) obj;
 
-		if (this.instanceName.equals(singleInstanceProfilingEvent.getInstanceName())) {
+		if (!this.instanceName.equals(singleInstanceProfilingEvent.getInstanceName())) {
 			return false;
 		}
 
