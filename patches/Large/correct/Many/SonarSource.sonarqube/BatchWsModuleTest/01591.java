diff --git a/server/sonar-server/src/test/java/org/sonar/server/batch/BatchWsModuleTest.java b/server/sonar-server/src/test/java/org/sonar/server/batch/BatchWsModuleTest.java
index 6c992f9..009d79a 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/batch/BatchWsModuleTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/batch/BatchWsModuleTest.java
@@ -26,7 +26,7 @@
 
 public class BatchWsModuleTest {
   @Test
-  public void verify_count_of_added_components() throws Exception {
+  public void verify_count_of_added_components() {
     ComponentContainer container = new ComponentContainer();
     new BatchWsModule().configure(container);
     assertThat(container.size()).isEqualTo(10);
