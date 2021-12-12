diff --git a/framework/src/org/apache/cordova/Config.java b/framework/src/org/apache/cordova/Config.java
index b9f81f0..ccf49c5 100644
--- a/framework/src/org/apache/cordova/Config.java
+++ b/framework/src/org/apache/cordova/Config.java
@@ -119,7 +119,7 @@
                     } else if (name.equals("splashscreen")) {
                         String value = xml.getAttributeValue(null, "value");
                         int resource = 0;
-                        if (value != null)
+                        if (value == null)
                         {
                             value = "splash";
                         }
