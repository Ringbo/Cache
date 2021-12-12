diff --git a/server/sonar-server/src/main/java/org/sonar/server/ws/WebServiceEngine.java b/server/sonar-server/src/main/java/org/sonar/server/ws/WebServiceEngine.java
index 09d178a..53da9d7 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/ws/WebServiceEngine.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/ws/WebServiceEngine.java
@@ -130,7 +130,7 @@
     return controller == null ? null : controller.action(actionKey);
   }
 
-  private void sendErrors(Response response, int status, Errors errors) {
+  private static void sendErrors(Response response, int status, Errors errors) {
     Response.Stream stream = response.stream();
     if (stream instanceof ServletResponse.ServletStream) {
       ((ServletResponse.ServletStream) stream).reset();
@@ -144,7 +144,7 @@
       json.endObject();
     } catch (Exception e) {
       // Do not hide the potential exception raised in the try block.
-      Throwables.propagate(e);
+      throw Throwables.propagate(e);
     }
   }
 
