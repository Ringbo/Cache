diff --git a/metrics-sigar/src/main/java/com/yammer/metrics/sigar/CpuMetrics.java b/metrics-sigar/src/main/java/com/yammer/metrics/sigar/CpuMetrics.java
index c8d946c..d66931b 100644
--- a/metrics-sigar/src/main/java/com/yammer/metrics/sigar/CpuMetrics.java
+++ b/metrics-sigar/src/main/java/com/yammer/metrics/sigar/CpuMetrics.java
@@ -148,7 +148,7 @@
     private CpuInfo cpuInfo() {
         try {
             CpuInfo[] infos = sigar.getCpuInfoList();
-            if (infos == null | infos.length == 0) {
+            if (infos == null || infos.length == 0) {
                 return null;
             }
             return infos[0];
