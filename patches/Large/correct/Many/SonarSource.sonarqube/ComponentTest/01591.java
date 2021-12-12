diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentTest.java
index f7f8f5f..d2f1550 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/component/ComponentTest.java
@@ -29,57 +29,57 @@
 
 public class ComponentTest {
   @Test
-  public void verify_type_is_deeper_than_when_comparing_to_itself() throws Exception {
+  public void verify_type_is_deeper_than_when_comparing_to_itself() {
     for (Component.Type type : Component.Type.values()) {
       assertThat(type.isDeeperThan(type)).isFalse();
     }
   }
 
   @Test
-  public void FILE_type_is_deeper_than_all_other_types() throws Exception {
+  public void FILE_type_is_deeper_than_all_other_types() {
     assertThat(Component.Type.FILE.isDeeperThan(DIRECTORY)).isTrue();
     assertThat(Component.Type.FILE.isDeeperThan(MODULE)).isTrue();
     assertThat(Component.Type.FILE.isDeeperThan(PROJECT)).isTrue();
   }
 
   @Test
-  public void DIRECTORY_type_is_deeper_than_MODULE_and_PROJECT() throws Exception {
+  public void DIRECTORY_type_is_deeper_than_MODULE_and_PROJECT() {
     assertThat(Component.Type.DIRECTORY.isDeeperThan(MODULE)).isTrue();
     assertThat(Component.Type.DIRECTORY.isDeeperThan(PROJECT)).isTrue();
   }
 
   @Test
-  public void MODULE_type_is_deeper_than_PROJECT() throws Exception {
+  public void MODULE_type_is_deeper_than_PROJECT() {
     assertThat(Component.Type.MODULE.isDeeperThan(PROJECT)).isTrue();
   }
 
   @Test
-  public void FILE_type_is_higher_than_no_other_types() throws Exception {
+  public void FILE_type_is_higher_than_no_other_types() {
     assertThat(Component.Type.FILE.isHigherThan(DIRECTORY)).isFalse();
     assertThat(Component.Type.FILE.isHigherThan(MODULE)).isFalse();
     assertThat(Component.Type.FILE.isHigherThan(PROJECT)).isFalse();
   }
 
   @Test
-  public void DIRECTORY_type_is_higher_than_FILE() throws Exception {
+  public void DIRECTORY_type_is_higher_than_FILE() {
     assertThat(Component.Type.DIRECTORY.isHigherThan(FILE)).isTrue();
   }
 
   @Test
-  public void MODULE_type_is_higher_than_FILE_AND_DIRECTORY() throws Exception {
+  public void MODULE_type_is_higher_than_FILE_AND_DIRECTORY() {
     assertThat(Component.Type.MODULE.isHigherThan(FILE)).isTrue();
     assertThat(Component.Type.MODULE.isHigherThan(DIRECTORY)).isTrue();
   }
 
   @Test
-  public void PROJECT_type_is_higher_than_all_other_types() throws Exception {
+  public void PROJECT_type_is_higher_than_all_other_types() {
     assertThat(Component.Type.PROJECT.isHigherThan(FILE)).isTrue();
     assertThat(Component.Type.PROJECT.isHigherThan(DIRECTORY)).isTrue();
     assertThat(Component.Type.PROJECT.isHigherThan(MODULE)).isTrue();
   }
 
   @Test
-  public void any_type_is_not_higher_than_itself() throws Exception {
+  public void any_type_is_not_higher_than_itself() {
     assertThat(Component.Type.FILE.isHigherThan(FILE)).isFalse();
     assertThat(Component.Type.DIRECTORY.isHigherThan(DIRECTORY)).isFalse();
     assertThat(Component.Type.MODULE.isHigherThan(MODULE)).isFalse();
