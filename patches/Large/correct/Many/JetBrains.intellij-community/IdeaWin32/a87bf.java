diff --git a/platform/util/src/com/intellij/openapi/util/io/win32/IdeaWin32.java b/platform/util/src/com/intellij/openapi/util/io/win32/IdeaWin32.java
index ce0ec3d..3484d06 100644
--- a/platform/util/src/com/intellij/openapi/util/io/win32/IdeaWin32.java
+++ b/platform/util/src/com/intellij/openapi/util/io/win32/IdeaWin32.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2013 JetBrains s.r.o.
+ * Copyright 2000-2014 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -71,7 +71,7 @@
     path = path.replace('/', '\\');
     if (DEBUG_ENABLED) {
       long t = System.nanoTime();
-      final FileInfo result = getInfo0(path);
+      FileInfo result = getInfo0(path);
       t = (System.nanoTime() - t) / 1000;
       LOG.debug("getInfo(" + path + "): " + t + " mks");
       return result;
@@ -86,7 +86,7 @@
     path = path.replace('/', '\\');
     if (DEBUG_ENABLED) {
       long t = System.nanoTime();
-      final String result = resolveSymLink0(path);
+      String result = resolveSymLink0(path);
       t = (System.nanoTime() - t) / 1000;
       LOG.debug("resolveSymLink(" + path + "): " + t + " mks");
       return result;
@@ -103,7 +103,7 @@
       long t = System.nanoTime();
       FileInfo[] children = listChildren0(path);
       t = (System.nanoTime() - t) / 1000;
-      LOG.debug("list(" + path + "): " + children.length + " children, " + t + " mks");
+      LOG.debug("list(" + path + "): " + (children == null ? -1 : children.length) + " children, " + t + " mks");
       return children;
     }
     else {
