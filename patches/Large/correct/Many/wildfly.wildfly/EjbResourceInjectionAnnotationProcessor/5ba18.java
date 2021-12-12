diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbResourceInjectionAnnotationProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbResourceInjectionAnnotationProcessor.java
index 5faaac8..b36df78 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbResourceInjectionAnnotationProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/EjbResourceInjectionAnnotationProcessor.java
@@ -101,7 +101,7 @@
         final InjectionTarget targetDescription = new MethodInjectionTarget(methodInfo.declaringClass().name().toString(), methodName, injectionType);
 
         final String localContextName = isEmpty(annotation.name()) ? methodInfo.declaringClass().name().toString() + "/" + methodName.substring(3, 4).toLowerCase() + methodName.substring(4) : annotation.name();
-        process(eeModuleDescription, targetDescription.getClassName(), annotation.beanName(), annotation.lookup(), methodInfo.declaringClass(), targetDescription, localContextName);
+        process(eeModuleDescription, targetDescription.getDeclaredValueClassName(), annotation.beanName(), annotation.lookup(), methodInfo.declaringClass(), targetDescription, localContextName);
     }
 
     private void processClass(final EEModuleDescription eeModuleDescription, final EJBResourceWrapper annotation, final ClassInfo classInfo) throws DeploymentUnitProcessingException {
