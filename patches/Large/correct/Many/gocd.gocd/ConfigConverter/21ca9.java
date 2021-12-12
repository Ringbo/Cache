diff --git a/server/src/com/thoughtworks/go/config/ConfigConverter.java b/server/src/com/thoughtworks/go/config/ConfigConverter.java
index 7f71402..df6c428 100644
--- a/server/src/com/thoughtworks/go/config/ConfigConverter.java
+++ b/server/src/com/thoughtworks/go/config/ConfigConverter.java
@@ -308,7 +308,7 @@
 
         return new PluggableSCMMaterialConfig(toMaterialName(crPluggableScmMaterial.getName()),
                 scmConfig,crPluggableScmMaterial.getDirectory(),
-                toFilter(crPluggableScmMaterial.getFilterIgnore()));
+                toFilter(crPluggableScmMaterial.getFilterIgnores()));
     }
 
     private SCMs getSCMs() {
