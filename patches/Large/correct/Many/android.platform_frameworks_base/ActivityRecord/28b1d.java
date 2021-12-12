diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index aaf8301..5b625ad 100755
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -1394,7 +1394,7 @@
             if (TaskPersister.DEBUG) Slog.d(TaskPersister.TAG,
                         "ActivityRecord: attribute name=" + attrName + " value=" + attrValue);
             if (ATTR_ID.equals(attrName)) {
-                createTime = Long.valueOf(attrValue);
+                createTime = Long.parseLong(attrValue);
             } else if (ATTR_LAUNCHEDFROMUID.equals(attrName)) {
                 launchedFromUid = Integer.parseInt(attrValue);
             } else if (ATTR_LAUNCHEDFROMPACKAGE.equals(attrName)) {
