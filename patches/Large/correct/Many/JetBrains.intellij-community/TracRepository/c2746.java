diff --git a/plugins/tasks/tasks-core/src/com/intellij/tasks/trac/TracRepository.java b/plugins/tasks/tasks-core/src/com/intellij/tasks/trac/TracRepository.java
index a9d034b..ffcaa23 100644
--- a/plugins/tasks/tasks-core/src/com/intellij/tasks/trac/TracRepository.java
+++ b/plugins/tasks/tasks-core/src/com/intellij/tasks/trac/TracRepository.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2011 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -206,7 +206,7 @@
   }
 
   private static Date getDate(Object o) {
-    return o instanceof Date ? (Date)o : new Date((Integer)o * 1000l);
+    return o instanceof Date ? (Date)o : new Date((Integer)o * 1000L);
   }
 
   @Nullable
