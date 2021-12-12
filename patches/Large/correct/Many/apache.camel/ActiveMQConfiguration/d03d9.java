diff --git a/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQConfiguration.java b/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQConfiguration.java
index 86af7a0..f716278 100644
--- a/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQConfiguration.java
+++ b/components/camel-activemq/src/main/java/org/apache/camel/component/activemq/ActiveMQConfiguration.java
@@ -134,7 +134,7 @@
      */
     @Override
     protected PlatformTransactionManager createTransactionManager() {
-        JmsTransactionManager answer = new JmsTransactionManager(getConnectionFactory());
+        JmsTransactionManager answer = new JmsTransactionManager(getOrCreateConnectionFactory());
         answer.afterPropertiesSet();
         return answer;
     }
