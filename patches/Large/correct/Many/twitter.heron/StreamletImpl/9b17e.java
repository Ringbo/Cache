diff --git a/heron/api/src/java/com/twitter/heron/streamlet/impl/StreamletImpl.java b/heron/api/src/java/com/twitter/heron/streamlet/impl/StreamletImpl.java
index cf7f635..aede2e3 100644
--- a/heron/api/src/java/com/twitter/heron/streamlet/impl/StreamletImpl.java
+++ b/heron/api/src/java/com/twitter/heron/streamlet/impl/StreamletImpl.java
@@ -92,7 +92,7 @@
     return true;
   }
 
-  protected enum StreamletNamePrefixes {
+  protected enum StreamletNamePrefix {
     CONSUMER("consumer"),
     FILTER("filter"),
     FLATMAP("flatmap"),
@@ -109,7 +109,7 @@
 
     private final String prefix;
 
-    StreamletNamePrefixes(final String prefix) {
+    StreamletNamePrefix(final String prefix) {
       this.prefix = prefix;
     }
 
@@ -157,7 +157,7 @@
    * @param prefix The name prefix of this streamlet
    * @param stageNames The collections of created streamlet/stage names
    */
-  protected void setDefaultNameIfNone(String prefix, Set<String> stageNames) {
+  protected void setDefaultNameIfNone(StreamletNamePrefix prefix, Set<String> stageNames) {
     if (getName() == null) {
       setName(defaultNameCalculator(prefix, stageNames));
     }
@@ -220,11 +220,11 @@
     children.add(child);
   }
 
-  private String defaultNameCalculator(String prefix, Set<String> stageNames) {
+  private String defaultNameCalculator(StreamletNamePrefix prefix, Set<String> stageNames) {
     int index = 1;
     String calculatedName;
     while (true) {
-      calculatedName = new StringBuilder(prefix).append(index).toString();
+      calculatedName = new StringBuilder(prefix.toString()).append(index).toString();
       if (!stageNames.contains(calculatedName)) {
         break;
       }
