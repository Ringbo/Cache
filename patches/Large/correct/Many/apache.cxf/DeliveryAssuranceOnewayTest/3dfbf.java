diff --git a/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/DeliveryAssuranceOnewayTest.java b/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/DeliveryAssuranceOnewayTest.java
index 9068de4..5fe933f 100644
--- a/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/DeliveryAssuranceOnewayTest.java
+++ b/systests/ws-rm/src/test/java/org/apache/cxf/systest/ws/rm/DeliveryAssuranceOnewayTest.java
@@ -250,7 +250,7 @@
         int num = 1;
         greeter.greetMe(Integer.toString(num++));
         for (int c = 2; c <= numMessages; c++) {
-            int currentNum = num++;
+            final int currentNum = num++;
             Thread.sleep(100);
             executor.submit(new Runnable() {
 
