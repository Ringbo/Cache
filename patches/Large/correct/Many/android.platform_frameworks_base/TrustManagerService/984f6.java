diff --git a/services/core/java/com/android/server/trust/TrustManagerService.java b/services/core/java/com/android/server/trust/TrustManagerService.java
index a2a49c9..97aa4f57 100644
--- a/services/core/java/com/android/server/trust/TrustManagerService.java
+++ b/services/core/java/com/android/server/trust/TrustManagerService.java
@@ -187,12 +187,12 @@
 
         boolean trustMayHaveChanged = false;
         for (int i = 0; i < mObsoleteAgents.size(); i++) {
-            AgentInfo info = mActiveAgents.valueAt(i);
+            AgentInfo info = mObsoleteAgents.valueAt(i);
             if (info.agent.isTrusted()) {
                 trustMayHaveChanged = true;
             }
             info.agent.unbind();
-            mActiveAgents.remove(info);
+            mObsoleteAgents.remove(info);
         }
 
         if (trustMayHaveChanged) {
