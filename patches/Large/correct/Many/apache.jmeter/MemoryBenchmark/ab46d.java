diff --git a/src/monitor/components/org/apache/jmeter/monitor/util/MemoryBenchmark.java b/src/monitor/components/org/apache/jmeter/monitor/util/MemoryBenchmark.java
index 8712b3b..9a34985 100644
--- a/src/monitor/components/org/apache/jmeter/monitor/util/MemoryBenchmark.java
+++ b/src/monitor/components/org/apache/jmeter/monitor/util/MemoryBenchmark.java
@@ -28,7 +28,7 @@
 public class MemoryBenchmark {
 
     public static void main(String[] args) {
-        if (args.length != 1) {
+        if (args.length == 1) {
             int objects = 10000;
             if (args[0] != null) {
                 objects = Integer.parseInt(args[0]);
