diff --git a/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQComponent.java b/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQComponent.java
index 64ed701..25f8980 100644
--- a/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQComponent.java
+++ b/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQComponent.java
@@ -198,7 +198,7 @@
         }
 
         // use OriginalDestinationPropagateStrategy by default if no custom
-        // stategy has been set
+        // strategy has been set
         if (getMessageCreatedStrategy() == null) {
             setMessageCreatedStrategy(new OriginalDestinationPropagateStrategy());
         }
@@ -208,7 +208,7 @@
         try {
             if (source == null) {
                 if (connection == null) {
-                    Connection value = getConfiguration().getConnectionFactory().createConnection();
+                    Connection value = getConfiguration().getOrCreateConnectionFactory().createConnection();
                     if (value instanceof EnhancedConnection) {
                         connection = (EnhancedConnection)value;
                     } else {
