diff --git a/spring-core/src/main/java/org/springframework/core/ReactiveAdapterRegistry.java b/spring-core/src/main/java/org/springframework/core/ReactiveAdapterRegistry.java
index dfe7625..d582359 100644
--- a/spring-core/src/main/java/org/springframework/core/ReactiveAdapterRegistry.java
+++ b/spring-core/src/main/java/org/springframework/core/ReactiveAdapterRegistry.java
@@ -123,7 +123,7 @@
 		Object sourceToUse = (source instanceof Optional ? ((Optional<?>) source).orElse(null) : source);
 		Class<?> clazz = (sourceToUse != null ? sourceToUse.getClass() : reactiveType);
 
-		if (reactiveType == null) {
+		if (clazz == null) {
 			return null;
 		}
 
