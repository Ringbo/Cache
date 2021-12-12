diff --git a/platform/lang-impl/src/com/intellij/execution/console/ConsoleHistoryController.java b/platform/lang-impl/src/com/intellij/execution/console/ConsoleHistoryController.java
index 4b12e9a..0a59778 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/ConsoleHistoryController.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/ConsoleHistoryController.java
@@ -513,7 +513,7 @@
       OutputStream os = null;
       try {
         os = new SafeFileOutputStream(file);
-        XmlSerializer serializer = XmlPullParserFactory.newInstance().newSerializer();
+        XmlSerializer serializer = XmlPullParserFactory.newInstance("org.xmlpull.mxp1.MXParserFactory", null).newSerializer();
         try {
           serializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  ");
         }
