diff --git a/core/descriptors/src/org/jetbrains/jet/lang/types/AbstractJetType.java b/core/descriptors/src/org/jetbrains/jet/lang/types/AbstractJetType.java
index 1d7f578..d5ddee2 100644
--- a/core/descriptors/src/org/jetbrains/jet/lang/types/AbstractJetType.java
+++ b/core/descriptors/src/org/jetbrains/jet/lang/types/AbstractJetType.java
@@ -41,7 +41,7 @@
     }
 
     @Override
-    public final String toString() {
+    public String toString() {
         List<TypeProjection> arguments = getArguments();
         return getConstructor() + (arguments.isEmpty() ? "" : "<" + argumentsToString(arguments) + ">") + (isNullable() ? "?" : "");
     }
