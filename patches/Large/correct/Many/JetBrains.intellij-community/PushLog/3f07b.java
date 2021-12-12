diff --git a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
index 369b7b1..973bfaf 100644
--- a/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
+++ b/platform/dvcs-impl/src/com/intellij/dvcs/push/ui/PushLog.java
@@ -222,7 +222,7 @@
     PopupHandler.installPopupHandler(myTree, VcsLogActionPlaces.POPUP_ACTION_GROUP, CONTEXT_MENU);
 
     myChangesBrowser =
-      new ChangesBrowser(project, null, Collections.<Change>emptyList(), null, false, true, null, ChangesBrowser.MyUseCase.LOCAL_CHANGES,
+      new ChangesBrowser(project, null, Collections.<Change>emptyList(), null, false, false, null, ChangesBrowser.MyUseCase.LOCAL_CHANGES,
                          null);
     myChangesBrowser.getDiffAction().registerCustomShortcutSet(myChangesBrowser.getDiffAction().getShortcutSet(), myTree);
     final EditSourceForDialogAction editSourceAction = new EditSourceForDialogAction(myChangesBrowser);
