diff --git a/bundles/action/org.openhab.action.satel/src/main/java/org/openhab/action/satel/internal/SatelActionService.java b/bundles/action/org.openhab.action.satel/src/main/java/org/openhab/action/satel/internal/SatelActionService.java
index e8a84a9..4c99ce4 100644
--- a/bundles/action/org.openhab.action.satel/src/main/java/org/openhab/action/satel/internal/SatelActionService.java
+++ b/bundles/action/org.openhab.action.satel/src/main/java/org/openhab/action/satel/internal/SatelActionService.java
@@ -66,16 +66,16 @@
      *
      * @param module reference to set
      */
-    public static void setSatelCommModule(SatelCommModule module) {
+    public void setSatelCommModule(SatelCommModule module) {
         satelCommModule = module;
     }
 
     /**
-     * Removes reference to Satel communication module service/
+     * Removes reference to Satel communication module service.
      *
      * @param module reference to remove
      */
-    public static void unsetSatelCommModule(SatelCommModule module) {
+    public void unsetSatelCommModule(SatelCommModule module) {
         if (satelCommModule == module) {
             satelCommModule = null;
         }
