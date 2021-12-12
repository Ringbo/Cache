diff --git a/core/java/android/app/VoiceInteractor.java b/core/java/android/app/VoiceInteractor.java
index 85e970c..0d94721 100644
--- a/core/java/android/app/VoiceInteractor.java
+++ b/core/java/android/app/VoiceInteractor.java
@@ -293,7 +293,7 @@
 
         IVoiceInteractorRequest submit(IVoiceInteractor interactor, String packageName,
                 IVoiceInteractorCallback callback) throws RemoteException {
-            return interactor.startConfirmation(packageName, callback, mCommand, mArgs);
+            return interactor.startCommand(packageName, callback, mCommand, mArgs);
         }
    }
 
