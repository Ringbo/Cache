diff --git a/src/main/java/com/yammer/metrics/core/DeadlockHealthCheck.java b/src/main/java/com/yammer/metrics/core/DeadlockHealthCheck.java
index bdb053b..4e97f8e 100644
--- a/src/main/java/com/yammer/metrics/core/DeadlockHealthCheck.java
+++ b/src/main/java/com/yammer/metrics/core/DeadlockHealthCheck.java
@@ -10,7 +10,7 @@
 	@Override
 	public Result check() throws Exception {
 		final Set<String> threads = VirtualMachineMetrics.deadlockedThreads();
-		if (threads.isEmpty()) {
+		if (!threads.isEmpty()) {
 			final StringBuilder builder = new StringBuilder("Deadlocked threads detected:\n");
 			for (String thread : threads) {
 				builder.append(thread).append('\n');
