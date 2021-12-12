diff --git a/common/transport/src/main/java/org/thingsboard/server/common/transport/quota/HostRequestsQuotaService.java b/common/transport/src/main/java/org/thingsboard/server/common/transport/quota/HostRequestsQuotaService.java
index 7ef4df2..0914dd6 100644
--- a/common/transport/src/main/java/org/thingsboard/server/common/transport/quota/HostRequestsQuotaService.java
+++ b/common/transport/src/main/java/org/thingsboard/server/common/transport/quota/HostRequestsQuotaService.java
@@ -69,7 +69,7 @@
     public boolean isQuotaExceeded(String key) {
         if (enabled) {
             long count = requestRegistry.tick(key);
-            return requestsPolicy.isValid(count);
+            return !requestsPolicy.isValid(count);
         }
         return false;
     }
