diff --git a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
index 1bfab88..2674e1e 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/gotoByName/ChooseByNameBase.java
@@ -768,7 +768,7 @@
   protected void doClose(final boolean ok) {
     if (checkDisposed()) return;
 
-    if (closeForbidden(ok)) return;
+    if (closeForbidden(ok) || getChosenElements().isEmpty()) return;
 
     cancelListUpdater();
     close(ok);
