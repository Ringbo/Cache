diff --git a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/inputSettings/InputSettingsScreen.java b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/inputSettings/InputSettingsScreen.java
index 4628c05..fe31c1d 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/inputSettings/InputSettingsScreen.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/inputSettings/InputSettingsScreen.java
@@ -195,7 +195,7 @@
         inputBind.bindInput(new InputConfigBinding(config.getInput().getBinds(), uri));
         UIInputBindButton secondaryInputBind = new UIInputBindButton();
         secondaryInputBind.setManager(getManager());
-        inputBind.setDescription(bind.description());
+        secondaryInputBind.setDescription(bind.description());
         secondaryInputBind.bindInput(new InputConfigBinding(config.getInput().getBinds(), uri, 1));
         layout.addWidget(new RowLayout(new UILabel(bind.description()), inputBind, secondaryInputBind).setColumnRatios(0.4f).setHorizontalSpacing(horizontalSpacing));
     }
