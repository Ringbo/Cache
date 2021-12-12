diff --git a/core/java/android/app/ActivityManagerNative.java b/core/java/android/app/ActivityManagerNative.java
index cf5240b..dcac633 100644
--- a/core/java/android/app/ActivityManagerNative.java
+++ b/core/java/android/app/ActivityManagerNative.java
@@ -683,10 +683,10 @@
             int maxNum = data.readInt();
             int fl = data.readInt();
             int userId = data.readInt();
-            List<ActivityManager.RecentTaskInfo> list = getRecentTasks(maxNum,
+            ParceledListSlice<ActivityManager.RecentTaskInfo> list = getRecentTasks(maxNum,
                     fl, userId);
             reply.writeNoException();
-            reply.writeTypedList(list);
+            list.writeToParcel(reply, Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
             return true;
         }
 
@@ -3740,7 +3740,7 @@
         reply.recycle();
         return list;
     }
-    public List<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum,
+    public ParceledListSlice<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum,
             int flags, int userId) throws RemoteException {
         Parcel data = Parcel.obtain();
         Parcel reply = Parcel.obtain();
@@ -3750,8 +3750,8 @@
         data.writeInt(userId);
         mRemote.transact(GET_RECENT_TASKS_TRANSACTION, data, reply, 0);
         reply.readException();
-        ArrayList<ActivityManager.RecentTaskInfo> list
-            = reply.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
+        final ParceledListSlice<ActivityManager.RecentTaskInfo> list = ParceledListSlice.CREATOR
+                .createFromParcel(reply);
         data.recycle();
         reply.recycle();
         return list;
