diff --git a/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java b/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
index 266a7b4..3b17701 100644
--- a/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
+++ b/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
@@ -1180,8 +1180,7 @@
                     childExp,
                     BuiltinMethod.DISTINCT.method,
                     Expressions.<Expression>list()
-                        .appendIfNotNull(
-                            keyPhysType.comparer()))));
+                        .appendIfNotNull(physType.comparer()))));
       } else {
         final Expression resultSelector =
             builder.append(
