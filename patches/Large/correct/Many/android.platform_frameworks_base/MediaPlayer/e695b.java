diff --git a/media/java/android/media/MediaPlayer.java b/media/java/android/media/MediaPlayer.java
index f148606..2e92c40 100644
--- a/media/java/android/media/MediaPlayer.java
+++ b/media/java/android/media/MediaPlayer.java
@@ -1757,7 +1757,7 @@
             throw new IllegalArgumentException(msg);
         }
         mUsage = attributes.getUsage();
-        mBypassInterruptionPolicy = (attributes.getFlags()
+        mBypassInterruptionPolicy = (attributes.getAllFlags()
                 & AudioAttributes.FLAG_BYPASS_INTERRUPTION_POLICY) != 0;
         Parcel pattributes = Parcel.obtain();
         attributes.writeToParcel(pattributes, AudioAttributes.FLATTEN_TAGS);
