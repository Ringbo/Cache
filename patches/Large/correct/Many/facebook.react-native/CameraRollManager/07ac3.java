diff --git a/ReactAndroid/src/main/java/com/facebook/react/modules/camera/CameraRollManager.java b/ReactAndroid/src/main/java/com/facebook/react/modules/camera/CameraRollManager.java
index a36ac2f..8a6ab90 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/modules/camera/CameraRollManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/modules/camera/CameraRollManager.java
@@ -443,7 +443,7 @@
           retriever.release();
           photoDescriptor.close();
         }
-      } catch (IOException e) {
+      } catch (Exception e) {
         FLog.e(ReactConstants.TAG, "Could not get video metadata for " + photoUri.toString(), e);
         return false;
       }
