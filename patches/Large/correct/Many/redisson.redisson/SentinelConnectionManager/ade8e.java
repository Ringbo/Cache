diff --git a/src/main/java/org/redisson/connection/SentinelConnectionManager.java b/src/main/java/org/redisson/connection/SentinelConnectionManager.java
index 4f43d48..ab1dcd7 100755
--- a/src/main/java/org/redisson/connection/SentinelConnectionManager.java
+++ b/src/main/java/org/redisson/connection/SentinelConnectionManager.java
@@ -203,7 +203,7 @@
             String ip = parts[2];
             String port = parts[3];
 
-            String slaveAddr = ip + ":" + port;
+            final String slaveAddr = ip + ":" + port;
 
             // to avoid addition twice
             if (slaves.putIfAbsent(slaveAddr, true) == null && config.getReadMode() == ReadMode.SLAVE) {
