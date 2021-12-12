diff --git a/core/java/android/content/pm/RegisteredServicesCache.java b/core/java/android/content/pm/RegisteredServicesCache.java
index aaa0917..288d55f 100644
--- a/core/java/android/content/pm/RegisteredServicesCache.java
+++ b/core/java/android/content/pm/RegisteredServicesCache.java
@@ -488,7 +488,8 @@
             XmlPullParser parser = Xml.newPullParser();
             parser.setInput(fis, null);
             int eventType = parser.getEventType();
-            while (eventType != XmlPullParser.START_TAG) {
+            while (eventType != XmlPullParser.START_TAG
+                    && eventType != XmlPullParser.END_DOCUMENT) {
                 eventType = parser.next();
             }
             String tagName = parser.getName();
