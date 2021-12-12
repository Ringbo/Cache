diff --git a/source/com/intellij/openapi/roots/ui/configuration/ContentEntriesEditor.java b/source/com/intellij/openapi/roots/ui/configuration/ContentEntriesEditor.java
index 39e5998..1ac429e 100644
--- a/source/com/intellij/openapi/roots/ui/configuration/ContentEntriesEditor.java
+++ b/source/com/intellij/openapi/roots/ui/configuration/ContentEntriesEditor.java
@@ -218,21 +218,21 @@
 
     outputPathsPanel.add(new JLabel("Output path:"),
                          new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE,
-                                                new Insets(6, 0, 0, 6), 0, 0));
+                                                new Insets(6, 0, 0, 4), 0, 0));
     outputPathsPanel.add(myOutputPathPanel,
                          new GridBagConstraints(1, GridBagConstraints.RELATIVE, 2, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
-                                                new Insets(6, 0, 0, 0), 0, 0));
+                                                new Insets(6, 4, 0, 0), 0, 0));
 
     outputPathsPanel.add(new JLabel("Test output path:"),
                          new GridBagConstraints(0, GridBagConstraints.RELATIVE, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE,
-                                                new Insets(6, 0, 0, 6), 0, 0));
+                                                new Insets(6, 0, 0, 4), 0, 0));
     outputPathsPanel.add(myTestsOutputPathPanel,
                          new GridBagConstraints(1, GridBagConstraints.RELATIVE, 2, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL,
-                                                new Insets(6, 0, 0, 0), 0, 0));
+                                                new Insets(6, 4, 0, 0), 0, 0));
 
     outputPathsPanel.add(myCbExcludeOutput,
                          new GridBagConstraints(1, GridBagConstraints.RELATIVE, 2, 1, 1.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE,
-                                                new Insets(6, 0, 0, 6), 0, 0));
+                                                new Insets(6, 0, 0, 0), 0, 0));
 
     // fill with data
     final VirtualFile compilerOutputPath = myModel.getCompilerOutputPath();
