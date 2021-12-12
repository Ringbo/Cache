diff --git a/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java b/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
index 7c3f65b..ef1e7eb 100644
--- a/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
+++ b/camel-core/src/main/java/org/apache/camel/component/bean/RegistryBean.java
@@ -58,7 +58,7 @@
         return new ConstantBeanHolder(getBean(), getBeanInfo());
     }
 
-    public Object getBean() throws NoSuchBeanException {
+    public synchronized Object getBean() throws NoSuchBeanException {
         Object value = lookupBean();
         if (value == null) {
             // maybe its a class
