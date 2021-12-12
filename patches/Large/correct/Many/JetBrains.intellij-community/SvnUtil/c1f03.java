diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnUtil.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnUtil.java
index 19ed255..9cbe9ba 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnUtil.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/SvnUtil.java
@@ -1,4 +1,4 @@
-// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
+// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package org.jetbrains.idea.svn;
 
 import com.intellij.notification.NotificationType;
@@ -613,7 +613,7 @@
   @NotNull
   public static Url removePathTail(@NotNull Url url) throws SvnBindException {
     // TODO: Fix - remove tail only from path
-    return createUrl(Url.removeTail(url.toDecodedString()));
+    return createUrl(Url.removeTail(url.toDecodedString()), false);
   }
 
   @NotNull
