diff --git a/patching/src/main/java/org/jboss/as/patching/tool/PatchTool.java b/patching/src/main/java/org/jboss/as/patching/tool/PatchTool.java
index 1c654f2..24de1b6 100644
--- a/patching/src/main/java/org/jboss/as/patching/tool/PatchTool.java
+++ b/patching/src/main/java/org/jboss/as/patching/tool/PatchTool.java
@@ -132,13 +132,13 @@
             if(operation.hasDefined(Constants.OVERRIDE)) {
                 final ModelNode overrides = operation.get(Constants.OVERRIDE);
                 for(final ModelNode override : overrides.asList()) {
-                    builder.overrideItem(override.toString());
+                    builder.overrideItem(override.asString());
                 }
             }
             if(operation.hasDefined(Constants.PRESERVE)) {
                 final ModelNode preserves = operation.get(Constants.PRESERVE);
                 for(final ModelNode preserve : preserves.asList()) {
-                    builder.preserveItem(preserve.toString());
+                    builder.preserveItem(preserve.asString());
                 }
             }
             return builder.createPolicy();
