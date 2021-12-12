diff --git a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/ThreadProfilingEvent.java b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/ThreadProfilingEvent.java
index e57d87f..15a6a5c 100644
--- a/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/ThreadProfilingEvent.java
+++ b/nephele/nephele-management/src/main/java/eu/stratosphere/nephele/profiling/types/ThreadProfilingEvent.java
@@ -124,7 +124,7 @@
 	@Override
 	public boolean equals(Object obj) {
 
-		if (super.equals(obj)) {
+		if (!super.equals(obj)) {
 			return false;
 		}
 
