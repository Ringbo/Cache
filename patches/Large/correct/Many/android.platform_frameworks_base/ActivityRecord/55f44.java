diff --git a/services/core/java/com/android/server/am/ActivityRecord.java b/services/core/java/com/android/server/am/ActivityRecord.java
index 8eea00f..d54c16f 100755
--- a/services/core/java/com/android/server/am/ActivityRecord.java
+++ b/services/core/java/com/android/server/am/ActivityRecord.java
@@ -1278,7 +1278,7 @@
 
         int event;
         while (((event = in.next()) != XmlPullParser.END_DOCUMENT) &&
-                (event != XmlPullParser.END_TAG || in.getDepth() < outerDepth)) {
+                (event != XmlPullParser.END_TAG || in.getDepth() >= outerDepth)) {
             if (event == XmlPullParser.START_TAG) {
                 final String name = in.getName();
                 if (TaskPersister.DEBUG)
