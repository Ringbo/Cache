diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RequestPredicates.java b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RequestPredicates.java
index e4ed5ce..8e88006 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RequestPredicates.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/function/server/RequestPredicates.java
@@ -588,7 +588,7 @@
 
 			private static List<Element> prependWithSeparator(List<Element> elements) {
 				List<Element> result = new ArrayList<>(elements);
-				if (!(result.get(0) instanceof Separator)) {
+				if (result.isEmpty() || !(result.get(0) instanceof Separator)) {
 					result.add(0, SEPARATOR);
 				}
 				return Collections.unmodifiableList(result);
