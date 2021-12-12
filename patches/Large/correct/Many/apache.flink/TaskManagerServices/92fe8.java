diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerServices.java b/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerServices.java
index e211fc0..d4e27e0 100755
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerServices.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/taskexecutor/TaskManagerServices.java
@@ -527,14 +527,14 @@
 
 	@VisibleForTesting
 	public static ResourceProfile computeSlotResourceProfile(int numOfSlots, long managedMemorySize) {
-		int managedMemoryPerSlot = (int) (managedMemorySize / numOfSlots);
+		int managedMemoryPerSlotMB = (int) bytesToMegabytes(managedMemorySize / numOfSlots);
 		return new ResourceProfile(
 			Double.MAX_VALUE,
 			Integer.MAX_VALUE,
 			Integer.MAX_VALUE,
 			Integer.MAX_VALUE,
 			Integer.MAX_VALUE,
-			managedMemoryPerSlot,
+			managedMemoryPerSlotMB,
 			Collections.emptyMap());
 	}
 
