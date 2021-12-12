diff --git a/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeAllExtensionPoint.java b/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeAllExtensionPoint.java
index a0bc295..bfc9c19 100644
--- a/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeAllExtensionPoint.java
+++ b/junit5-api/src/main/java/org/junit/gen5/api/extension/BeforeAllExtensionPoint.java
@@ -11,8 +11,9 @@
 package org.junit.gen5.api.extension;
 
 /**
- * {@code BeforeAllCallbacks} defines the API for {@link TestExtension TestExtensions} that wish to provide additional
- * behavior to tests before all test methods have been invoked.
+ * {@code BeforeAllExtensionPoint} defines the API for {@link TestExtension
+ * TestExtensions} that wish to provide additional behavior to tests before
+ * all test methods have been invoked.
  *
  * <p>Concrete implementations often implement {@link AfterAllExtensionPoint} as well.
  *
@@ -32,6 +33,6 @@
 	 *
 	 * @param context the current container extension context
 	 */
-	void beforeAll(ContainerExtensionContext context) throws Throwable;
+	void beforeAll(ContainerExtensionContext context) throws Exception;
 
 }
