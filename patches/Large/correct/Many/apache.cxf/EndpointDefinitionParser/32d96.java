diff --git a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/spring/EndpointDefinitionParser.java b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/spring/EndpointDefinitionParser.java
index 099ea9b..d52dec5 100644
--- a/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/spring/EndpointDefinitionParser.java
+++ b/rt/frontend/jaxws/src/main/java/org/apache/cxf/jaxws/spring/EndpointDefinitionParser.java
@@ -188,7 +188,7 @@
             for (BeanPostProcessor bpp : dlbf.getBeanPostProcessors()) {
                 if (cls != null && cls.isInstance(bpp)) {
                     impl.getServerFactory().setBlockPostConstruct(true);
-                    impl.getServerFactory().setBlockInjection(true);
+                    impl.getServerFactory().setBlockInjection(false);
                     return;
                 }
                 if (bpp instanceof Jsr250BeanPostProcessor) {
