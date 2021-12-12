diff --git a/core/java/android/security/ConfirmationCallback.java b/core/java/android/security/ConfirmationCallback.java
index 4670bce..fd027f0 100644
--- a/core/java/android/security/ConfirmationCallback.java
+++ b/core/java/android/security/ConfirmationCallback.java
@@ -33,22 +33,22 @@
      *
      * @param dataThatWasConfirmed the data that was confirmed, see above for the format.
      */
-    public void onConfirmedByUser(@NonNull byte[] dataThatWasConfirmed) {}
+    public void onConfirmed(@NonNull byte[] dataThatWasConfirmed) {}
 
     /**
      * Called when the requested prompt was dismissed (not accepted) by the user.
      */
-    public void onDismissedByUser() {}
+    public void onDismissed() {}
 
     /**
      * Called when the requested prompt was dismissed by the application.
      */
-    public void onDismissedByApplication() {}
+    public void onCanceled() {}
 
     /**
      * Called when the requested prompt was dismissed because of a low-level error.
      *
-     * @param e an exception representing the error.
+     * @param e a throwable representing the error.
      */
-    public void onError(Exception e) {}
+    public void onError(Throwable e) {}
 }
