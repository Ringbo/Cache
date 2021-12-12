diff --git a/portal-service/src/com/liferay/portal/kernel/util/TextFormatter.java b/portal-service/src/com/liferay/portal/kernel/util/TextFormatter.java
index 99c63cb..24c8b02 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/TextFormatter.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/TextFormatter.java
@@ -215,13 +215,13 @@
 
 		size = size / _STORAGE_SIZE_DENOMINATOR;
 
-		if (size > _STORAGE_SIZE_DENOMINATOR) {
+		if (size >= _STORAGE_SIZE_DENOMINATOR) {
 			suffix = _STORAGE_SIZE_SUFFIX_MB;
 
 			size = size / _STORAGE_SIZE_DENOMINATOR;
 		}
 
-		if (size > _STORAGE_SIZE_DENOMINATOR) {
+		if (size >= _STORAGE_SIZE_DENOMINATOR) {
 			suffix = _STORAGE_SIZE_SUFFIX_GB;
 
 			size = size / _STORAGE_SIZE_DENOMINATOR;
