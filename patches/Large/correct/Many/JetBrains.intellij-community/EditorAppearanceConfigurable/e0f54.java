diff --git a/platform/lang-impl/src/com/intellij/application/options/editor/EditorAppearanceConfigurable.java b/platform/lang-impl/src/com/intellij/application/options/editor/EditorAppearanceConfigurable.java
index 3faa55a..3933e56 100644
--- a/platform/lang-impl/src/com/intellij/application/options/editor/EditorAppearanceConfigurable.java
+++ b/platform/lang-impl/src/com/intellij/application/options/editor/EditorAppearanceConfigurable.java
@@ -1,18 +1,6 @@
-/*
- * Copyright 2000-2017 JetBrains s.r.o.
- *
- * Licensed under the Apache License, Version 2.0 (the "License");
- * you may not use this file except in compliance with the License.
- * You may obtain a copy of the License at
- *
- * http://www.apache.org/licenses/LICENSE-2.0
- *
- * Unless required by applicable law or agreed to in writing, software
- * distributed under the License is distributed on an "AS IS" BASIS,
- * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
- * See the License for the specific language governing permissions and
- * limitations under the License.
- */
+// Copyright 2000-2017 JetBrains s.r.o.
+// Use of this source code is governed by the Apache 2.0 license that can be
+// found in the LICENSE file.
 
 package com.intellij.application.options.editor;
 
@@ -128,7 +116,7 @@
     myCbShowIntentionBulbCheckBox.setSelected(editorSettings.isShowIntentionBulb());
     //myAntialiasingInEditorCheckBox.setSelected(UISettings.getInstance().ANTIALIASING_IN_EDITOR);
     //myUseLCDRendering.setSelected(UISettings.getInstance().USE_LCD_RENDERING_IN_EDITOR);
-    myShowCodeLensInEditorCheckBox.setSelected(UISettings.getInstance().getShowToolWindowsNumbers());
+    myShowCodeLensInEditorCheckBox.setSelected(UISettings.getInstance().getShowEditorToolTip());
 
     updateWhitespaceCheckboxesState();
 
@@ -176,7 +164,7 @@
     //}
 
     if (uiSettings.getShowEditorToolTip() != myShowCodeLensInEditorCheckBox.isSelected()) {
-      uiSettings.setShowToolWindowsNumbers(myShowCodeLensInEditorCheckBox.isSelected());
+      uiSettings.setShowEditorToolTip(myShowCodeLensInEditorCheckBox.isSelected());
       uiSettingsModified = true;
       lafSettingsModified = true;
     }
