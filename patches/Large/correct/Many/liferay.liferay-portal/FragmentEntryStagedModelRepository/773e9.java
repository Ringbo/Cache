diff --git a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/internal/exportimport/staged/model/repository/FragmentEntryStagedModelRepository.java b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/internal/exportimport/staged/model/repository/FragmentEntryStagedModelRepository.java
index cf7071e..37a0328 100644
--- a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/internal/exportimport/staged/model/repository/FragmentEntryStagedModelRepository.java
+++ b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/internal/exportimport/staged/model/repository/FragmentEntryStagedModelRepository.java
@@ -60,7 +60,7 @@
 			fragmentEntry.getFragmentCollectionId(), fragmentEntry.getName(),
 			fragmentEntry.getCss(), fragmentEntry.getHtml(),
 			fragmentEntry.getJs(), fragmentEntry.getPreviewFileEntryId(),
-			fragmentEntry.getStatus(), serviceContext);
+			fragmentEntry.getType(), fragmentEntry.getStatus(), serviceContext);
 	}
 
 	@Override
