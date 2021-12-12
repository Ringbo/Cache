diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index 3de2009..7d63e8d 100755
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -1210,7 +1210,7 @@
             if (TaskPersister.DEBUG) Slog.d(TaskPersister.TAG,
                         "ActivityRecord: attribute name=" + attrName + " value=" + attrValue);
             if (ATTR_ID.equals(attrName)) {
-                createTime = Long.valueOf(attrValue);
+                createTime = Long.parseLong(attrValue);
             } else if (ATTR_LAUNCHEDFROMUID.equals(attrName)) {
                 launchedFromUid = Integer.valueOf(attrValue);
             } else if (ATTR_LAUNCHEDFROMPACKAGE.equals(attrName)) {
