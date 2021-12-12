diff --git a/core/src/main/java/cucumber/runtime/Runtime.java b/core/src/main/java/cucumber/runtime/Runtime.java
index fb459d6..1e6399c 100644
--- a/core/src/main/java/cucumber/runtime/Runtime.java
+++ b/core/src/main/java/cucumber/runtime/Runtime.java
@@ -86,12 +86,12 @@
     }
 
     public Runtime(ResourceLoader resourceLoader, ClassLoader classLoader, Collection<? extends Backend> backends,
-                   RuntimeOptions runtimeOptions, RuntimeGlue optionalGlue) {
+                   RuntimeOptions runtimeOptions, Glue optionalGlue) {
         this(resourceLoader, classLoader, backends, runtimeOptions, TimeService.SYSTEM, optionalGlue);
     }
 
     public Runtime(ResourceLoader resourceLoader, ClassLoader classLoader, Collection<? extends Backend> backends,
-                   RuntimeOptions runtimeOptions, TimeService stopWatch, RuntimeGlue optionalGlue) {
+                   RuntimeOptions runtimeOptions, TimeService stopWatch, Glue optionalGlue) {
         if (backends.isEmpty()) {
             throw new CucumberException("No backends were found. Please make sure you have a backend module on your CLASSPATH.");
         }
