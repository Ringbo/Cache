diff --git a/src/extension/netcdf-out/src/main/java/org/geoserver/web/netcdf/layer/NetCDFParserBean.java b/src/extension/netcdf-out/src/main/java/org/geoserver/web/netcdf/layer/NetCDFParserBean.java
index edc2bf0..1cc78dd 100644
--- a/src/extension/netcdf-out/src/main/java/org/geoserver/web/netcdf/layer/NetCDFParserBean.java
+++ b/src/extension/netcdf-out/src/main/java/org/geoserver/web/netcdf/layer/NetCDFParserBean.java
@@ -84,7 +84,7 @@
         }
 
         // Check if the file can be parsed
-        if (cfStandardTable != null) {
+        if (cfStandardTable != null && cfStandardTable.getType() != Resource.Type.UNDEFINED) {
             NetCDFCFParser parser = null;
             try {
                 parser = NetCDFCFParser.unmarshallXml(cfStandardTable.file());
