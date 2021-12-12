diff --git a/plugins/devkit/src/dom/KeyboardShortcut.java b/plugins/devkit/src/dom/KeyboardShortcut.java
index 853aec5..ecd85b0 100644
--- a/plugins/devkit/src/dom/KeyboardShortcut.java
+++ b/plugins/devkit/src/dom/KeyboardShortcut.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2009 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -69,7 +69,7 @@
          * @return the value of the should current shortcut be removed or not.
          */
         @NotNull
-        GenericAttributeValue<String> getRemove();
+        GenericAttributeValue<Boolean> getRemove();
 
         /**
          * Returns the value of the should all previous shortcuts be removed by that one or not.
@@ -77,5 +77,5 @@
          * @return the value of the should all previous shortcuts be removed by that one or not.
          */
         @NotNull
-        GenericAttributeValue<String> getReplaceAll();
+        GenericAttributeValue<Boolean> getReplaceAll();
 }
