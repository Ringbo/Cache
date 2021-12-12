diff --git a/src/community/python/src/main/java/org/geoserver/python/format/PythonVectorGetMapOutputFormat.java b/src/community/python/src/main/java/org/geoserver/python/format/PythonVectorGetMapOutputFormat.java
index 049ae9d..98b0e81 100644
--- a/src/community/python/src/main/java/org/geoserver/python/format/PythonVectorGetMapOutputFormat.java
+++ b/src/community/python/src/main/java/org/geoserver/python/format/PythonVectorGetMapOutputFormat.java
@@ -32,7 +32,7 @@
     }
     
     public MapProducerCapabilities getCapabilities(String format) {
-        return new MapProducerCapabilities(false, false, false, true);
+        return new MapProducerCapabilities(false, false, false, true, null);
     }
 
 }
