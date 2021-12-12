diff --git a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomRouterPayloadModeTest.java b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomRouterPayloadModeTest.java
index c5d8a1e..64acdc9 100644
--- a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomRouterPayloadModeTest.java
+++ b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomRouterPayloadModeTest.java
@@ -73,7 +73,8 @@
     @Test
     public void testInvokingServiceFromCXFClient() throws Exception {        
         
-        if (Boolean.getBoolean("java.awt.headless")) {
+        if (Boolean.getBoolean("java.awt.headless")
+            || System.getProperty("os.name").startsWith("Mac OS") && System.getProperty("user.name").equals("cruise")) {
             System.out.println("Running headless. Skipping test as Images may not work.");
             return;
         }        
