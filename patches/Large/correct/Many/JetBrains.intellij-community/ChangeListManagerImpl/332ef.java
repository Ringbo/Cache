diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
index 26bc750..1c07717 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ChangeListManagerImpl.java
@@ -142,7 +142,7 @@
                     public void setValue(Value value) {
                       config.REMOVE_EMPTY_INACTIVE_CHANGELISTS = value;
                     }
-                  }, "<html>The empty changelist '" + StringUtil.last(oldDefaultList.getName(), 30, true) + "' is no longer active.<br>" +
+                  }, "<html>The empty changelist '" + StringUtil.first(oldDefaultList.getName(), 30, true) + "' is no longer active.<br>" +
                      "Do you want to remove it?</html>", "&Remember my choice");
                   dialog.show();
                   if (!dialog.isOK()) {
