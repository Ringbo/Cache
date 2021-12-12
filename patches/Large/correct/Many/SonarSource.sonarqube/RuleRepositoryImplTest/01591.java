diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleRepositoryImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleRepositoryImplTest.java
index 5084e42..b4c723a 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleRepositoryImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleRepositoryImplTest.java
@@ -34,7 +34,7 @@
   RuleRepositoryImpl underTest = new RuleRepositoryImpl(cacheLoader);
 
   @Test
-  public void getByKey() throws Exception {
+  public void getByKey() {
     when(cacheLoader.load(XOO_X1)).thenReturn(new DumbRule(XOO_X1));
 
     assertThat(underTest.getByKey(XOO_X1).getKey()).isEqualTo(XOO_X1);
