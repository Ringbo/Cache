diff --git a/plugins/devkit/src/dom/MouseShortcut.java b/plugins/devkit/src/dom/MouseShortcut.java
index 69e0d8f..d99b796 100644
--- a/plugins/devkit/src/dom/MouseShortcut.java
+++ b/plugins/devkit/src/dom/MouseShortcut.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2009 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -53,7 +53,7 @@
          * @return the value of the should current shortcut be removed or not.
          */
         @NotNull
-        GenericAttributeValue<String> getRemove();
+        GenericAttributeValue<Boolean> getRemove();
 
         /**
          * Returns the value of the should all previous shortcuts be removed by that one or not.
@@ -61,5 +61,5 @@
          * @return the value of the should all previous shortcuts be removed by that one or not.
          */
         @NotNull
-        GenericAttributeValue<String> getReplaceAll();
+        GenericAttributeValue<Boolean> getReplaceAll();
 }
