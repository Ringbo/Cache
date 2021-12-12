diff --git a/modules/portal/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoTaskInstanceTokenServiceTest.java b/modules/portal/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoTaskInstanceTokenServiceTest.java
index 62b2e9f..1e25c66 100644
--- a/modules/portal/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoTaskInstanceTokenServiceTest.java
+++ b/modules/portal/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoTaskInstanceTokenServiceTest.java
@@ -58,8 +58,8 @@
 			serviceContext.setUserId(user.getUserId());
 
 			int count = KaleoTaskInstanceTokenLocalServiceUtil.searchCount(
-				RandomTestUtil.randomString(), RandomTestUtil.randomStrings(10),
-				false, true, serviceContext);
+				RandomTestUtil.randomString(), RandomTestUtil.randomString(),
+				RandomTestUtil.randomStrings(10), false, true, serviceContext);
 
 			Assert.assertEquals(0, count);
 		}
