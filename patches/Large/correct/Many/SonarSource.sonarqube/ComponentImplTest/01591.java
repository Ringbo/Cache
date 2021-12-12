diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentImplTest.java
index 4a1807b..e71f43b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentImplTest.java
@@ -68,21 +68,21 @@
   }
 
   @Test
-  public void get_name_from_batch_component() throws Exception {
+  public void get_name_from_batch_component() {
     String name = "project";
     ComponentImpl component = new ComponentImpl(BatchReport.Component.newBuilder().setName(name).build(), EMPTY_CHILD_LIST);
     assertThat(component.getName()).isEqualTo(name);
   }
 
   @Test
-  public void get_version_from_batch_component() throws Exception {
+  public void get_version_from_batch_component() {
     String version = "1.0";
     ComponentImpl component = new ComponentImpl(BatchReport.Component.newBuilder().setVersion(version).build(), EMPTY_CHILD_LIST);
     assertThat(component.getVersion()).isEqualTo(version);
   }
 
   @Test
-  public void getFileAttributes_throws_ISE_if_BatchComponent_does_not_have_type_FILE() throws Exception {
+  public void getFileAttributes_throws_ISE_if_BatchComponent_does_not_have_type_FILE() {
     for (ComponentType componentType : from(asList(ComponentType.values())).filter(not(equalTo(ComponentType.FILE)))) {
       ComponentImpl component = new ComponentImpl(BatchReport.Component.newBuilder().setType(componentType).build(), EMPTY_CHILD_LIST);
       try {
@@ -95,14 +95,14 @@
   }
 
   @Test
-  public void isUnitTest_returns_true_if_IsTest_is_set_in_BatchComponent() throws Exception {
+  public void isUnitTest_returns_true_if_IsTest_is_set_in_BatchComponent() {
     ComponentImpl component = new ComponentImpl(BatchReport.Component.newBuilder().setType(ComponentType.FILE).setIsTest(true).build(), EMPTY_CHILD_LIST);
 
     assertThat(component.getFileAttributes().isUnitTest()).isTrue();
   }
 
   @Test
-  public void isUnitTest_returns_value_of_language_of_BatchComponent() throws Exception {
+  public void isUnitTest_returns_value_of_language_of_BatchComponent() {
     String languageKey = "some language key";
     ComponentImpl component = new ComponentImpl(BatchReport.Component.newBuilder().setType(ComponentType.FILE).setLanguage(languageKey).build(), EMPTY_CHILD_LIST);
 
