diff --git a/jaxrs/resteasy-spring/src/main/java/org/jboss/resteasy/plugins/spring/SpringBeanProcessor.java b/jaxrs/resteasy-spring/src/main/java/org/jboss/resteasy/plugins/spring/SpringBeanProcessor.java
index 0714d74..5557638 100644
--- a/jaxrs/resteasy-spring/src/main/java/org/jboss/resteasy/plugins/spring/SpringBeanProcessor.java
+++ b/jaxrs/resteasy-spring/src/main/java/org/jboss/resteasy/plugins/spring/SpringBeanProcessor.java
@@ -425,7 +425,7 @@
             }
          }
 
-         for (Method method : getBeanClass(factoryClassName).getMethods())
+         for (Method method : getBeanClass(factoryClassName).getDeclaredMethods())
          {
             if (method.getName().equals(factoryMethodName))
             {
