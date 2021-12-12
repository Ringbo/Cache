diff --git a/media/java/android/media/PlayerBase.java b/media/java/android/media/PlayerBase.java
index 1f5986f..e634dc2 100644
--- a/media/java/android/media/PlayerBase.java
+++ b/media/java/android/media/PlayerBase.java
@@ -254,7 +254,7 @@
             if (mAppOps != null) {
                 mAppOps.stopWatchingMode(mAppOpsCallback);
             }
-        } catch (RemoteException e) {
+        } catch (Exception e) {
             // nothing to do here, the object is supposed to be released anyway
         }
     }
