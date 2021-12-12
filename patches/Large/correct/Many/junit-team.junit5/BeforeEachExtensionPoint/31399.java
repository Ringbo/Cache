diff --git a/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeEachExtensionPoint.java b/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeEachExtensionPoint.java
index 8c46fd6..98b72b6 100644
--- a/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeEachExtensionPoint.java
+++ b/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeEachExtensionPoint.java
@@ -11,8 +11,9 @@
 package org.junit.gen5.api.extension;
 
 /**
- * {@code BeforeEachCallbacks} defines the API for {@link ExtensionPoint} that wish to provide additional
- * behavior to tests before each test method has been invoked.
+ * {@code BeforeEachExtensionPoint} defines the API for {@link TestExtension
+ * TestExtensions} that wish to provide additional behavior to tests before
+ * each test method has been invoked.
  *
  * <p>Concrete implementations often implement {@link AfterEachExtensionPoint} as well.
  *
@@ -32,6 +33,6 @@
 	 *
 	 * @param context the current test extension context
 	 */
-	void beforeEach(TestExtensionContext context) throws Throwable;
+	void beforeEach(TestExtensionContext context) throws Exception;
 
 }
