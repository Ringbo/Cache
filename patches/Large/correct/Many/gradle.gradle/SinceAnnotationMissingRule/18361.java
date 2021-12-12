diff --git a/buildSrc/src/main/groovy/org/gradle/binarycompatibility/rules/SinceAnnotationMissingRule.java b/buildSrc/src/main/groovy/org/gradle/binarycompatibility/rules/SinceAnnotationMissingRule.java
index 5f5d788..8a65cd9 100644
--- a/buildSrc/src/main/groovy/org/gradle/binarycompatibility/rules/SinceAnnotationMissingRule.java
+++ b/buildSrc/src/main/groovy/org/gradle/binarycompatibility/rules/SinceAnnotationMissingRule.java
@@ -127,7 +127,7 @@
             };
         } else if (member instanceof JApiConstructor) {
             final JApiConstructor constructor = (JApiConstructor) member;
-            if (isDeprecated(constructor)) {
+            if (isDeprecated(constructor) || isInject(constructor)) {
                 return null;
             }
             className = constructor.getjApiClass().getFullyQualifiedName();
