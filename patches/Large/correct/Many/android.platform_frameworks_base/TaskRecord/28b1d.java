diff --git a/services/core/java/com/android/server/am/TaskRecord.java b/services/core/java/com/android/server/am/TaskRecord.java
index 5a5f861..47a012ea 100644
--- a/services/core/java/com/android/server/am/TaskRecord.java
+++ b/services/core/java/com/android/server/am/TaskRecord.java
@@ -1240,29 +1240,29 @@
                 rootAffinity = attrValue;
                 hasRootAffinity = true;
             } else if (ATTR_ROOTHASRESET.equals(attrName)) {
-                rootHasReset = Boolean.valueOf(attrValue);
+                rootHasReset = Boolean.parseBoolean(attrValue);
             } else if (ATTR_AUTOREMOVERECENTS.equals(attrName)) {
-                autoRemoveRecents = Boolean.valueOf(attrValue);
+                autoRemoveRecents = Boolean.parseBoolean(attrValue);
             } else if (ATTR_ASKEDCOMPATMODE.equals(attrName)) {
-                askedCompatMode = Boolean.valueOf(attrValue);
+                askedCompatMode = Boolean.parseBoolean(attrValue);
             } else if (ATTR_USERID.equals(attrName)) {
                 userId = Integer.parseInt(attrValue);
             } else if (ATTR_USER_SETUP_COMPLETE.equals(attrName)) {
-                userSetupComplete = Boolean.valueOf(attrValue);
+                userSetupComplete = Boolean.parseBoolean(attrValue);
             } else if (ATTR_EFFECTIVE_UID.equals(attrName)) {
                 effectiveUid = Integer.parseInt(attrValue);
             } else if (ATTR_TASKTYPE.equals(attrName)) {
                 taskType = Integer.parseInt(attrValue);
             } else if (ATTR_FIRSTACTIVETIME.equals(attrName)) {
-                firstActiveTime = Long.valueOf(attrValue);
+                firstActiveTime = Long.parseLong(attrValue);
             } else if (ATTR_LASTACTIVETIME.equals(attrName)) {
-                lastActiveTime = Long.valueOf(attrValue);
+                lastActiveTime = Long.parseLong(attrValue);
             } else if (ATTR_LASTDESCRIPTION.equals(attrName)) {
                 lastDescription = attrValue;
             } else if (ATTR_LASTTIMEMOVED.equals(attrName)) {
-                lastTimeOnTop = Long.valueOf(attrValue);
+                lastTimeOnTop = Long.parseLong(attrValue);
             } else if (ATTR_NEVERRELINQUISH.equals(attrName)) {
-                neverRelinquishIdentity = Boolean.valueOf(attrValue);
+                neverRelinquishIdentity = Boolean.parseBoolean(attrValue);
             } else if (attrName.startsWith(TaskThumbnailInfo.ATTR_TASK_THUMBNAILINFO_PREFIX)) {
                 thumbnailInfo.restoreFromXml(attrName, attrValue);
             } else if (attrName.startsWith(TaskDescription.ATTR_TASKDESCRIPTION_PREFIX)) {
@@ -1284,7 +1284,7 @@
                 resizeMode = (resizeMode == RESIZE_MODE_CROP_WINDOWS)
                         ? RESIZE_MODE_FORCE_RESIZEABLE : resizeMode;
             } else if (ATTR_PRIVILEGED.equals(attrName)) {
-                privileged = Boolean.valueOf(attrValue);
+                privileged = Boolean.parseBoolean(attrValue);
             } else if (ATTR_NON_FULLSCREEN_BOUNDS.equals(attrName)) {
                 bounds = Rect.unflattenFromString(attrValue);
             } else if (ATTR_MINIMAL_WIDTH.equals(attrName)) {
