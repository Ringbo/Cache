diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/BusinessViewAnnotationProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/BusinessViewAnnotationProcessor.java
index 67c8510..f5776bf 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/BusinessViewAnnotationProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/BusinessViewAnnotationProcessor.java
@@ -133,7 +133,7 @@
         // fetch the local business interfaces of the bean
         Collection<Class<?>> localBusinessInterfaces = this.getLocalBusinessInterfaces(deploymentUnit, sessionBeanClass);
         if (localBusinessInterfaces != null && !localBusinessInterfaces.isEmpty()) {
-            verifyViewMethodsNotDeclaredFinal(sessionBeanClass, remoteBusinessInterfaces);
+            verifyViewMethodsNotDeclaredFinal(sessionBeanClass, localBusinessInterfaces);
             sessionBeanComponentDescription.addLocalBusinessInterfaceViews(this.toString(localBusinessInterfaces));
         }
 
@@ -208,7 +208,7 @@
             for (Method ifceMethod : ifce.getMethods()) {
                 try {
                     final Method beanMethod = sessionBeanClass.getMethod(ifceMethod.getName(), ifceMethod.getParameterTypes());
-                    if ((beanMethod.getModifiers() & Modifier.FINAL) == Modifier.FINAL) {
+                    if (Modifier.isFinal(beanMethod.getModifiers())) {
                         throw EjbLogger.ROOT_LOGGER.businessViewMethodDeclaredFinal(beanMethod.getName(), sessionBeanClass.getName());
                     }
                 } catch (NoSuchMethodException e) {
