diff --git a/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterAllExtensionPoint.java b/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterAllExtensionPoint.java
index f7a6b50..fe8c47b 100644
--- a/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterAllExtensionPoint.java
+++ b/junit5-api/src/main/java/org/junit/gen5/api/extension/AfterAllExtensionPoint.java
@@ -11,8 +11,9 @@
 package org.junit.gen5.api.extension;
 
 /**
- * {@code AfterAllCallbacks} defines the API for {@link TestExtension TestExtensions} that wish to provide additional
- * behavior to tests after all test methods have been invoked.
+ * {@code AfterAllExtensionPoint} defines the API for {@link TestExtension
+ * TestExtensions} that wish to provide additional behavior to tests after
+ * all test methods have been invoked.
  *
  * <p>Concrete implementations often implement {@link BeforeAllExtensionPoint} as well.
  *
@@ -32,6 +33,6 @@
 	 *
 	 * @param context the current container extension context
 	 */
-	void afterAll(ContainerExtensionContext context) throws Throwable;
+	void afterAll(ContainerExtensionContext context) throws Exception;
 
 }
