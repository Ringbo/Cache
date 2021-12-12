diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index e1edf82..504cfde 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -2496,7 +2496,7 @@
                 if(fse.mClientId.equals(clientToRemove)) {
                     Log.i(TAG, " AudioFocus  abandonAudioFocus(): removing entry for "
                             + fse.mClientId);
-                    mFocusStack.remove(fse);
+                    stackIterator.remove();
                 }
             }
         }
@@ -2516,7 +2516,7 @@
             if(fse.mSourceRef.equals(cb)) {
                 Log.i(TAG, " AudioFocus  abandonAudioFocus(): removing entry for "
                         + fse.mClientId);
-                mFocusStack.remove(fse);
+                stackIterator.remove();
             }
         }
         if (isTopOfStackForClientToRemove) {
@@ -2789,7 +2789,7 @@
         while(stackIterator.hasNext()) {
             RemoteControlStackEntry rcse = (RemoteControlStackEntry)stackIterator.next();
             if(rcse.mReceiverComponent.equals(newReceiver)) {
-                mRCStack.remove(rcse);
+                stackIterator.remove();
                 break;
             }
         }
@@ -2809,7 +2809,7 @@
         while(stackIterator.hasNext()) {
             RemoteControlStackEntry rcse = (RemoteControlStackEntry)stackIterator.next();
             if(rcse.mReceiverComponent.equals(newReceiver)) {
-                mRCStack.remove(rcse);
+                stackIterator.remove();
                 break;
             }
         }
