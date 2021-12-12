diff --git a/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletConfigurationTest.java b/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletConfigurationTest.java
index d8f2be9..f5ec7e5 100644
--- a/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletConfigurationTest.java
+++ b/components/camel-restlet/src/test/java/org/apache/camel/component/restlet/RestletConfigurationTest.java
@@ -34,7 +34,7 @@
 
     @Test
     public void testConfiguration() throws Exception {
-        assertNotPresent(GsonConverter.class);
+        assertPresent(GsonConverter.class);
         assertPresent(JacksonConverter.class);
     }
 
