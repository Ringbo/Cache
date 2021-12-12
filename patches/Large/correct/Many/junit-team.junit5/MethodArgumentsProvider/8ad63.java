diff --git a/junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java b/junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java
index caf61e4..8be4b5f 100644
--- a/junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java
+++ b/junit-jupiter-params/src/main/java/org/junit/jupiter/params/provider/MethodArgumentsProvider.java
@@ -30,7 +30,7 @@
 
 	@Override
 	public void accept(MethodSource annotation) {
-		methodNames = annotation.names();
+		methodNames = annotation.value();
 	}
 
 	@Override
