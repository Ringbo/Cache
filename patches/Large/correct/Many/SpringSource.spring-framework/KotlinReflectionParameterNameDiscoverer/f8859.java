diff --git a/spring-core/src/main/java/org/springframework/core/KotlinReflectionParameterNameDiscoverer.java b/spring-core/src/main/java/org/springframework/core/KotlinReflectionParameterNameDiscoverer.java
index 129a364..597c3b6 100644
--- a/spring-core/src/main/java/org/springframework/core/KotlinReflectionParameterNameDiscoverer.java
+++ b/spring-core/src/main/java/org/springframework/core/KotlinReflectionParameterNameDiscoverer.java
@@ -58,7 +58,7 @@
 	@Override
 	@Nullable
 	public String[] getParameterNames(Constructor<?> ctor) {
-		if (!KotlinDetector.isKotlinType(ctor.getDeclaringClass())) {
+		if (ctor.getDeclaringClass().isEnum() || !KotlinDetector.isKotlinType(ctor.getDeclaringClass())) {
 			return null;
 		}
 
