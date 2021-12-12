diff --git a/services/core/java/com/android/server/am/TaskRecord.java b/services/core/java/com/android/server/am/TaskRecord.java
index 9da30bf..9ffc297 100644
--- a/services/core/java/com/android/server/am/TaskRecord.java
+++ b/services/core/java/com/android/server/am/TaskRecord.java
@@ -1018,7 +1018,7 @@
             if (TaskPersister.DEBUG) Slog.d(TaskPersister.TAG, "TaskRecord: attribute name=" +
                     attrName + " value=" + attrValue);
             if (ATTR_TASKID.equals(attrName)) {
-                if (taskId == INVALID_TASK_ID) taskId = Integer.valueOf(attrValue);
+                if (taskId == INVALID_TASK_ID) taskId = Integer.parseInt(attrValue);
             } else if (ATTR_REALACTIVITY.equals(attrName)) {
                 realActivity = ComponentName.unflattenFromString(attrValue);
             } else if (ATTR_ORIGACTIVITY.equals(attrName)) {
@@ -1029,45 +1029,45 @@
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
-                userId = Integer.valueOf(attrValue);
+                userId = Integer.parseInt(attrValue);
             } else if (ATTR_EFFECTIVE_UID.equals(attrName)) {
-                effectiveUid = Integer.valueOf(attrValue);
+                effectiveUid = Integer.parseInt(attrValue);
             } else if (ATTR_TASKTYPE.equals(attrName)) {
-                taskType = Integer.valueOf(attrValue);
+                taskType = Integer.parseInt(attrValue);
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
             } else if (attrName.startsWith(TaskDescription.ATTR_TASKDESCRIPTION_PREFIX)) {
                 taskDescription.restoreFromXml(attrName, attrValue);
             } else if (ATTR_TASK_AFFILIATION.equals(attrName)) {
-                taskAffiliation = Integer.valueOf(attrValue);
+                taskAffiliation = Integer.parseInt(attrValue);
             } else if (ATTR_PREV_AFFILIATION.equals(attrName)) {
-                prevTaskId = Integer.valueOf(attrValue);
+                prevTaskId = Integer.parseInt(attrValue);
             } else if (ATTR_NEXT_AFFILIATION.equals(attrName)) {
-                nextTaskId = Integer.valueOf(attrValue);
+                nextTaskId = Integer.parseInt(attrValue);
             } else if (ATTR_TASK_AFFILIATION_COLOR.equals(attrName)) {
-                taskAffiliationColor = Integer.valueOf(attrValue);
+                taskAffiliationColor = Integer.parseInt(attrValue);
             } else if (ATTR_CALLING_UID.equals(attrName)) {
-                callingUid = Integer.valueOf(attrValue);
+                callingUid = Integer.parseInt(attrValue);
             } else if (ATTR_CALLING_PACKAGE.equals(attrName)) {
                 callingPackage = attrValue;
             } else if (ATTR_RESIZEABLE.equals(attrName)) {
-                resizeable = Boolean.valueOf(attrValue);
+                resizeable = Boolean.parseBoolean(attrValue);
             } else if (ATTR_PRIVILEGED.equals(attrName)) {
-                privileged = Boolean.valueOf(attrValue);
+                privileged = Boolean.parseBoolean(attrValue);
             } else {
                 Slog.w(TAG, "TaskRecord: Unknown attribute=" + attrName);
             }
