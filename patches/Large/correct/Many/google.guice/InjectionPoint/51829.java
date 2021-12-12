diff --git a/core/src/com/google/inject/spi/InjectionPoint.java b/core/src/com/google/inject/spi/InjectionPoint.java
index 76197e3..36c10be 100644
--- a/core/src/com/google/inject/spi/InjectionPoint.java
+++ b/core/src/com/google/inject/spi/InjectionPoint.java
@@ -678,7 +678,7 @@
             InjectableMethod injectableMethod = new InjectableMethod(
                 current, method, atInject);
             if (checkForMisplacedBindingAnnotations(method, errors)
-                | !isValidMethod(injectableMethod, errors)) {
+                || !isValidMethod(injectableMethod, errors)) {
               if (overrideIndex != null) {
                 boolean removed = overrideIndex.removeIfOverriddenBy(method, false, injectableMethod);
                 if(removed) {
