diff --git a/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsConfiguration.java b/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsConfiguration.java
index d394b9f..69863ae 100644
--- a/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsConfiguration.java
+++ b/components/camel-jms/src/main/java/org/apache/camel/component/jms/JmsConfiguration.java
@@ -1608,7 +1608,7 @@
      * creation
      */
     protected ConnectionFactory createListenerConnectionFactory() {
-        return getConnectionFactory();
+        return getOrCreateConnectionFactory();
     }
 
     /**
@@ -1616,7 +1616,7 @@
      * creation
      */
     protected ConnectionFactory createTemplateConnectionFactory() {
-        return getConnectionFactory();
+        return getOrCreateConnectionFactory();
     }
 
     /**
