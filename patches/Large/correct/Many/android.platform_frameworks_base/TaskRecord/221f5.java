diff --git a/services/core/java/com/android/server/am/TaskRecord.java b/services/core/java/com/android/server/am/TaskRecord.java
index 78f9f18..d047804 100644
--- a/services/core/java/com/android/server/am/TaskRecord.java
+++ b/services/core/java/com/android/server/am/TaskRecord.java
@@ -1074,7 +1074,7 @@
 
         int event;
         while (((event = in.next()) != XmlPullParser.END_DOCUMENT) &&
-                (event != XmlPullParser.END_TAG || in.getDepth() < outerDepth)) {
+                (event != XmlPullParser.END_TAG || in.getDepth() >= outerDepth)) {
             if (event == XmlPullParser.START_TAG) {
                 final String name = in.getName();
                 if (TaskPersister.DEBUG) Slog.d(TaskPersister.TAG, "TaskRecord: START_TAG name=" +
