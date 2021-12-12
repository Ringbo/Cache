diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
index edc3a7e..e634988 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSClientServerSpringBookTest.java
@@ -67,7 +67,7 @@
     public static void startServers() throws Exception {
         AbstractResourceInfo.clearAllMaps();
         assertTrue("server did not launch correctly", 
-                   launchServer(BookServerSpring.class, true));
+                   launchServer(BookServerSpring.class));
         createStaticBus();
     }
     
