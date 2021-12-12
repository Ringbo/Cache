diff --git a/activemq-web/src/main/java/org/apache/activemq/web/DestinationFacade.java b/activemq-web/src/main/java/org/apache/activemq/web/DestinationFacade.java
index 2b476dc..7e4e548 100644
--- a/activemq-web/src/main/java/org/apache/activemq/web/DestinationFacade.java
+++ b/activemq-web/src/main/java/org/apache/activemq/web/DestinationFacade.java
@@ -108,7 +108,7 @@
     }
 
     protected String getValidDestination() {
-        if (jmsDestination == null) {
+        if (jmsDestination == null || jmsDestination.isEmpty()) {
             throw new IllegalArgumentException("No JMSDestination parameter specified");
         }
         return jmsDestination;
