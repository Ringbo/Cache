diff --git a/java/java-analysis-api/src/com/intellij/openapi/roots/LanguageLevelModuleExtensionImpl.java b/java/java-analysis-api/src/com/intellij/openapi/roots/LanguageLevelModuleExtensionImpl.java
index 10ed394..b8ddf62 100644
--- a/java/java-analysis-api/src/com/intellij/openapi/roots/LanguageLevelModuleExtensionImpl.java
+++ b/java/java-analysis-api/src/com/intellij/openapi/roots/LanguageLevelModuleExtensionImpl.java
@@ -79,7 +79,7 @@
   }
 
   @Override
-  public int compareTo(@NotNull Object o) {
+  public int compareTo(@NotNull ModuleExtension o) {
     return 0;
   }
 
