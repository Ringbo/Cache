diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistProjectLinksStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistProjectLinksStepTest.java
index 8d8126c..950a4ac 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistProjectLinksStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistProjectLinksStepTest.java
@@ -86,7 +86,7 @@
   }
 
   @Test
-  public void add_links_on_project_and_module() throws Exception {
+  public void add_links_on_project_and_module() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").addChildren(
@@ -116,7 +116,7 @@
   }
 
   @Test
-  public void nothing_to_do_when_link_already_exists() throws Exception {
+  public void nothing_to_do_when_link_already_exists() {
     dbTester.prepareDbUnit(getClass(), "nothing_to_do_when_link_already_exists.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
@@ -133,7 +133,7 @@
   }
 
   @Test
-  public void do_not_add_links_on_file() throws Exception {
+  public void do_not_add_links_on_file() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").addChildren(
@@ -157,7 +157,7 @@
   }
 
   @Test
-  public void update_link() throws Exception {
+  public void update_link() {
     dbTester.prepareDbUnit(getClass(), "update_link.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
@@ -174,7 +174,7 @@
   }
 
   @Test
-  public void delete_link() throws Exception {
+  public void delete_link() {
     dbTester.prepareDbUnit(getClass(), "delete_link.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
@@ -190,7 +190,7 @@
   }
 
   @Test
-  public void not_delete_custom_link() throws Exception {
+  public void not_delete_custom_link() {
     dbTester.prepareDbUnit(getClass(), "not_delete_custom_link.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
@@ -206,7 +206,7 @@
   }
 
   @Test
-  public void fail_when_trying_to_add_same_link_type_multiple_times() throws Exception {
+  public void fail_when_trying_to_add_same_link_type_multiple_times() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
