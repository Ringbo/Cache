diff --git a/platform/core-api/src/com/intellij/psi/tree/TokenSet.java b/platform/core-api/src/com/intellij/psi/tree/TokenSet.java
index 499f68b5..65254a8 100644
--- a/platform/core-api/src/com/intellij/psi/tree/TokenSet.java
+++ b/platform/core-api/src/com/intellij/psi/tree/TokenSet.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2013 JetBrains s.r.o.
+ * Copyright 2000-2015 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -169,7 +169,7 @@
     for (int i = 0; i < newSet.myWords.length; i++) {
       final int ai = newSet.myShift - a.myShift + i;
       final int bi = newSet.myShift - b.myShift + i;
-      newSet.myWords[i] = (0 <= ai && ai < a.myWords.length ? a.myWords[ai] : 0l) & (0 <= bi && bi < b.myWords.length ? b.myWords[bi] : 0l);
+      newSet.myWords[i] = (0 <= ai && ai < a.myWords.length ? a.myWords[ai] : 0L) & (0 <= bi && bi < b.myWords.length ? b.myWords[bi] : 0L);
     }
     return newSet;
   }
@@ -187,7 +187,7 @@
     for (int i = 0; i < newSet.myWords.length; i++) {
       final int ai = newSet.myShift - a.myShift + i;
       final int bi = newSet.myShift - b.myShift + i;
-      newSet.myWords[i] = (0 <= ai && ai < a.myWords.length ? a.myWords[ai] : 0l) & ~(0 <= bi && bi < b.myWords.length ? b.myWords[bi] : 0l);
+      newSet.myWords[i] = (0 <= ai && ai < a.myWords.length ? a.myWords[ai] : 0L) & ~(0 <= bi && bi < b.myWords.length ? b.myWords[bi] : 0L);
     }
     return newSet;
   }
