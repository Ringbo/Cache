diff --git a/tests/test-sessions/test-hash-sessions/src/test/java/org/eclipse/jetty/server/session/RedirectSessionTest.java b/tests/test-sessions/test-hash-sessions/src/test/java/org/eclipse/jetty/server/session/RedirectSessionTest.java
index cc7d0d4..c35222b 100644
--- a/tests/test-sessions/test-hash-sessions/src/test/java/org/eclipse/jetty/server/session/RedirectSessionTest.java
+++ b/tests/test-sessions/test-hash-sessions/src/test/java/org/eclipse/jetty/server/session/RedirectSessionTest.java
@@ -48,7 +48,7 @@
     @Test
     public void testSessionRedirect() throws Exception
     {
-        AbstractTestServer testServer = new HashTestServer(0);
+        AbstractTestServer testServer = new HashTestServer(0, -1, 60, SessionCache.NEVER_EVICT);
         ServletContextHandler testServletContextHandler = testServer.addContext("/context");
         testServletContextHandler.addServlet(Servlet1.class, "/one");
         testServletContextHandler.addServlet(Servlet2.class, "/two");
