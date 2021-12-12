diff --git a/ide/che-core-orion-editor/src/main/java/org/eclipse/che/ide/editor/orion/client/OrionContentTypeRegistrant.java b/ide/che-core-orion-editor/src/main/java/org/eclipse/che/ide/editor/orion/client/OrionContentTypeRegistrant.java
index 4af427b..1def780 100644
--- a/ide/che-core-orion-editor/src/main/java/org/eclipse/che/ide/editor/orion/client/OrionContentTypeRegistrant.java
+++ b/ide/che-core-orion-editor/src/main/java/org/eclipse/che/ide/editor/orion/client/OrionContentTypeRegistrant.java
@@ -66,7 +66,7 @@
                     "orion.core.contenttype",
                     JavaScriptObject.createObject(),
                     contentType.toServiceObject());
-                if (config.getPatterns() != null || config.getPatterns().length() != 0) {
+                if (config.getPatterns() != null && config.getPatterns().length() != 0) {
                   serviceRegistry.doRegisterService(
                       "orion.edit.highlighter", JavaScriptObject.createObject(), config);
                 }
