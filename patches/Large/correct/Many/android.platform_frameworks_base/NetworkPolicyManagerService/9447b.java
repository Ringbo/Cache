diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index a6f049e..a17dd12 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -1722,7 +1722,7 @@
                 final long totalBytes = getTotalBytes(
                         NetworkTemplate.buildTemplateMobileAll(state.subscriberId), start, end);
                 final long remainingBytes = limitBytes - totalBytes;
-                final long remainingDays = Math.min(1, (end - currentTimeMillis())
+                final long remainingDays = Math.max(1, (end - currentTimeMillis())
                         / TimeUnit.DAYS.toMillis(1));
                 if (remainingBytes > 0) {
                     quotaBytes = (remainingBytes / remainingDays) / 10;
