diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/qualitymodel/Characteristic.java b/sonar-plugin-api/src/main/java/org/sonar/api/qualitymodel/Characteristic.java
index 492ba4b..474b750 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/qualitymodel/Characteristic.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/qualitymodel/Characteristic.java
@@ -174,7 +174,7 @@
     return this;
   }
 
-  Characteristic removeChild(Characteristic child) {
+  public Characteristic removeChild(Characteristic child) {
     children.remove(child);
     return this;
   }
@@ -217,7 +217,7 @@
    * Enabled children sorted by insertion order
    */
   public List<Characteristic> getChildren(boolean onlyEnabled) {
-    if (onlyEnabled) {
+    if (!onlyEnabled) {
       return children;
     }
     List<Characteristic> result = Lists.newArrayList();
