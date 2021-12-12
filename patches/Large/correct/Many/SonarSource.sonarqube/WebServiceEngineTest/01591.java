diff --git a/server/sonar-server/src/test/java/org/sonar/server/ws/WebServiceEngineTest.java b/server/sonar-server/src/test/java/org/sonar/server/ws/WebServiceEngineTest.java
index 5c36bb5..40e505f 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/ws/WebServiceEngineTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/ws/WebServiceEngineTest.java
@@ -291,7 +291,7 @@
   }
 
   @Test
-  public void should_handle_headers() throws Exception {
+  public void should_handle_headers() {
     ServletResponse response = new ServletResponse();
     String name = "Content-Disposition";
     String value = "attachment; filename=sonarqube.zip";
