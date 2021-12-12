diff --git a/junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java b/junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java
index 17b4751..7930323 100644
--- a/junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java
+++ b/junit-jupiter-engine/src/main/java/org/junit/jupiter/engine/descriptor/TestMethodTestDescriptor.java
@@ -300,9 +300,11 @@
 				BlacklistedExceptions.rethrowIfBlacklisted(throwable);
 				ExtensionContext extensionContext = context.getExtensionContext();
 				logger.warn(throwable,
-					() -> String.format("Failed to invoke TestWatcher %s for test %s", watcher.getClass().getName(),
+					() -> String.format("Failed to invoke TestWatcher [%s] for method [%s] with display name [%s]",
+						watcher.getClass().getName(),
 						ReflectionUtils.getFullyQualifiedMethodName(extensionContext.getRequiredTestClass(),
-							extensionContext.getRequiredTestMethod())));
+							extensionContext.getRequiredTestMethod()),
+						getDisplayName()));
 			}
 		});
 	}
