diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DefaultAssigneeTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DefaultAssigneeTest.java
index e1e846b..99fc8f4 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DefaultAssigneeTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/DefaultAssigneeTest.java
@@ -51,12 +51,12 @@
   }
 
   @Test
-  public void no_default_assignee() throws Exception {
+  public void no_default_assignee() {
     assertThat(underTest.getLogin()).isNull();
   }
 
   @Test
-  public void default_assignee() throws Exception {
+  public void default_assignee() {
     settings.setProperty(CoreProperties.DEFAULT_ISSUE_ASSIGNEE, "erik");
     when(userIndex.getNullableByLogin("erik")).thenReturn(new UserDoc().setLogin("erik"));
 
@@ -64,7 +64,7 @@
   }
 
   @Test
-  public void configured_login_does_not_exist() throws Exception {
+  public void configured_login_does_not_exist() {
     settings.setProperty(CoreProperties.DEFAULT_ISSUE_ASSIGNEE, "erik");
     when(userIndex.getNullableByLogin("erik")).thenReturn(null);
 
