diff --git a/src/main/java/com/metaweb/gridworks/model/Project.java b/src/main/java/com/metaweb/gridworks/model/Project.java
index db819f2..15ac364 100644
--- a/src/main/java/com/metaweb/gridworks/model/Project.java
+++ b/src/main/java/com/metaweb/gridworks/model/Project.java
@@ -62,7 +62,7 @@
         return ProjectManager.singleton.getProjectMetadata(id);
     }
     
-    public void save() {
+    synchronized public void save() {
         synchronized (this) {
             File dir = ProjectManager.singleton.getProjectDir(id);
             
@@ -257,7 +257,7 @@
         int     keyCellIndex;
     }
     
-    public void recomputeRowContextDependencies() {
+    synchronized public void recomputeRowContextDependencies() {
         List<Group> keyedGroups = new ArrayList<Group>();
         
         addRootKeyedGroup(keyedGroups);
