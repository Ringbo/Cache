diff --git a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/collapsing/DottedFilterEdgesGenerator.java b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/collapsing/DottedFilterEdgesGenerator.java
index d2e862a..cc5f42f 100644
--- a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/collapsing/DottedFilterEdgesGenerator.java
+++ b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/collapsing/DottedFilterEdgesGenerator.java
@@ -171,7 +171,7 @@
             nearlyDown = Math.min(nearlyDown, downNode);
           }
           else {
-            if (downNode > myDownIndex) nearlyDown = Math.min(nearlyDown, myNumbers.getNumber(downNode));
+            if (downNode <= myDownIndex) nearlyDown = Math.min(nearlyDown, myNumbers.getNumber(downNode));
           }
         }
         myNumbers.setNumber(currentNodeIndex, nearlyDown);
