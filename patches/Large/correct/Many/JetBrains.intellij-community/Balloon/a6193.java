diff --git a/platform-api/src/com/intellij/openapi/ui/popup/Balloon.java b/platform-api/src/com/intellij/openapi/ui/popup/Balloon.java
index 294117c..4b30764 100644
--- a/platform-api/src/com/intellij/openapi/ui/popup/Balloon.java
+++ b/platform-api/src/com/intellij/openapi/ui/popup/Balloon.java
@@ -8,7 +8,7 @@
   void show(RelativePoint target, Position prefferedPosition);
 
   enum Position {
-    below, under, atLeft, atRight
+    below, above, atLeft, atRight
   }
 
 }
\ No newline at end of file
