diff --git a/h2o-core/src/test/java/water/RemoteRunnableTest.java b/h2o-core/src/test/java/water/RemoteRunnableTest.java
index 39e669b..9517aa4 100644
--- a/h2o-core/src/test/java/water/RemoteRunnableTest.java
+++ b/h2o-core/src/test/java/water/RemoteRunnableTest.java
@@ -14,7 +14,7 @@
   
   @BeforeClass
   static public void setup() {
-    stall_till_cloudsize(2);
+    stall_till_cloudsize(5);
   }
 
   @Test
