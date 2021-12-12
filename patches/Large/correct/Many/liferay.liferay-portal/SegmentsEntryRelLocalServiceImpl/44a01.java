diff --git a/modules/apps/segments/segments-service/src/main/java/com/liferay/segments/service/impl/SegmentsEntryRelLocalServiceImpl.java b/modules/apps/segments/segments-service/src/main/java/com/liferay/segments/service/impl/SegmentsEntryRelLocalServiceImpl.java
index b21fced..7a58978 100644
--- a/modules/apps/segments/segments-service/src/main/java/com/liferay/segments/service/impl/SegmentsEntryRelLocalServiceImpl.java
+++ b/modules/apps/segments/segments-service/src/main/java/com/liferay/segments/service/impl/SegmentsEntryRelLocalServiceImpl.java
@@ -71,13 +71,13 @@
 	}
 
 	@Override
-	public List<SegmentsEntryRel> getSegmentEntryRels(long segmentEntryId) {
+	public List<SegmentsEntryRel> getSegmentsEntryRels(long segmentsEntryId) {
 		return segmentsEntryRelPersistence.findBySegmentsEntryId(
-			segmentEntryId);
+			segmentsEntryId);
 	}
 
 	@Override
-	public List<SegmentsEntryRel> getSegmentEntryRels(
+	public List<SegmentsEntryRel> getSegmentsEntryRels(
 		long classNameId, long classPK) {
 
 		return segmentsEntryRelPersistence.findByCN_CPK(classNameId, classPK);
