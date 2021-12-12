diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/MainFrameModel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/MainFrameModel.java
index 1bed022..e8f0ec0 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/MainFrameModel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/MainFrameModel.java
@@ -215,7 +215,7 @@
                 // starts line counting at 1
                 linesToPositionTemp.add(0);
 
-                final StringBuilder sb = new StringBuilder();
+                final StringBuilder sb = new StringBuilder(1024);
                 // insert the contents of the file to the text area
                 for (final String element : sourceLines) {
                     linesToPositionTemp.add(sb.length());
