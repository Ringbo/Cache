diff --git a/platform/util/src/com/intellij/execution/process/BaseOSProcessHandler.java b/platform/util/src/com/intellij/execution/process/BaseOSProcessHandler.java
index f9ca8c4..322e9cc 100644
--- a/platform/util/src/com/intellij/execution/process/BaseOSProcessHandler.java
+++ b/platform/util/src/com/intellij/execution/process/BaseOSProcessHandler.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2012 JetBrains s.r.o.
+ * Copyright 2000-2013 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -159,7 +159,7 @@
       myProcess.getOutputStream().close();
     }
     catch (IOException e) {
-      LOG.error(e);
+      LOG.warn(e);
     }
   }
 
