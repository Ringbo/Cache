diff --git a/src/java/org/apache/cassandra/utils/HeapUtils.java b/src/java/org/apache/cassandra/utils/HeapUtils.java
index 65364d8..8f61470 100644
--- a/src/java/org/apache/cassandra/utils/HeapUtils.java
+++ b/src/java/org/apache/cassandra/utils/HeapUtils.java
@@ -188,7 +188,7 @@
         String jvmName = ManagementFactory.getRuntimeMXBean().getName();
         try
         {
-            return Long.parseLong(jvmName.split("@")[0]);
+            return Long.valueOf(jvmName.split("@")[0]);
         }
         catch (NumberFormatException e)
         {
