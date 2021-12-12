diff --git a/modules/apps/adaptive-media/adaptive-media-image-item-selector-api-test/src/testIntegration/java/com/liferay/adaptive/media/image/item/selector/internal/resolver/test/FileEntryAdaptiveMediaImageURLItemSelectorReturnTypeResolverTest.java b/modules/apps/adaptive-media/adaptive-media-image-item-selector-api-test/src/testIntegration/java/com/liferay/adaptive/media/image/item/selector/internal/resolver/test/FileEntryAdaptiveMediaImageURLItemSelectorReturnTypeResolverTest.java
index a531257..ea2311e 100644
--- a/modules/apps/adaptive-media/adaptive-media-image-item-selector-api-test/src/testIntegration/java/com/liferay/adaptive/media/image/item/selector/internal/resolver/test/FileEntryAdaptiveMediaImageURLItemSelectorReturnTypeResolverTest.java
+++ b/modules/apps/adaptive-media/adaptive-media-image-item-selector-api-test/src/testIntegration/java/com/liferay/adaptive/media/image/item/selector/internal/resolver/test/FileEntryAdaptiveMediaImageURLItemSelectorReturnTypeResolverTest.java
@@ -224,7 +224,7 @@
 				"liferay/adaptive_media_processor")) {
 
 			_addTestVariant("small", "uuid0", 50, 50);
-			_addTestVariant("small.hd", "uuid1", 99, 200);
+			_addTestVariant("small.hd", "uuid1", 99, 100);
 
 			ServiceContext serviceContext =
 				ServiceContextTestUtil.getServiceContext(
@@ -256,7 +256,7 @@
 				"uuid1", fileEntry.getTitle());
 
 			_assertAttibutes(sourcesJSONArray.getJSONObject(0), 50, 0);
-			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 99, 50);
+			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 100, 50);
 		}
 	}
 
@@ -268,7 +268,7 @@
 				"liferay/adaptive_media_processor")) {
 
 			_addTestVariant("small", "uuid0", 50, 50);
-			_addTestVariant("small.hd", "uuid1", 101, 200);
+			_addTestVariant("small.hd", "uuid1", 101, 100);
 
 			ServiceContext serviceContext =
 				ServiceContextTestUtil.getServiceContext(
@@ -300,7 +300,7 @@
 				"uuid1", fileEntry.getTitle());
 
 			_assertAttibutes(sourcesJSONArray.getJSONObject(0), 50, 0);
-			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 101, 50);
+			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 100, 50);
 		}
 	}
 
@@ -312,7 +312,7 @@
 				"liferay/adaptive_media_processor")) {
 
 			_addTestVariant("small", "uuid0", 50, 50);
-			_addTestVariant("small.hd", "uuid1", 200, 99);
+			_addTestVariant("small.hd", "uuid1", 100, 99);
 
 			ServiceContext serviceContext =
 				ServiceContextTestUtil.getServiceContext(
@@ -356,7 +356,7 @@
 				"liferay/adaptive_media_processor")) {
 
 			_addTestVariant("small", "uuid0", 50, 50);
-			_addTestVariant("small.hd", "uuid1", 200, 101);
+			_addTestVariant("small.hd", "uuid1", 100, 101);
 
 			ServiceContext serviceContext =
 				ServiceContextTestUtil.getServiceContext(
@@ -432,7 +432,7 @@
 				"uuid1", fileEntry.getTitle());
 
 			_assertAttibutes(sourcesJSONArray.getJSONObject(0), 50, 0);
-			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 98, 50);
+			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 200, 50);
 		}
 	}
 
@@ -476,7 +476,7 @@
 				"uuid1", fileEntry.getTitle());
 
 			_assertAttibutes(sourcesJSONArray.getJSONObject(0), 50, 0);
-			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 102, 50);
+			_assertAttibutes(sourcesJSONArray.getJSONObject(1), 200, 50);
 		}
 	}
 
