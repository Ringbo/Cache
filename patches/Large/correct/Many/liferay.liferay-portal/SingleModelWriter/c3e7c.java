diff --git a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/impl/writer/SingleModelWriter.java b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/impl/writer/SingleModelWriter.java
index cd892bc..8ad485fe 100644
--- a/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/impl/writer/SingleModelWriter.java
+++ b/modules/apps/apio-architect/apio-architect-impl/src/main/java/com/liferay/apio/architect/impl/writer/SingleModelWriter.java
@@ -612,7 +612,7 @@
 		fieldsWriter.writeNestedLists(
 			baseRepresentorFunction, singleModel,
 			(nestedListFieldFunction, list) -> _writeNestedList(
-				nestedListFieldFunction, list, _jsonObjectBuilder, null));
+				nestedListFieldFunction, list, itemJsonObjectBuilder, null));
 
 		_singleModelMessageMapper.onFinishNestedCollectionItem(
 			collectionJSONObjectBuilder, itemJsonObjectBuilder, singleModel);
