diff --git a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/DDSMapResponse.java b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/DDSMapResponse.java
index 580dc16..28b4eff 100644
--- a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/DDSMapResponse.java
+++ b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/DDSMapResponse.java
@@ -100,7 +100,7 @@
 	@Override
 	public MapProducerCapabilities getCapabilities(String outputFormat) {
 		// FIXME Become more capable
-		return new MapProducerCapabilities(false, false, false, true);
+		return new MapProducerCapabilities(false, false, false, true, null);
 	}
 
 }
