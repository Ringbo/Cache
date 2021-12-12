diff --git a/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBasicTestSuite.java b/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBasicTestSuite.java
index 081de2f..5d53129 100644
--- a/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBasicTestSuite.java
+++ b/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBasicTestSuite.java
@@ -69,7 +69,7 @@
         suite.addTestSuite(GridSuppressedExceptionSelfTest.class);
         suite.addTestSuite(GridLifecycleAwareSelfTest.class);
         suite.addTestSuite(GridMessageListenSelfTest.class);
-        suite.addTestSuite(GridFailFastSelfTest.class);
+        suite.addTestSuite(GridFailFastNodeFailureDetectionSelfTest.class);
 
         return suite;
     }
