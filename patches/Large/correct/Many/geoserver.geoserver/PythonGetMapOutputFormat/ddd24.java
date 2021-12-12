diff --git a/src/community/python/src/main/java/org/geoserver/python/format/PythonGetMapOutputFormat.java b/src/community/python/src/main/java/org/geoserver/python/format/PythonGetMapOutputFormat.java
index 60ed237..ea6a442 100644
--- a/src/community/python/src/main/java/org/geoserver/python/format/PythonGetMapOutputFormat.java
+++ b/src/community/python/src/main/java/org/geoserver/python/format/PythonGetMapOutputFormat.java
@@ -32,6 +32,6 @@
     }
 
     public MapProducerCapabilities getCapabilities(String format) {
-        return new MapProducerCapabilities(false, false, false, true);
+        return new MapProducerCapabilities(false, false, false, true, null);
     }
 }
