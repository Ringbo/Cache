diff --git a/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java b/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
index 0cf4343..f6e27e4 100644
--- a/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
+++ b/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
@@ -58,7 +58,7 @@
         return new ConstantBeanHolder(getBean(), getBeanInfo());
     }
 
-    public Object getBean() throws Exception {
+    public Object getBean() throws NoBeanAvailableException {
         Object value = lookupBean();
         if (value == null) {
             throw new NoBeanAvailableException(name);
@@ -124,7 +124,7 @@
         return BeanInfo.createParameterMappingStrategy(context);
     }
 
-    protected Object lookupBean() throws Exception {
+    protected Object lookupBean() {
         return registry.lookup(name);
     }
 }
