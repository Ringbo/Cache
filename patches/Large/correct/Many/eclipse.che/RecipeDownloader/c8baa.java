diff --git a/wsmaster/che-core-api-machine/src/main/java/org/eclipse/che/api/machine/server/util/RecipeDownloader.java b/wsmaster/che-core-api-machine/src/main/java/org/eclipse/che/api/machine/server/util/RecipeDownloader.java
index b6ccafa..d3bd12d 100644
--- a/wsmaster/che-core-api-machine/src/main/java/org/eclipse/che/api/machine/server/util/RecipeDownloader.java
+++ b/wsmaster/che-core-api-machine/src/main/java/org/eclipse/che/api/machine/server/util/RecipeDownloader.java
@@ -78,7 +78,7 @@
                                               machineConfig.getSource().getLocation(),
                                               e.getLocalizedMessage()));
         } finally {
-            if (file != null && file.delete()) {
+            if (file != null && !file.delete()) {
                 LOG.error(String.format("Removal of recipe file %s failed.", file.getAbsolutePath()));
             }
         }
