diff --git a/server/sonar-server/src/test/java/org/sonar/server/search/EsSearchModuleTest.java b/server/sonar-server/src/test/java/org/sonar/server/search/EsSearchModuleTest.java
index 0a121b2..19e925a 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/search/EsSearchModuleTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/search/EsSearchModuleTest.java
@@ -26,7 +26,7 @@
 
 public class EsSearchModuleTest {
   @Test
-  public void verify_count_of_added_components() throws Exception {
+  public void verify_count_of_added_components() {
     ComponentContainer container = new ComponentContainer();
     new EsSearchModule().configure(container);
     assertThat(container.size()).isEqualTo(5);
