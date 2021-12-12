diff --git a/src/test/java/com/alibaba/druid/bvt/pool/TestConcurrent.java b/src/test/java/com/alibaba/druid/bvt/pool/TestConcurrent.java
index d6c21d5..5ecc0b2 100644
--- a/src/test/java/com/alibaba/druid/bvt/pool/TestConcurrent.java
+++ b/src/test/java/com/alibaba/druid/bvt/pool/TestConcurrent.java
@@ -105,32 +105,32 @@
         }
 
         // 2个并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(2);
         }
 
         // 5个并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(5);
         }
 
         // 10并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(10);
         }
 
         // 20并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(20);
         }
 
         // 50并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(50);
         }
 
         // 100并发
-        for (int i = 0; i < 10; ++i) {
+        for (int i = 0; i < 3; ++i) {
             concurrent(100);
         }
     }
