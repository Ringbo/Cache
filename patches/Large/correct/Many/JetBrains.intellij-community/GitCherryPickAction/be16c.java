diff --git a/plugins/git4idea/src/git4idea/cherrypick/GitCherryPickAction.java b/plugins/git4idea/src/git4idea/cherrypick/GitCherryPickAction.java
index 0340e95..9a425cb 100644
--- a/plugins/git4idea/src/git4idea/cherrypick/GitCherryPickAction.java
+++ b/plugins/git4idea/src/git4idea/cherrypick/GitCherryPickAction.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2012 JetBrains s.r.o.
+ * Copyright 2000-2014 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -143,7 +143,7 @@
       return;
     }
 
-    e.getPresentation().setEnabled(enabled(project, log, details));
+    e.getPresentation().setEnabledAndVisible(enabled(project, log, details));
     e.getPresentation().setText(isAutoCommit(project) ? NAME : NAME + "...");
   }
 
