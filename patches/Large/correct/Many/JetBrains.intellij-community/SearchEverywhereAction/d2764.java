diff --git a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
index 59f2b52..6bc15e5 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
@@ -2039,7 +2039,7 @@
                   size.height = Math.max(JBUI.scale(30), listSize.height);
                 }
 
-                if (size.width < myBalloon.getSize().width) {
+                if (myBalloon != null && size.width < myBalloon.getSize().width) {
                   size.width = myBalloon.getSize().width;
                 }
 
