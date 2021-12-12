diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/component/TreeRootHolderImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/component/TreeRootHolderImplTest.java
index 52c8bdb..6f9447c 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/component/TreeRootHolderImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/component/TreeRootHolderImplTest.java
@@ -52,7 +52,7 @@
   }
 
   @Test
-  public void get_by_ref() throws Exception {
+  public void get_by_ref() {
     Component file = DumbComponent.builder(Component.Type.FILE, 4).build();
     Component directory = DumbComponent.builder(Component.Type.DIRECTORY, 3).addChildren(file).build();
     Component module = DumbComponent.builder(Component.Type.MODULE, 2).addChildren(directory).build();
@@ -66,13 +66,13 @@
   }
 
   @Test
-  public void fail_to_get_by_ref_if_root_not_set() throws Exception {
+  public void fail_to_get_by_ref_if_root_not_set() {
     thrown.expect(IllegalStateException.class);
     treeRootHolder.getComponentByRef(project.getRef());
   }
 
   @Test
-  public void fail_to_get_by_ref_if_ref_not_found() throws Exception {
+  public void fail_to_get_by_ref_if_ref_not_found() {
     thrown.expect(IllegalArgumentException.class);
     treeRootHolder.setRoot(project);
     treeRootHolder.getComponentByRef(123);
