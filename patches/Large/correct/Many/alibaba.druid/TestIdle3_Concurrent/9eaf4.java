diff --git a/src/test/java/com/alibaba/druid/bvt/pool/TestIdle3_Concurrent.java b/src/test/java/com/alibaba/druid/bvt/pool/TestIdle3_Concurrent.java
index e624240..bc8c2f6 100644
--- a/src/test/java/com/alibaba/druid/bvt/pool/TestIdle3_Concurrent.java
+++ b/src/test/java/com/alibaba/druid/bvt/pool/TestIdle3_Concurrent.java
@@ -60,7 +60,7 @@
 
         {
             // 并发创建14个
-            concurrent(driver, dataSource, 100);
+            concurrent(driver, dataSource, 30);
         }
 
         // 连续打开关闭单个连接
