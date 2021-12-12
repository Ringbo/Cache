diff --git a/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/lifecycle/test/ExportImportLifecycleEventTest.java b/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/lifecycle/test/ExportImportLifecycleEventTest.java
index cb4f7db..d7fc613 100644
--- a/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/lifecycle/test/ExportImportLifecycleEventTest.java
+++ b/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/lifecycle/test/ExportImportLifecycleEventTest.java
@@ -196,16 +196,15 @@
 
 			Throwable throwable = throwableInformation.getThrowable();
 
-			Assert.assertSame(
-				NoSuchLayoutSetException.class, throwable.getClass());
+			Assert.assertSame(NoSuchGroupException.class, throwable.getClass());
 
 			loggingEvents = captureAppender2.getLoggingEvents();
 
 			loggingEvent = loggingEvents.get(0);
 
 			Assert.assertEquals(
-				"Unable to publish layout: No LayoutSet exists with the key " +
-					"{groupId=" + targetGroupId + ", privateLayout=false}",
+				"Unable to publish layout: Target group does not exists with " +
+					"the primary key " + targetGroupId,
 				loggingEvent.getMessage());
 		}
 
