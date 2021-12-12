diff --git a/services/java/com/android/server/WindowManagerService.java b/services/java/com/android/server/WindowManagerService.java
index 2bcf4cd..b90b03b 100644
--- a/services/java/com/android/server/WindowManagerService.java
+++ b/services/java/com/android/server/WindowManagerService.java
@@ -5478,7 +5478,7 @@
                         + " fin=" + finished + " gfw=" + gotFirstWindow
                         + " ed=" + eventDispatching + " tts=" + timeToSwitch
                         + " wf=" + wasFrozen + " fp=" + focusPaused
-                        + " mcf=" + mCurrentFocus + "}}";
+                        + " mcf=" + curFocus + "}}";
             }
         };
         private DispatchState mDispatchState = null;
