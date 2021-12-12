diff --git a/camel-core/src/main/java/org/apache/camel/management/mbean/ManagedRoute.java b/camel-core/src/main/java/org/apache/camel/management/mbean/ManagedRoute.java
index fba8b62..40d5387 100644
--- a/camel-core/src/main/java/org/apache/camel/management/mbean/ManagedRoute.java
+++ b/camel-core/src/main/java/org/apache/camel/management/mbean/ManagedRoute.java
@@ -337,7 +337,7 @@
         answer.append(" selfProcessingTime=\"").append(routeSelfTime).append("\"");
         answer.append(" exchangesInflight=\"").append(getInflightExchanges()).append("\"");
         InFlightKey oldestInflightEntry = getOldestInflightEntry();
-        if (oldestInflightEntry != null) {
+        if (oldestInflightEntry == null) {
             answer.append(" oldestInflightExchangeId=\"\"");
             answer.append(" oldestInflightDuration=\"\"");
         } else {
