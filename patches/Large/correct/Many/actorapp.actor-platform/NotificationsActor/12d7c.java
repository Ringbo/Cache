diff --git a/actor-apps/core/src/main/java/im/actor/core/modules/internal/notifications/NotificationsActor.java b/actor-apps/core/src/main/java/im/actor/core/modules/internal/notifications/NotificationsActor.java
index 579512b..9ccb2fd 100644
--- a/actor-apps/core/src/main/java/im/actor/core/modules/internal/notifications/NotificationsActor.java
+++ b/actor-apps/core/src/main/java/im/actor/core/modules/internal/notifications/NotificationsActor.java
@@ -311,7 +311,7 @@
     }
 
     private boolean isNotificationsEnabled(Peer peer, boolean hasMention) {
-        if (context().getSettingsModule().isNotificationsEnabled()) {
+        if (!context().getSettingsModule().isNotificationsEnabled()) {
             return false;
         }
 
