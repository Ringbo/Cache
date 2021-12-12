diff --git a/platform/lang-impl/src/com/intellij/openapi/roots/impl/PushedFilePropertiesUpdaterImpl.java b/platform/lang-impl/src/com/intellij/openapi/roots/impl/PushedFilePropertiesUpdaterImpl.java
index 4480ed5..a9b5b1b 100644
--- a/platform/lang-impl/src/com/intellij/openapi/roots/impl/PushedFilePropertiesUpdaterImpl.java
+++ b/platform/lang-impl/src/com/intellij/openapi/roots/impl/PushedFilePropertiesUpdaterImpl.java
@@ -229,7 +229,7 @@
     if (value != null) return value;
     if (moduleValue != null) return moduleValue;
     final VirtualFile parent = dir.getParent();
-    if (parent != null) return findPusherValuesUpwards(project, parent, pusher);
+    if (parent != null && ProjectFileIndex.getInstance(project).isInContent(parent)) return findPusherValuesUpwards(project, parent, pusher);
     T projectValue = pusher.getImmediateValue(project, null);
     return projectValue != null? projectValue : pusher.getDefaultValue();
   }
@@ -240,7 +240,7 @@
     final T value = pusher.getImmediateValue(project, dir);
     if (value != null) return value;
     final VirtualFile parent = dir.getParent();
-    if (parent != null) return findPusherValuesUpwards(project, parent, pusher);
+    if (parent != null && ProjectFileIndex.getInstance(project).isInContent(parent)) return findPusherValuesUpwards(project, parent, pusher);
     T projectValue = pusher.getImmediateValue(project, null);
     return projectValue != null ? projectValue : pusher.getDefaultValue();
   }
