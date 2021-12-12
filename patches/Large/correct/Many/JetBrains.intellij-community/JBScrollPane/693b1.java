diff --git a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
index 13a7134..4ec9610 100644
--- a/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
+++ b/platform/platform-api/src/com/intellij/ui/components/JBScrollPane.java
@@ -719,7 +719,7 @@
           myPainter.paint(g, x, y, width, height, value);
           return;
         }
-        catch (Exception exception) {
+        catch (Throwable exception) {
           // do not try to use myPainter again on other systems
           if (!SystemInfo.isWindows) myPainter = null;
         }
