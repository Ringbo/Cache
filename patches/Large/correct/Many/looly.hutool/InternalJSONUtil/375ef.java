diff --git a/hutool-json/src/main/java/cn/hutool/json/InternalJSONUtil.java b/hutool-json/src/main/java/cn/hutool/json/InternalJSONUtil.java
index c53030f..2b81704 100644
--- a/hutool-json/src/main/java/cn/hutool/json/InternalJSONUtil.java
+++ b/hutool-json/src/main/java/cn/hutool/json/InternalJSONUtil.java
@@ -297,6 +297,7 @@
 		// 非标准转换格式
 		if (value instanceof JSONObject) {
 			if(BeanUtil.isBean(rowType)) {
+				//目标为Bean
 				targetValue = ((JSONObject) value).toBean(type, ignoreError);
 			}
 		} else if (value instanceof JSONArray) {
@@ -311,7 +312,7 @@
 		// 标准格式转换
 		if (null == targetValue) {
 			try {
-				targetValue = ConverterRegistry.getInstance().convert(rowType, value);
+				targetValue = ConverterRegistry.getInstance().convert(type, value);
 			} catch (ConvertException e) {
 				if (ignoreError) {
 					return null;
