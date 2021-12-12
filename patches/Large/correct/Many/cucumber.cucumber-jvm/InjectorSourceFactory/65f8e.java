diff --git a/guice/src/main/java/cucumber/runtime/java/guice/impl/InjectorSourceFactory.java b/guice/src/main/java/cucumber/runtime/java/guice/impl/InjectorSourceFactory.java
index 171b99c..59c4dbc 100644
--- a/guice/src/main/java/cucumber/runtime/java/guice/impl/InjectorSourceFactory.java
+++ b/guice/src/main/java/cucumber/runtime/java/guice/impl/InjectorSourceFactory.java
@@ -38,7 +38,7 @@
 
     private InjectorSource instantiateUserSpecifiedInjectorSource(String injectorSourceClassName) {
         try {
-            return (InjectorSource) Class.forName(injectorSourceClassName).newInstance();
+            return (InjectorSource) Class.forName(injectorSourceClassName, true, Thread.currentThread().getContextClassLoader()).newInstance();
         } catch (Exception e) {
             String message = format("Instantiation of ''{0}'' failed. Check the caused by exception and ensure your" +
                     "InjectorSource implementation is accessible and has a public zero args constructor.",
