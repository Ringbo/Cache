diff --git a/services/core/java/com/android/server/trust/TrustManagerService.java b/services/core/java/com/android/server/trust/TrustManagerService.java
index 97aa4f57..9061f96 100644
--- a/services/core/java/com/android/server/trust/TrustManagerService.java
+++ b/services/core/java/com/android/server/trust/TrustManagerService.java
@@ -192,7 +192,7 @@
                 trustMayHaveChanged = true;
             }
             info.agent.unbind();
-            mObsoleteAgents.remove(info);
+            mActiveAgents.remove(info);
         }
 
         if (trustMayHaveChanged) {
