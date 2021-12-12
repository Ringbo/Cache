diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistEventsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistEventsStepTest.java
index 164bd94..b13e7b2 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistEventsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistEventsStepTest.java
@@ -88,7 +88,7 @@
   }
 
   @Test
-  public void nothing_to_do_when_no_events_in_report() throws Exception {
+  public void nothing_to_do_when_no_events_in_report() {
     dbTester.prepareDbUnit(getClass(), "nothing_to_do_when_no_events_in_report.xml");
 
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").build());
@@ -104,7 +104,7 @@
   }
 
   @Test
-  public void persist_report_events_with_component_children() throws Exception {
+  public void persist_report_events_with_component_children() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     DumbComponent module = DumbComponent.builder(Component.Type.MODULE, 2).setUuid("BCDE").build(); 
@@ -131,7 +131,7 @@
   }
 
   @Test
-  public void create_version_event() throws Exception {
+  public void create_version_event() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").setVersion("1.0").build();
@@ -149,7 +149,7 @@
   }
 
   @Test
-  public void keep_one_event_by_version() throws Exception {
+  public void keep_one_event_by_version() {
     dbTester.prepareDbUnit(getClass(), "keep_one_event_by_version.xml");
 
     Component project = DumbComponent.builder(Component.Type.PROJECT, 1).setUuid("ABCD").setVersion("1.5-SNAPSHOT").build();
