diff --git a/processing/src/main/java/io/druid/query/dimension/DefaultDimensionSpec.java b/processing/src/main/java/io/druid/query/dimension/DefaultDimensionSpec.java
index 78fb2b4..ee5ee67 100644
--- a/processing/src/main/java/io/druid/query/dimension/DefaultDimensionSpec.java
+++ b/processing/src/main/java/io/druid/query/dimension/DefaultDimensionSpec.java
@@ -79,7 +79,7 @@
   @Override
   public boolean preservesOrdering()
   {
-    return false;
+    return true;
   }
 
   @Override
