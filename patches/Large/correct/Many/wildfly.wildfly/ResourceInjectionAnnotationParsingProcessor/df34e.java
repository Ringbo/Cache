diff --git a/ee/src/main/java/org/jboss/as/ee/component/ResourceInjectionAnnotationParsingProcessor.java b/ee/src/main/java/org/jboss/as/ee/component/ResourceInjectionAnnotationParsingProcessor.java
index 497c4d2..170910d 100644
--- a/ee/src/main/java/org/jboss/as/ee/component/ResourceInjectionAnnotationParsingProcessor.java
+++ b/ee/src/main/java/org/jboss/as/ee/component/ResourceInjectionAnnotationParsingProcessor.java
@@ -134,7 +134,7 @@
         final String localContextName = isEmpty(name) ? methodInfo.declaringClass().name().toString() + "/" + contextNameSuffix : name;
 
         final String injectionType = isEmpty(type) || type.equals(Object.class.getName()) ? methodInfo.args()[0].name().toString() : type;
-        final InjectionTarget targetDescription = new MethodInjectionTarget(methodName, methodInfo.declaringClass().name().toString(), methodInfo.args()[0].name().toString());
+        final InjectionTarget targetDescription = new MethodInjectionTarget(methodInfo.declaringClass().name().toString(), methodName, methodInfo.args()[0].name().toString());
         process(classDescription, annotation, injectionType, localContextName, targetDescription);
     }
 
