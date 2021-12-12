diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserNode.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserNode.java
index 08c4a10..1f9bfcd 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserNode.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/ui/ChangesBrowserNode.java
@@ -66,7 +66,7 @@
   private boolean myHelper;
   @NotNull private final UserDataHolderBase myUserDataHolder = new UserDataHolderBase();
 
-  protected ChangesBrowserNode(Object userObject) {
+  protected ChangesBrowserNode(T userObject) {
     super(userObject);
     myAttributes = SimpleTextAttributes.REGULAR_ATTRIBUTES;
   }
@@ -105,7 +105,7 @@
     if (userObject instanceof ChangesBrowserLogicallyLockedFile) {
       return (ChangesBrowserNode) userObject;
     }
-    return new ChangesBrowserNode(userObject);
+    return new ChangesBrowserNode<>(userObject);
   }
 
   @Override
