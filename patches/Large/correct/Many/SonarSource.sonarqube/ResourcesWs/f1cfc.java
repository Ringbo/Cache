diff --git a/server/sonar-server/src/main/java/org/sonar/server/component/ws/ResourcesWs.java b/server/sonar-server/src/main/java/org/sonar/server/component/ws/ResourcesWs.java
index 299102c..1edb566 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/component/ws/ResourcesWs.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/component/ws/ResourcesWs.java
@@ -33,7 +33,7 @@
     controller.done();
   }
 
-  private void defineIndexAction(NewController controller) {
+  private static void defineIndexAction(NewController controller) {
     controller.createAction("index")
       .setDescription("The web service is removed and you're invited to use the alternatives: " +
         "<ul>" +
