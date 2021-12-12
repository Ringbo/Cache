diff --git a/orchestrator/src/main/java/com/yahoo/vespa/orchestrator/ServiceMonitorInstanceLookupService.java b/orchestrator/src/main/java/com/yahoo/vespa/orchestrator/ServiceMonitorInstanceLookupService.java
index a09ec29..d1d5f3e 100644
--- a/orchestrator/src/main/java/com/yahoo/vespa/orchestrator/ServiceMonitorInstanceLookupService.java
+++ b/orchestrator/src/main/java/com/yahoo/vespa/orchestrator/ServiceMonitorInstanceLookupService.java
@@ -46,7 +46,7 @@
             return Optional.empty();
         }
         if (applicationInstancesUsingHost.size() > 1) {
-            throw new AssertionError(
+            throw new IllegalStateException(
                     "Major assumption broken: Multiple application instances contain host " + hostName.s()
                             + ": " + applicationInstancesUsingHost);
         }
