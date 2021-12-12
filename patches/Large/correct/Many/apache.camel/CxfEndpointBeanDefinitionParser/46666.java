diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanDefinitionParser.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanDefinitionParser.java
index ee4a082..14ee7b9 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanDefinitionParser.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/spring/CxfEndpointBeanDefinitionParser.java
@@ -40,7 +40,7 @@
 
     @Override
     protected Class getBeanClass(Element arg0) {
-        return CxfEndpointBean.class;
+        return CxfSpringEndpointBean.class;
     }
 
     @Override
