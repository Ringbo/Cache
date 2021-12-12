diff --git a/platform/projectModel-impl/src/com/intellij/openapi/options/EmptySchemesManager.java b/platform/projectModel-impl/src/com/intellij/openapi/options/EmptySchemesManager.java
index 62a3b96..8043bd7 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/options/EmptySchemesManager.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/options/EmptySchemesManager.java
@@ -65,7 +65,7 @@
 
   @Nullable
   @Override
-  public Object getCurrentScheme() {
+  public Scheme getCurrentScheme() {
     return null;
   }
 }
