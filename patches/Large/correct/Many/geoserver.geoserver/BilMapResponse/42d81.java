diff --git a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
index 9eb7957..971fb11 100644
--- a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
+++ b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
@@ -394,6 +394,6 @@
 	@Override
 	public MapProducerCapabilities getCapabilities(String outputFormat) {
 		// FIXME become more capable
-		return new MapProducerCapabilities(false, false, false, false);
+		return new MapProducerCapabilities(false, false, false, false, null);
 	}
 }
