diff --git a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomConsumerTest.java b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomConsumerTest.java
index 433fcdd..add0b97 100644
--- a/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomConsumerTest.java
+++ b/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/mtom/CxfMtomConsumerTest.java
@@ -88,7 +88,8 @@
     @Test
     public void testInvokingServiceFromCXFClient() throws Exception {        
         
-        if (Boolean.getBoolean("java.awt.headless")) {
+        if (Boolean.getBoolean("java.awt.headless") 
+            || System.getProperty("os.name").startsWith("Mac OS") && System.getProperty("user.name").equals("cruise")) {
             System.out.println("Running headless. Skipping test as Images may not work.");
             return;
         }        
