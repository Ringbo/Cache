diff --git a/subprojects/platform-base/src/main/java/org/gradle/platform/base/component/BaseComponentSpec.java b/subprojects/platform-base/src/main/java/org/gradle/platform/base/component/BaseComponentSpec.java
index ec6db4d..8a68009 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/platform/base/component/BaseComponentSpec.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/platform/base/component/BaseComponentSpec.java
@@ -213,7 +213,7 @@
         binaries.ensureUsable();
         return binaries.asMutable(
             ModelTypes.modelMap(BinarySpecInternal.PUBLIC_MODEL_TYPE),
-            RuleContext.nest(identifier.toString() + ".getBinaries()"),
+            RuleContext.nest(modelNode.toString() + ".getBinaries()"),
             Collections.<ModelView<?>>emptyList()
         ).getInstance();
     }
