diff --git a/sonar-ws-client/src/main/java/org/sonar/wsclient/project/NewProject.java b/sonar-ws-client/src/main/java/org/sonar/wsclient/project/NewProject.java
index 03cb546..6339ae6 100644
--- a/sonar-ws-client/src/main/java/org/sonar/wsclient/project/NewProject.java
+++ b/sonar-ws-client/src/main/java/org/sonar/wsclient/project/NewProject.java
@@ -33,7 +33,7 @@
     params = new HashMap<String, Object>();
   }
 
-  public static final NewProject create() {
+  public static NewProject create() {
     return new NewProject();
   }
 
