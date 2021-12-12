diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/dsl/GroovyDslFileIndex.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/dsl/GroovyDslFileIndex.java
index 5f05fd7..b0e2a67 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/dsl/GroovyDslFileIndex.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/dsl/GroovyDslFileIndex.java
@@ -233,7 +233,7 @@
                   executor.processVariants(key, generator);
                 }
                 catch (Exception e) { // To handle exceptions in definition script
-                  if (project.isDisposed()) {
+                  if (project.isDisposed() || ApplicationManager.getApplication().isUnitTestMode()) {
                     LOG.error(e);
                     return null;
                   }
