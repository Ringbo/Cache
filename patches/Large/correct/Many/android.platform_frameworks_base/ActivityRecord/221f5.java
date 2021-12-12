diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index d16eab6..93d0692 100755
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -1224,7 +1224,7 @@
 
         int event;
         while (((event = in.next()) != XmlPullParser.END_DOCUMENT) &&
-                (event != XmlPullParser.END_TAG || in.getDepth() < outerDepth)) {
+                (event != XmlPullParser.END_TAG || in.getDepth() >= outerDepth)) {
             if (event == XmlPullParser.START_TAG) {
                 final String name = in.getName();
                 if (TaskPersister.DEBUG)
