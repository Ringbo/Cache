diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/spring/JettyHTTPServerEngineBeanDefinitionParser.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/spring/JettyHTTPServerEngineBeanDefinitionParser.java
index e61f9f7..97f66e3 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/spring/JettyHTTPServerEngineBeanDefinitionParser.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/spring/JettyHTTPServerEngineBeanDefinitionParser.java
@@ -213,7 +213,7 @@
 
         BeanDefinitionBuilder jaxbbean 
             = BeanDefinitionBuilder.rootBeanDefinition(TLSServerParametersConfig.class);
-        jaxbbean.addConstructorArg(paramsbean.getBeanDefinition());
+        jaxbbean.addConstructorArgValue(paramsbean.getBeanDefinition());
         bean.addPropertyValue("tlsServerParameters", jaxbbean.getBeanDefinition());
     }
 
