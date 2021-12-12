diff --git a/core/java/com/android/internal/app/ChooserActivity.java b/core/java/com/android/internal/app/ChooserActivity.java
index 6085164..a4e489c 100644
--- a/core/java/com/android/internal/app/ChooserActivity.java
+++ b/core/java/com/android/internal/app/ChooserActivity.java
@@ -433,8 +433,7 @@
 
                 final ChooserTargetServiceConnection conn =
                         new ChooserTargetServiceConnection(this, dri);
-                if (bindServiceAsUser(serviceIntent, conn, BIND_AUTO_CREATE | BIND_NOT_FOREGROUND,
-                        UserHandle.CURRENT)) {
+                if (bindService(serviceIntent, conn, BIND_AUTO_CREATE | BIND_NOT_FOREGROUND)) {
                     if (DEBUG) {
                         Log.d(TAG, "Binding service connection for target " + dri
                                 + " intent " + serviceIntent);
