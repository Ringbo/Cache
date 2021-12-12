diff --git a/server/sonar-server/src/main/java/org/sonar/server/measure/ws/TimeMachineWs.java b/server/sonar-server/src/main/java/org/sonar/server/measure/ws/TimeMachineWs.java
index e8d4f35..84015e2 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/measure/ws/TimeMachineWs.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/measure/ws/TimeMachineWs.java
@@ -33,7 +33,7 @@
     controller.done();
   }
 
-  private void defineIndexAction(NewController controller) {
+  private static void defineIndexAction(NewController controller) {
     controller.createAction("index")
       .setDescription("The web service is removed and you're invited to use api/measures/search_history instead")
       .setSince("2.10")
