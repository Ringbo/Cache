diff --git a/junit-platform-engine/src/test/java/org/junit/platform/engine/test/event/ExecutionEventRecorder.java b/junit-platform-engine/src/test/java/org/junit/platform/engine/test/event/ExecutionEventRecorder.java
index 578ae4c..296895d 100644
--- a/junit-platform-engine/src/test/java/org/junit/platform/engine/test/event/ExecutionEventRecorder.java
+++ b/junit-platform-engine/src/test/java/org/junit/platform/engine/test/event/ExecutionEventRecorder.java
@@ -103,7 +103,7 @@
 	}
 
 	public long getDynamicTestRegisteredCount() {
-		return testEventsByType(DYNAMIC_TEST_REGISTERED).count();
+		return eventsByTypeAndTestDescriptor(DYNAMIC_TEST_REGISTERED, descriptor -> true).count();
 	}
 
 	public long getTestFinishedCount() {
