diff --git a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
index e35c4c1f..d229596 100644
--- a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
+++ b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
@@ -248,9 +248,9 @@
     // Create Welcome panel
     gBC = new GridBagConstraints(0, 0, 2, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(10, 5, 0, 5), 0, 0);
     myWelcomePanel.add(topPanel, gBC);
-    gBC = new GridBagConstraints(0, 1, 1, 1, 1.4, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(15, 15, 15, 0), 0, 0);
+    gBC = new GridBagConstraints(0, 1, 1, 1, 0.7, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(15, 15, 15, 0), 0, 0);
     myWelcomePanel.add(myMainScrollPane, gBC);
-    gBC = new GridBagConstraints(1, 1, 1, 1, 0.6, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(15, 15, 15, 15), 0, 0);
+    gBC = new GridBagConstraints(1, 1, 1, 1, 0.3, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(15, 15, 15, 15), 0, 0);
     myWelcomePanel.add(myPluginsScrollPane, gBC);
   }
 
