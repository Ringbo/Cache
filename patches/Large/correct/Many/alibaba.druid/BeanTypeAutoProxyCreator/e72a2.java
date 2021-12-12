diff --git a/src/main/java/com/alibaba/druid/support/spring/stat/BeanTypeAutoProxyCreator.java b/src/main/java/com/alibaba/druid/support/spring/stat/BeanTypeAutoProxyCreator.java
index 42409d8..6ce7f98 100644
--- a/src/main/java/com/alibaba/druid/support/spring/stat/BeanTypeAutoProxyCreator.java
+++ b/src/main/java/com/alibaba/druid/support/spring/stat/BeanTypeAutoProxyCreator.java
@@ -52,7 +52,7 @@
         this.targetBeanType = targetClass;
     }
 
-    public void setApplicationContext(ApplicationContext context) throws BeansException {
+    public void setApplicationContext(ApplicationContext context) {
         this.context = context;
     }
 
