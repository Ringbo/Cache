diff --git a/rt/rs/client/src/test/java/org/apache/cxf/jaxrs/client/JAXRSClientFactoryBeanTest.java b/rt/rs/client/src/test/java/org/apache/cxf/jaxrs/client/JAXRSClientFactoryBeanTest.java
index bb96874..24b99e6 100644
--- a/rt/rs/client/src/test/java/org/apache/cxf/jaxrs/client/JAXRSClientFactoryBeanTest.java
+++ b/rt/rs/client/src/test/java/org/apache/cxf/jaxrs/client/JAXRSClientFactoryBeanTest.java
@@ -57,7 +57,7 @@
     
     @Test
     public void testCreateClientCustomLoader() throws Exception {
-        ProxyClassLoader loader = new ProxyClassLoader();
+        ProxyClassLoader loader = new ProxyClassLoader(BookStore.class.getClassLoader());
         loader.addLoader(BookStore.class.getClassLoader());
         
         JAXRSClientFactoryBean bean = new JAXRSClientFactoryBean();
