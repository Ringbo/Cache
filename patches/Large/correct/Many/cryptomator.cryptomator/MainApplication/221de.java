diff --git a/main/ui/src/main/java/org/cryptomator/ui/MainApplication.java b/main/ui/src/main/java/org/cryptomator/ui/MainApplication.java
index f876143..ed01184 100644
--- a/main/ui/src/main/java/org/cryptomator/ui/MainApplication.java
+++ b/main/ui/src/main/java/org/cryptomator/ui/MainApplication.java
@@ -67,7 +67,7 @@
 		// show window and start observing its focus:
 		primaryStage.show();
 		ActiveWindowStyleSupport.startObservingFocus(primaryStage);
-		comp.trayIconUtil().initTrayIcon(this::quit);
+		comp.exitUtil().initExitHandler(this::quit);
 
 		// open files, if requested during startup:
 		for (String arg : getParameters().getUnnamed()) {
