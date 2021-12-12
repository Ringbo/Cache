diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindManagerImpl.java b/platform/lang-impl/src/com/intellij/find/impl/FindManagerImpl.java
index 4847d13..41eb35d 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindManagerImpl.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2012 JetBrains s.r.o.
+ * Copyright 2000-2013 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -220,7 +220,7 @@
           myFindDialog = null; // avoid strong ref!
         }
       };
-      myFindDialog.setModal(false);
+      myFindDialog.setModal(true);
     }
     else if (myFindDialog.getModel().isReplaceState() != model.isReplaceState()) {
       myFindDialog.setModel(model);
