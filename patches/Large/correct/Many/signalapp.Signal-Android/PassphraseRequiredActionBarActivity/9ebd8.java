diff --git a/src/org/thoughtcrime/securesms/PassphraseRequiredActionBarActivity.java b/src/org/thoughtcrime/securesms/PassphraseRequiredActionBarActivity.java
index 838d243..507ed7e 100644
--- a/src/org/thoughtcrime/securesms/PassphraseRequiredActionBarActivity.java
+++ b/src/org/thoughtcrime/securesms/PassphraseRequiredActionBarActivity.java
@@ -89,7 +89,7 @@
   @Override
   public void onMasterSecretCleared() {
     Log.w(TAG, "onMasterSecretCleared()");
-    if (isVisible) routeApplicationState(false);
+    if (isVisible) routeApplicationState(true);
     else           finish();
   }
 
