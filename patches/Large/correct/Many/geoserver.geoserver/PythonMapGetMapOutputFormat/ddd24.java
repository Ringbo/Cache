diff --git a/src/community/python/src/main/java/org/geoserver/python/format/PythonMapGetMapOutputFormat.java b/src/community/python/src/main/java/org/geoserver/python/format/PythonMapGetMapOutputFormat.java
index 82e92d3..272e87c 100644
--- a/src/community/python/src/main/java/org/geoserver/python/format/PythonMapGetMapOutputFormat.java
+++ b/src/community/python/src/main/java/org/geoserver/python/format/PythonMapGetMapOutputFormat.java
@@ -42,7 +42,7 @@
     }
 
     public MapProducerCapabilities getCapabilities(String format) {
-        return new MapProducerCapabilities(false, false, false, true);
+        return new MapProducerCapabilities(false, false, false, true, null);
     }
 
 }
