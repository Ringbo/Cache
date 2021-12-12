diff --git a/src/gwt/src/org/rstudio/core/client/command/ShortcutManager.java b/src/gwt/src/org/rstudio/core/client/command/ShortcutManager.java
index 66f7dac..c18779b 100644
--- a/src/gwt/src/org/rstudio/core/client/command/ShortcutManager.java
+++ b/src/gwt/src/org/rstudio/core/client/command/ShortcutManager.java
@@ -1,7 +1,7 @@
 /*
  * ShortcutManager.java
  *
- * Copyright (C) 2009-17 by RStudio, Inc.
+ * Copyright (C) 2009-18 by RStudio, Inc.
  *
  * Unless you have received this program directly from RStudio pursuant
  * to the terms of a commercial license agreement with RStudio, then
@@ -490,7 +490,7 @@
                   // clear the currently hidden console instead
                   event.stopPropagation();
                   commands_.clearTerminalScrollbackBuffer().execute();
-                  return false;
+                  return true;
                }
                else if (binding.getId() == "closeSourceDoc")
                {
