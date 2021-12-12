diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index e829962..5bf66e4 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -895,7 +895,7 @@
             try {
                 sessionState.session.finishSession();
             } catch (RemoteException e) {
-                Log.w(TAG, "Session failed to close due to remote exception", e);
+                Slog.w(TAG, "Session failed to close due to remote exception", e);
             }
         }
     }
