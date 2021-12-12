diff --git a/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java b/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
index 2c32c26..536980b 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/core/VirtualMachineMetrics.java
@@ -151,7 +151,7 @@
     public static Map<String, GarbageCollector> garbageCollectors() {
         final Map<String, GarbageCollector> gcs = new HashMap<String, GarbageCollector>();
         for (GarbageCollectorMXBean bean : getGarbageCollectorMXBeans()) {
-            gcs.put(bean.getName(), new GarbageCollector(bean.getCollectionCount(), bean.getCollectionCount()));
+            gcs.put(bean.getName(), new GarbageCollector(bean.getCollectionCount(), bean.getCollectionTime()));
         }
         return gcs;
     }
