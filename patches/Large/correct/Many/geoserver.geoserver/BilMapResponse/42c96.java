diff --git a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
index e24d3a3..3169300 100644
--- a/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
+++ b/src/community/dds/src/main/java/org/geoserver/wms/worldwind/BilMapResponse.java
@@ -201,7 +201,7 @@
 	        	}
 	        	ImageWorker worker = new ImageWorker(transformedImage);
 	        	Double nod = inNoDataValues != null ? (outNoData != null ? outNoData : inNoDataValues[0]) : null;
-	        	worker.setnoData(nod != null ? RangeFactory.create(nod, nod) : null);
+	        	worker.setNoData(nod != null ? RangeFactory.create(nod, nod) : null);
 	        	if((bilEncoding.equals("application/bil32")) && (dtype != DataBuffer.TYPE_FLOAT))
 	        	{
 	        	    transformedImage = worker.format(DataBuffer.TYPE_FLOAT).getRenderedImage();
