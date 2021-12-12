diff --git a/bbb-screenshare/jws/webstart/src/main/java/org/bigbluebutton/screenshare/client/frame/WindowlessFrame.java b/bbb-screenshare/jws/webstart/src/main/java/org/bigbluebutton/screenshare/client/frame/WindowlessFrame.java
index 79efe20..7bae390 100755
--- a/bbb-screenshare/jws/webstart/src/main/java/org/bigbluebutton/screenshare/client/frame/WindowlessFrame.java
+++ b/bbb-screenshare/jws/webstart/src/main/java/org/bigbluebutton/screenshare/client/frame/WindowlessFrame.java
@@ -747,7 +747,7 @@
       newWidth = makeLengthEven(width);  
 //      System.out.println("Capture width is not even [" + width + "]. Changing to [" + newWidth + "]");
     }
-    mOverallSize.width = newWidth + BORDER_THICKNESS;
+    mOverallSize.width = newWidth - BORDER_THICKNESS;
   }
 
   public final void setHeight(int height) {
@@ -757,7 +757,7 @@
       newHeight = makeLengthEven(height);
 //      System.out.println("Capture height is not even [" + height + "]. Changing to [" + newHeight + "]");
     }
-    mOverallSize.height = newHeight + BORDER_THICKNESS;
+    mOverallSize.height = newHeight - BORDER_THICKNESS;
   }
 
   public final void setLocation(int x, int y) {
