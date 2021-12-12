diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/component/DbIdsRepositoryTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/component/DbIdsRepositoryTest.java
index c614a8b..692ccac 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/component/DbIdsRepositoryTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/component/DbIdsRepositoryTest.java
@@ -34,7 +34,7 @@
   Component component = DumbComponent.DUMB_PROJECT;
 
   @Test
-  public void add_and_get_component_id() throws Exception {
+  public void add_and_get_component_id() {
     DbIdsRepository cache = new DbIdsRepository();
     cache.setComponentId(component, 10L);
 
@@ -42,7 +42,7 @@
   }
 
   @Test
-  public void fail_to_get_component_id_on_unknown_ref() throws Exception {
+  public void fail_to_get_component_id_on_unknown_ref() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("Component ref '" + component.getRef() + "' has no component id");
 
@@ -50,7 +50,7 @@
   }
 
   @Test
-  public void fail_if_component_id_already_set() throws Exception {
+  public void fail_if_component_id_already_set() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("Component ref '" + component.getRef() + "' has already a component id");
 
@@ -60,7 +60,7 @@
   }
 
   @Test
-  public void add_and_get_snapshot_id() throws Exception {
+  public void add_and_get_snapshot_id() {
     DbIdsRepository cache = new DbIdsRepository();
     cache.setSnapshotId(component, 100L);
 
@@ -68,7 +68,7 @@
   }
 
   @Test
-  public void fail_to_get_snapshot_id_on_unknown_ref() throws Exception {
+  public void fail_to_get_snapshot_id_on_unknown_ref() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("Component ref '" + component.getRef() + "' has no snapshot id");
 
@@ -76,7 +76,7 @@
   }
 
   @Test
-  public void fail_if_snapshot_id_already_set() throws Exception {
+  public void fail_if_snapshot_id_already_set() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("Component ref '" + component.getRef() + "' has already a snapshot id");
 
