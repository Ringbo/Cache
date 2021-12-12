diff --git a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
index 56712f6..ecfb47e 100644
--- a/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
+++ b/src/main/java/com/alibaba/druid/pool/DruidDataSource.java
@@ -1834,7 +1834,7 @@
                         try {
                             notEmpty.signalAll();
                         } finally {
-                            lock.lock();
+                            lock.unlock();
                         }
                     }
 
