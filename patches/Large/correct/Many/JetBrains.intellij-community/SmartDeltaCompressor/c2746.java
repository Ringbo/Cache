diff --git a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/utils/impl/SmartDeltaCompressor.java b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/utils/impl/SmartDeltaCompressor.java
index e3a6257..772e8dc 100644
--- a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/utils/impl/SmartDeltaCompressor.java
+++ b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/utils/impl/SmartDeltaCompressor.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2014 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -46,7 +46,7 @@
         int sizeOf = sizeOf(deltaList.get(index));
         writeDelta(offset, deltaList.get(index), sizeOf, deltas);
 
-        long mask = 1l << rem;
+        long mask = 1L << rem;
         /**
          * 4 -> 11
          * 3 -> 10
