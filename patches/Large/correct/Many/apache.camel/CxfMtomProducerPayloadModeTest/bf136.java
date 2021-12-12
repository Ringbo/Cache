diff --git a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomProducerPayloadModeTest.java b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomProducerPayloadModeTest.java
index baf6140..7fb3c4c 100644
--- a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomProducerPayloadModeTest.java
+++ b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomProducerPayloadModeTest.java
@@ -79,7 +79,8 @@
     @Test
     public void testProducer() throws Exception {
         
-        if (Boolean.getBoolean("java.awt.headless")) {
+        if (Boolean.getBoolean("java.awt.headless")
+            || System.getProperty("os.name").startsWith("Mac OS") && System.getProperty("user.name").equals("cruise")) {
             System.out.println("Running headless. Skipping test as Images may not work.");
             return;
         }     
