diff --git a/acra-core/src/main/java/org/acra/builder/ReportExecutor.java b/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
index de58af5..2f24587 100644
--- a/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
+++ b/acra-core/src/main/java/org/acra/builder/ReportExecutor.java
@@ -124,7 +124,7 @@
                 futures.add(executorService.submit(new Callable<Boolean>() {
                     @Override
                     public Boolean call() {
-                        return !reportInteraction.performInteraction(context, config, reportBuilder, reportFile);
+                        return reportInteraction.performInteraction(context, config, reportBuilder, reportFile);
                     }
                 }));
             }
