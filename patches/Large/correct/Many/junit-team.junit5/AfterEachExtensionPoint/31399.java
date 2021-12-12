diff --git a/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterEachExtensionPoint.java b/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterEachExtensionPoint.java
index 7df908d..dbe750d 100644
--- a/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterEachExtensionPoint.java
+++ b/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterEachExtensionPoint.java
@@ -11,7 +11,7 @@
 package org.junit.gen5.api.extension;
 
 /**
- * {@code AfterEachCallbacks} defines the API for {@link TestExtension
+ * {@code AfterEachExtensionPoint} defines the API for {@link TestExtension
  * TestExtensions} that wish to provide additional behavior to tests
  * after each test method has been invoked.
  *
@@ -35,6 +35,6 @@
 	 *
 	 * @param context the current test extension context
 	 */
-	void afterEach(TestExtensionContext context) throws Throwable;
+	void afterEach(TestExtensionContext context) throws Exception;
 
 }
