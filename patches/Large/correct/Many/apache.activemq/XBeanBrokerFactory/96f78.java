diff --git a/activemq-core/src/main/java/org/apache/activemq/xbean/XBeanBrokerFactory.java b/activemq-core/src/main/java/org/apache/activemq/xbean/XBeanBrokerFactory.java
index a6726b5..91a2c17 100644
--- a/activemq-core/src/main/java/org/apache/activemq/xbean/XBeanBrokerFactory.java
+++ b/activemq-core/src/main/java/org/apache/activemq/xbean/XBeanBrokerFactory.java
@@ -39,9 +39,9 @@
         String uri = config.getSchemeSpecificPart();
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(uri);
 
-        XBeanBrokerService broker = null;
+        BrokerService broker = null;
         try {
-            broker = (XBeanBrokerService) context.getBean("broker");
+            broker = (BrokerService) context.getBean("broker");
         }
         catch (BeansException e) {
         }
@@ -51,7 +51,7 @@
             String[] names = context.getBeanNamesForType(BrokerService.class);
             for (int i = 0; i < names.length; i++) {
                 String name = names[i];
-                broker = (XBeanBrokerService) context.getBean(name);
+                broker = (BrokerService) context.getBean(name);
                 if (broker != null) {
                     break;
                 }
