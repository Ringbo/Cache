diff --git a/src/main/java/net/sf/jabref/gui/preftabs/FileTab.java b/src/main/java/net/sf/jabref/gui/preftabs/FileTab.java
index d966c1e..09aaf5f 100644
--- a/src/main/java/net/sf/jabref/gui/preftabs/FileTab.java
+++ b/src/main/java/net/sf/jabref/gui/preftabs/FileTab.java
@@ -139,7 +139,7 @@
         builder.append(lab);
         builder.append(fileDir);
 
-        JButton browse = new JButton();
+        JButton browse = new JButton(Localization.lang("Browse"));
         browse.addActionListener(e ->
                 new FileDialog(this.frame).showDialogAndGetSelectedDirectory()
                         .ifPresent(f -> fileDir.setText(f.toAbsolutePath().toString()))
