diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
index f9a5934..3e90f23 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
@@ -532,7 +532,7 @@
                 if (queue instanceof IdeEventQueue) {
                   if (!((IdeEventQueue)queue).wasRootRecentlyClicked(oppositeComponent)) {
                     Component root = SwingUtilities.getRoot(myTextField);
-                    if (root != null) {
+                    if (root != null && root.isShowing()) {
                       root.requestFocus();
                       myTextField.requestFocus();
                       return;
