diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
index 8ed5b78..3c295b8c 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/impl/VcsLogManager.java
@@ -70,7 +70,7 @@
     Consumer<DataPack> dataPackUpdateHandler = new Consumer<DataPack>() {
       @Override
       public void consume(final DataPack dataPack) {
-        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
+        UIUtil.invokeLaterIfNeeded(new Runnable() {
           @Override
           public void run() {
             if (!Disposer.isDisposed(myUi)) {
