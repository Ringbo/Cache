diff --git a/core/src/main/java/io/undertow/server/handlers/ChannelUpgradeHandler.java b/core/src/main/java/io/undertow/server/handlers/ChannelUpgradeHandler.java
index 70727bc..0e194af 100644
--- a/core/src/main/java/io/undertow/server/handlers/ChannelUpgradeHandler.java
+++ b/core/src/main/java/io/undertow/server/handlers/ChannelUpgradeHandler.java
@@ -132,7 +132,7 @@
         while (it.hasNext()) {
             Holder holder = it.next();
             if (holder.channelListener == openListener) {
-                it.remove();
+                holders.remove(holder);
                 break;
             }
         }
@@ -157,7 +157,7 @@
         while (it.hasNext()) {
             Holder holder = it.next();
             if (holder.listener == upgradeListener) {
-                it.remove();
+                holders.remove(holder);
                 break;
             }
         }
