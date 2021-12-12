diff --git a/jest-common/src/main/java/io/searchbox/core/MultiSearchResult.java b/jest-common/src/main/java/io/searchbox/core/MultiSearchResult.java
index 909a117..ddd9189 100644
--- a/jest-common/src/main/java/io/searchbox/core/MultiSearchResult.java
+++ b/jest-common/src/main/java/io/searchbox/core/MultiSearchResult.java
@@ -46,7 +46,7 @@
         public MultiSearchResponse(JsonObject jsonObject) {
             if(jsonObject.has(ERROR_KEY)) {
                 isError = true;
-                errorMessage = jsonObject.get(ERROR_KEY).getAsString();
+                errorMessage = jsonObject.get(ERROR_KEY).toString();
                 searchResult = null;
             } else {
                 isError = false;
