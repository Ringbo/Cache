diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnHistoryProvider.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnHistoryProvider.java
index 8edcdaa..599a42e 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnHistoryProvider.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/history/SvnHistoryProvider.java
@@ -1,4 +1,4 @@
-// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
+// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package org.jetbrains.idea.svn.history;
 
 import com.intellij.openapi.actionSystem.ActionManager;
@@ -569,7 +569,7 @@
       String author = logEntry.getAuthor();
       String message = logEntry.getMessage();
       Revision rev = Revision.of(logEntry.getRevision());
-      Url url = append(myRepositoryRoot, myLastPath, true);
+      Url url = append(myRepositoryRoot, myLastPath, false);
 
       return new SvnFileRevision(myVcs, myPegRevision, rev, url, author, date, message, copyPath);
     }
