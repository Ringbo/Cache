diff --git a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/util/UADApplicationExportHelper.java b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/util/UADApplicationExportHelper.java
index 03b9e6e..98a5f47 100644
--- a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/util/UADApplicationExportHelper.java
+++ b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/util/UADApplicationExportHelper.java
@@ -87,7 +87,7 @@
 			uadEntityAggregators.stream();
 
 		return uadEntityAggregatorStream.map(
-			UADEntityAggregator::getUADEntitySetName
+			UADEntityAggregator::getApplicationName
 		).distinct(
 		).sorted(
 		).collect(
