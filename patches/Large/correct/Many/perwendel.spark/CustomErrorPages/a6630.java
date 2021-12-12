diff --git a/src/main/java/spark/CustomErrorPages.java b/src/main/java/spark/CustomErrorPages.java
index 7450924..ff7b124 100644
--- a/src/main/java/spark/CustomErrorPages.java
+++ b/src/main/java/spark/CustomErrorPages.java
@@ -35,7 +35,7 @@
         Object customRenderer = CustomErrorPages.getInstance().customPages.get(status);
         Object customPage;
 
-        customPage = status == 400 ? NOT_FOUND : INTERNAL_ERROR;
+        customPage = status == 404 ? NOT_FOUND : INTERNAL_ERROR;
 
         if (customRenderer instanceof String) {
             customPage = customRenderer;
