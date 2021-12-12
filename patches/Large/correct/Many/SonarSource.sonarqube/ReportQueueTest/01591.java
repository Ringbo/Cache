diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/ReportQueueTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/ReportQueueTest.java
index 137eb42..ffd7335 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/ReportQueueTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/ReportQueueTest.java
@@ -80,7 +80,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     session.close();
   }
 
