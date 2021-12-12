diff --git a/modules/apps/document-library/document-library-asset-auto-tagger-tensorflow/src/main/java/com/liferay/document/library/asset/auto/tagger/tensorflow/internal/util/TensorflowProcessHolder.java b/modules/apps/document-library/document-library-asset-auto-tagger-tensorflow/src/main/java/com/liferay/document/library/asset/auto/tagger/tensorflow/internal/util/TensorflowProcessHolder.java
index 2490fb1..f15e4fc 100644
--- a/modules/apps/document-library/document-library-asset-auto-tagger-tensorflow/src/main/java/com/liferay/document/library/asset/auto/tagger/tensorflow/internal/util/TensorflowProcessHolder.java
+++ b/modules/apps/document-library/document-library-asset-auto-tagger-tensorflow/src/main/java/com/liferay/document/library/asset/auto/tagger/tensorflow/internal/util/TensorflowProcessHolder.java
@@ -210,7 +210,7 @@
 					_relanuchCounter = 0;
 				}
 
-				if (_relanuchCounter > maxRelaunch) {
+				if (_relanuchCounter >= maxRelaunch) {
 					throw new SystemException(
 						StringBundler.concat(
 							"The tensorflow process has crashed more than ",
