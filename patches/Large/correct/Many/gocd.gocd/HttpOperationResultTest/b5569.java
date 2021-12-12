diff --git a/common/test/unit/com/thoughtworks/go/server/service/result/HttpOperationResultTest.java b/common/test/unit/com/thoughtworks/go/server/service/result/HttpOperationResultTest.java
index 324c1ac..05f270a 100644
--- a/common/test/unit/com/thoughtworks/go/server/service/result/HttpOperationResultTest.java
+++ b/common/test/unit/com/thoughtworks/go/server/service/result/HttpOperationResultTest.java
@@ -77,7 +77,7 @@
 
     @Test
     public void successShouldReturnTrueIfStatusIs2xx(){
-        assertThat(httpOperationResult.isSuccess(), is(false));
+        assertThat(httpOperationResult.isSuccess(), is(true));
 
         httpOperationResult.notAcceptable("not acceptable", HealthStateType.general(HealthStateScope.GLOBAL));
         assertThat(httpOperationResult.isSuccess(), is(false));
