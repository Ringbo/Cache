diff --git a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/actions/handlers/XAddToWatchesFromEditorActionHandler.java b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/actions/handlers/XAddToWatchesFromEditorActionHandler.java
index 1741290..868fa87 100644
--- a/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/actions/handlers/XAddToWatchesFromEditorActionHandler.java
+++ b/platform/xdebugger-impl/src/com/intellij/xdebugger/impl/actions/handlers/XAddToWatchesFromEditorActionHandler.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2011 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -35,7 +35,7 @@
   protected boolean isEnabled(@NotNull XDebugSession session, DataContext dataContext) {
     Promise<String> textPromise = getTextToEvaluate(dataContext, session);
     // in the case of async expression evaluation just enable the action
-    if (textPromise.getState() != Promise.State.PENDING) {
+    if (textPromise.getState() == Promise.State.PENDING) {
       return true;
     }
     // or disable on rejected
