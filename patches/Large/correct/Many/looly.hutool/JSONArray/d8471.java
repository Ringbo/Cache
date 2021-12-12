diff --git a/hutool-json/src/main/java/cn/hutool/json/JSONArray.java b/hutool-json/src/main/java/cn/hutool/json/JSONArray.java
index acf2bfd..03f22e0 100644
--- a/hutool-json/src/main/java/cn/hutool/json/JSONArray.java
+++ b/hutool-json/src/main/java/cn/hutool/json/JSONArray.java
@@ -506,7 +506,7 @@
 			return false;
 		}
 		final ArrayList<Object> list = new ArrayList<>(c.size());
-		for (Object object : list) {
+		for (Object object : c) {
 			list.add(JSONUtil.wrap(object, ignoreNullValue));
 		}
 		return rawList.addAll(index, list);
