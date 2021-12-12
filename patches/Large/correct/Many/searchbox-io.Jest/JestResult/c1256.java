diff --git a/jest-common/src/main/java/io/searchbox/client/JestResult.java b/jest-common/src/main/java/io/searchbox/client/JestResult.java
index 38feb1d..003f94e 100644
--- a/jest-common/src/main/java/io/searchbox/client/JestResult.java
+++ b/jest-common/src/main/java/io/searchbox/client/JestResult.java
@@ -102,7 +102,7 @@
     public void setJsonObject(JsonObject jsonObject) {
         this.jsonObject = jsonObject;
         if (jsonObject.get("error") != null) {
-            errorMessage = jsonObject.get("error").getAsString();
+            errorMessage = jsonObject.get("error").toString();
         }
     }
 
