diff --git a/jpa/src/main/java/org/jboss/as/jpa/processor/JPAAnnotationParseProcessor.java b/jpa/src/main/java/org/jboss/as/jpa/processor/JPAAnnotationParseProcessor.java
index cb84354..96d64f2 100644
--- a/jpa/src/main/java/org/jboss/as/jpa/processor/JPAAnnotationParseProcessor.java
+++ b/jpa/src/main/java/org/jboss/as/jpa/processor/JPAAnnotationParseProcessor.java
@@ -220,7 +220,7 @@
         });
 
         // setup the injection configuration
-        final InjectionTarget injectionTarget = new MethodInjectionTarget(methodName, methodInfo.declaringClass().name().toString(), methodInfo.returnType().name().toString());
+        final InjectionTarget injectionTarget = new MethodInjectionTarget(methodInfo.declaringClass().name().toString(), methodName, methodInfo.returnType().name().toString());
         // source is always local ENC jndi name
         final InjectionSource injectionSource = new LookupInjectionSource(localContextName);
         final ResourceInjectionConfiguration injectionConfiguration = new ResourceInjectionConfiguration(injectionTarget, injectionSource);
