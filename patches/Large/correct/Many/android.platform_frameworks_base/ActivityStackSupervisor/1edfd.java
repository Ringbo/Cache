diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 28b1df5..5e45917 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -3068,7 +3068,7 @@
                 }
             }
             ActivityInfo aInfo = resolveActivity(intent, resolvedType, 0, null, null, userId);
-            if ((aInfo.flags & ActivityInfo.FLAG_ALLOW_EMBEDDED) == 0) {
+            if (aInfo != null && (aInfo.flags & ActivityInfo.FLAG_ALLOW_EMBEDDED) == 0) {
                 throw new SecurityException(
                         "Attempt to embed activity that has not set allowEmbedded=\"true\"");
             }
