diff --git a/platform/platform-impl/src/com/intellij/ide/ui/UIThemeProvider.java b/platform/platform-impl/src/com/intellij/ide/ui/UIThemeProvider.java
index bd21799..bca7eda 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/UIThemeProvider.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/UIThemeProvider.java
@@ -1,4 +1,4 @@
-// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
+// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package com.intellij.ide.ui;
 
 import com.intellij.openapi.diagnostic.Logger;
@@ -31,7 +31,8 @@
       return UITheme.loadFromJson(loader.getResourceAsStream(path), id, loader);
     }
     catch (IOException e) {
-      Logger.getInstance(getClass()).warn(e);
+      Logger.getInstance(getClass()).warn("error loading UITheme '" + path + "', " +
+                                          "pluginId=" + myDescriptor.getPluginId().getIdString(), e);
       return null;
     }
   }
