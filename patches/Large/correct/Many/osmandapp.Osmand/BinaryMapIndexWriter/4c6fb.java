diff --git a/DataExtractionOSM/src/net/osmand/binary/BinaryMapIndexWriter.java b/DataExtractionOSM/src/net/osmand/binary/BinaryMapIndexWriter.java
index 2def3e2..984e128 100644
--- a/DataExtractionOSM/src/net/osmand/binary/BinaryMapIndexWriter.java
+++ b/DataExtractionOSM/src/net/osmand/binary/BinaryMapIndexWriter.java
@@ -329,7 +329,7 @@
 		}
 		
 		int restrictionsSize = 0;
-		if(restrictions.length > 0){
+		if(restrictions != null && restrictions.length > 0){
 			allSize += CodedOutputStream.computeTagSize(OsmandOdb.MapData.RESTRICTIONS_FIELD_NUMBER);
 			for (int i = 0; i < restrictions.length / 8; i++) {
 				long l = Algoritms.parseLongFromBytes(restrictions, i * 8) - stackBaseIds.peek();
@@ -376,7 +376,7 @@
 			codedOutStream.writeUInt32(OsmandOdb.MapData.STRINGID_FIELD_NUMBER, nameId);
 		} 
 		
-		if(restrictions.length > 0){
+		if(restrictions != null && restrictions.length > 0){
 			codedOutStream.writeTag(OsmandOdb.MapData.RESTRICTIONS_FIELD_NUMBER, WireFormat.FieldType.BYTES.getWireType());
 			codedOutStream.writeRawVarint32(restrictionsSize);
 			for (int i = 0; i < restrictions.length / 8; i++) {
