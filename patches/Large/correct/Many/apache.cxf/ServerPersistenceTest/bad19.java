diff --git a/systests/src/test/java/org/apache/cxf/systest/ws/rm/ServerPersistenceTest.java b/systests/src/test/java/org/apache/cxf/systest/ws/rm/ServerPersistenceTest.java
index 2f71020..032cbab 100644
--- a/systests/src/test/java/org/apache/cxf/systest/ws/rm/ServerPersistenceTest.java
+++ b/systests/src/test/java/org/apache/cxf/systest/ws/rm/ServerPersistenceTest.java
@@ -157,7 +157,7 @@
     }
     
     void verifyMissingResponse(Response<GreetMeResponse> responses[]) throws Exception {
-        awaitMessages(4, 7, 20000);
+        awaitMessages(4, 6, 20000);
 
         // wait another while to prove that response to second request is indeed lost
         Thread.sleep(1000);
