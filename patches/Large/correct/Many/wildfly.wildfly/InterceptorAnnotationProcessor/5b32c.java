diff --git a/ee/src/main/java/org/jboss/as/ee/component/deployers/InterceptorAnnotationProcessor.java b/ee/src/main/java/org/jboss/as/ee/component/deployers/InterceptorAnnotationProcessor.java
index 045e168..566c73b 100644
--- a/ee/src/main/java/org/jboss/as/ee/component/deployers/InterceptorAnnotationProcessor.java
+++ b/ee/src/main/java/org/jboss/as/ee/component/deployers/InterceptorAnnotationProcessor.java
@@ -82,7 +82,7 @@
         final Class<?> componentClass;
         try {
             componentClass = ClassLoadingUtils.loadClass(description.getComponentClassName(), deploymentUnit);
-        } catch (ClassNotFoundException e) {
+        } catch (Throwable e) {
             //just ignore the class for now.
             //if it is an optional component this is ok, if it is not an optional component
             //it will fail at configure time anyway
