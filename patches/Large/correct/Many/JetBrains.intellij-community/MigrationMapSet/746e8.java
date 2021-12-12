diff --git a/java/java-impl/src/com/intellij/refactoring/migration/MigrationMapSet.java b/java/java-impl/src/com/intellij/refactoring/migration/MigrationMapSet.java
index 7d4fc64..96ce8f8 100644
--- a/java/java-impl/src/com/intellij/refactoring/migration/MigrationMapSet.java
+++ b/java/java-impl/src/com/intellij/refactoring/migration/MigrationMapSet.java
@@ -121,7 +121,7 @@
   private static File getMapDirectory() {
     File dir = new File(PathManager.getConfigPath() + File.separator + "migration");
 
-    if (!dir.exists() && !dir.mkdir()) {
+    if (!dir.exists() && !dir.mkdirs()) {
       LOG.error("cannot create directory: " + dir.getAbsolutePath());
       return null;
     }
