diff --git a/js-karma/src/com/intellij/javascript/karma/server/KarmaServerLogComponent.java b/js-karma/src/com/intellij/javascript/karma/server/KarmaServerLogComponent.java
index 6150cb7..fe42faa 100644
--- a/js-karma/src/com/intellij/javascript/karma/server/KarmaServerLogComponent.java
+++ b/js-karma/src/com/intellij/javascript/karma/server/KarmaServerLogComponent.java
@@ -163,7 +163,7 @@
       if (myServer.getServerSettings().isDebug() || myServer.areBrowsersReady() || Disposer.isDisposed(myConsole)) {
         return;
       }
-      final int DELAY_MILLIS = 3000;
+      final int DELAY_MILLIS = 10000;
       Alarm alarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD, myConsole);
       AtomicLong lastPrintTimeMillis = new AtomicLong(0);
       alarm.addRequest(new Runnable() {
