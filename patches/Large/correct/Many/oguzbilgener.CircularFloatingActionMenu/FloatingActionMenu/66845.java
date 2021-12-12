diff --git a/library/src/main/java/com/oguzdev/circularfloatingactionmenu/library/FloatingActionMenu.java b/library/src/main/java/com/oguzdev/circularfloatingactionmenu/library/FloatingActionMenu.java
index 8e87195..3ab28ff 100644
--- a/library/src/main/java/com/oguzdev/circularfloatingactionmenu/library/FloatingActionMenu.java
+++ b/library/src/main/java/com/oguzdev/circularfloatingactionmenu/library/FloatingActionMenu.java
@@ -230,7 +230,7 @@
 
         // Prevent overlapping when it is a full circle
         int divisor;
-        if(Math.abs(endAngle - startAngle) >= 360) {
+        if(Math.abs(endAngle - startAngle) >= 360 || subActionItems.size() <= 1) {
             divisor = subActionItems.size();
         }
         else {
