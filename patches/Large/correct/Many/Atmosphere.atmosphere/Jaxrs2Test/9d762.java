diff --git a/extras/jaxrs2/src/test/java/org/atmosphere/tests/jaxrs2/Jaxrs2Test.java b/extras/jaxrs2/src/test/java/org/atmosphere/tests/jaxrs2/Jaxrs2Test.java
index e14d6c3..765e3a4 100644
--- a/extras/jaxrs2/src/test/java/org/atmosphere/tests/jaxrs2/Jaxrs2Test.java
+++ b/extras/jaxrs2/src/test/java/org/atmosphere/tests/jaxrs2/Jaxrs2Test.java
@@ -55,7 +55,7 @@
     }
 
     public void startServer() throws Exception {
-        server = new Server(port);
+        server = new Server();
         root = new Context(server, "/", Context.SESSIONS);
         root.addServlet(new ServletHolder(atmoServlet), ROOT);
 
