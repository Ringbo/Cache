diff --git a/portal-impl/test/integration/com/liferay/portal/spring/transaction/TransactionInterceptorTest.java b/portal-impl/test/integration/com/liferay/portal/spring/transaction/TransactionInterceptorTest.java
index 4550baf..3516626 100644
--- a/portal-impl/test/integration/com/liferay/portal/spring/transaction/TransactionInterceptorTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/spring/transaction/TransactionInterceptorTest.java
@@ -51,7 +51,7 @@
 	public void testFailOnCommit() throws SystemException {
 		CaptureAppender captureAppender =
 			Log4JLoggerTestUtil.configureJDKLogger(
-				TransactionInterceptor.class.getName(), Level.ERROR);
+				DefaultTransactionExecutor.class.getName(), Level.ERROR);
 
 		long classNameId = CounterLocalServiceUtil.increment();
 
