diff --git a/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java b/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
index c68b95c..5b66980 100644
--- a/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
+++ b/src/main/java/org/redisson/connection/MasterSlaveConnectionManager.java
@@ -201,7 +201,7 @@
 
         try {
             initEntry(config);
-        } catch (Exception e) {
+        } catch (RuntimeException e) {
             try {
                 group.shutdownGracefully().await();
             } catch (Exception e1) {
