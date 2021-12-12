diff --git a/python/src/com/jetbrains/python/testing/PyRerunFailedTestsAction.java b/python/src/com/jetbrains/python/testing/PyRerunFailedTestsAction.java
index ffd474a..c31e295 100644
--- a/python/src/com/jetbrains/python/testing/PyRerunFailedTestsAction.java
+++ b/python/src/com/jetbrains/python/testing/PyRerunFailedTestsAction.java
@@ -123,7 +123,7 @@
       if (getTestSpecs().isEmpty()) {
         throw new ExecutionException(PyBundle.message("runcfg.tests.cant_rerun"));
       }
-      return super.execute(executor, patchers);
+      return super.execute(executor, processStarter, patchers);
     }
 
     @NotNull
