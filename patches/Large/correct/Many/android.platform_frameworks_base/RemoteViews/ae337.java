diff --git a/core/java/android/widget/RemoteViews.java b/core/java/android/widget/RemoteViews.java
index 4ed175d..914ffdf 100644
--- a/core/java/android/widget/RemoteViews.java
+++ b/core/java/android/widget/RemoteViews.java
@@ -1973,13 +1973,13 @@
 
         public SetRemoteInputsAction(Parcel parcel) {
             viewId = parcel.readInt();
-            remoteInputs = parcel.readParcelableArray(RemoteInput.class.getClassLoader());
+            remoteInputs = parcel.createTypedArray(RemoteInput.CREATOR);
         }
 
         public void writeToParcel(Parcel dest, int flags) {
             dest.writeInt(TAG);
             dest.writeInt(viewId);
-            dest.writeParcelableArray(remoteInputs, flags);
+            dest.writeTypedArray(remoteInputs, flags);
         }
 
         @Override
