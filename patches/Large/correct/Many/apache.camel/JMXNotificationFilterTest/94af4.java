diff --git a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXNotificationFilterTest.java b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXNotificationFilterTest.java
index 0b2d1c5..796656f 100644
--- a/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXNotificationFilterTest.java
+++ b/components/camel-jmx/src/test/java/org/apache/camel/component/jmx/JMXNotificationFilterTest.java
@@ -74,7 +74,7 @@
         super.initRegistry();
 
         // initialize the registry with our filter
-        getRegistry().put("myFilter", new NotificationFilter() {
+        getRegistry().bind("myFilter", new NotificationFilter() {
 
             private static final long serialVersionUID = 1L;
 
