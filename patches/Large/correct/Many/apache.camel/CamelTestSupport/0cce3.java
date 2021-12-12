diff --git a/components/camel-test/src/main/java/org/apache/camel/test/junit4/CamelTestSupport.java b/components/camel-test/src/main/java/org/apache/camel/test/junit4/CamelTestSupport.java
index 59344ae..3b9df02 100644
--- a/components/camel-test/src/main/java/org/apache/camel/test/junit4/CamelTestSupport.java
+++ b/components/camel-test/src/main/java/org/apache/camel/test/junit4/CamelTestSupport.java
@@ -410,7 +410,7 @@
 
     @After
     public void tearDown() throws Exception {
-        long time = watch.stop();
+        long time = watch.taken();
 
         log.info("********************************************************************************");
         log.info("Testing done: " + getTestMethodName() + "(" + getClass().getName() + ")");
@@ -422,7 +422,7 @@
             String dir = "target/camel-route-coverage";
             String name = className + "-" + getTestMethodName() + ".xml";
 
-            ManagedCamelContextMBean managedCamelContext = context.getManagedCamelContext();
+            ManagedCamelContextMBean managedCamelContext = context != null ? context.getManagedCamelContext() : null;
             if (managedCamelContext == null) {
                 log.warn("Cannot dump route coverage to file as JMX is not enabled. Override useJmx() method to enable JMX in the unit test classes.");
             } else {
