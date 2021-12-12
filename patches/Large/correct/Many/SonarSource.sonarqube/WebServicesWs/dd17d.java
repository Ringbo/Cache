diff --git a/server/sonar-server/src/main/java/org/sonar/server/ws/WebServicesWs.java b/server/sonar-server/src/main/java/org/sonar/server/ws/WebServicesWs.java
index 3012144..1eaaad6 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/ws/WebServicesWs.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/ws/WebServicesWs.java
@@ -72,11 +72,11 @@
       .setDefaultValue("false");
   }
 
-  private void defineResponseExample(final Context context, NewController controller) {
+  private static void defineResponseExample(final Context context, NewController controller) {
     NewAction action = controller
       .createAction("response_example")
       .setDescription("Display web service response example")
-      .setResponseExample(getClass().getResource("response_example-example.json"))
+      .setResponseExample(WebServicesWs.class.getResource("response_example-example.json"))
       .setSince("4.4")
       .setHandler(new RequestHandler() {
         @Override
@@ -161,7 +161,7 @@
     }
   }
 
-  private void writeAction(JsonWriter writer, Action action, boolean includeInternals) {
+  private static void writeAction(JsonWriter writer, Action action, boolean includeInternals) {
     if (includeInternals || !action.isInternal()) {
       writer.beginObject();
       writer.prop("key", action.key());
