diff --git a/framework/src/org/apache/cordova/DroidGap.java b/framework/src/org/apache/cordova/DroidGap.java
index 3288e72..efa7cb5 100755
--- a/framework/src/org/apache/cordova/DroidGap.java
+++ b/framework/src/org/apache/cordova/DroidGap.java
@@ -816,7 +816,7 @@
      * @param data              An Intent, which can return result data to the caller (various data can be attached to Intent "extras").
      */
     protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
-        Log.d(TAG, "Incoming Result");
+        LOG.d(TAG, "Incoming Result");
         super.onActivityResult(requestCode, resultCode, intent);
         CordovaPlugin callback = this.activityResultCallback;
         if(callback == null)
@@ -825,13 +825,13 @@
             {
                 this.activityResultCallback = appView.pluginManager.getPlugin(initCallbackClass);
                 callback = activityResultCallback;
-                Log.d(TAG, "We have a callback to send this result to");
+                LOG.d(TAG, "We have a callback to send this result to");
                 callback.onActivityResult(requestCode, resultCode, intent);
             }
         }
         else
         {
-            Log.d(TAG, "We have a callback to send this result to");
+            LOG.d(TAG, "We have a callback to send this result to");
             callback.onActivityResult(requestCode, resultCode, intent);
         }
     }
