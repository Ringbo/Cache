diff --git a/platform/util/src/com/intellij/util/Timed.java b/platform/util/src/com/intellij/util/Timed.java
index 092fe3b..2264e97 100644
--- a/platform/util/src/com/intellij/util/Timed.java
+++ b/platform/util/src/com/intellij/util/Timed.java
@@ -93,7 +93,7 @@
       if (timed == null) continue;
       synchronized (timed) {
         if (timed.myLastCheckedAccessCount == timed.myAccessCount && !timed.isLocked()) {
-          Disposer.dispose(timed);
+          timed.dispose();
         }
         else {
           timed.myLastCheckedAccessCount = timed.myAccessCount;
