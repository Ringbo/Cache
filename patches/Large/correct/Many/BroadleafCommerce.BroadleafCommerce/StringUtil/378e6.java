diff --git a/common/src/main/java/org/broadleafcommerce/common/util/StringUtil.java b/common/src/main/java/org/broadleafcommerce/common/util/StringUtil.java
index eb61aa2..571cf59 100644
--- a/common/src/main/java/org/broadleafcommerce/common/util/StringUtil.java
+++ b/common/src/main/java/org/broadleafcommerce/common/util/StringUtil.java
@@ -89,7 +89,7 @@
         boolean firstIteration = true;
 
         for (Entry<String, Object> entry : objectMap.entrySet()) {
-            if (firstIteration) {
+            if (!firstIteration) {
                 sb.append(',');
             }
             sb.append(JSONObject.quote(entry.getKey()));
