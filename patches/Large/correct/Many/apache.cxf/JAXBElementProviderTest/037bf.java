diff --git a/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/JAXBElementProviderTest.java b/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/JAXBElementProviderTest.java
index 6a34208..712dd29 100644
--- a/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/JAXBElementProviderTest.java
+++ b/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/JAXBElementProviderTest.java
@@ -836,10 +836,11 @@
     }
     
     @Test
-    public void testSetSchemasFromDisk() {
+    public void testSetSchemasFromDisk() throws Exception {
         JAXBElementProvider provider = new JAXBElementProvider();
         List<String> locations = new ArrayList<String>();
-        String loc = getClass().getClassLoader().getResource("test.xsd").getFile();
+        String loc = getClass().getClassLoader().getResource("test.xsd").toURI().getPath();
+        
         locations.add(loc);
         provider.setSchemas(locations);
         Schema s = provider.getSchema();
