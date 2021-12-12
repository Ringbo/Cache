diff --git a/server/sonar-server/src/main/java/org/sonar/server/platform/ws/SystemWsAction.java b/server/sonar-server/src/main/java/org/sonar/server/platform/ws/SystemWsAction.java
index 21cacb6..4bf3944 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/platform/ws/SystemWsAction.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/platform/ws/SystemWsAction.java
@@ -25,5 +25,5 @@
 
 public interface SystemWsAction extends RequestHandler {
 
-  public void define(WebService.NewController controller);
+  void define(WebService.NewController controller);
 }
