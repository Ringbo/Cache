diff --git a/spring-boot/src/main/java/org/springframework/boot/context/embedded/undertow/UndertowEmbeddedServletContainer.java b/spring-boot/src/main/java/org/springframework/boot/context/embedded/undertow/UndertowEmbeddedServletContainer.java
index fe77ee0..728619f 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/embedded/undertow/UndertowEmbeddedServletContainer.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/embedded/undertow/UndertowEmbeddedServletContainer.java
@@ -303,7 +303,7 @@
 
 		private final Predicate maxContentSize;
 
-		public MaxSizePredicate(int size) {
+		MaxSizePredicate(int size) {
 			this.maxContentSize = Predicates.maxContentSize(size);
 		}
 
