diff --git a/osmdroid-android/src/org/osmdroid/views/overlay/ItemizedOverlay.java b/osmdroid-android/src/org/osmdroid/views/overlay/ItemizedOverlay.java
index 404b005..a97fb31 100644
--- a/osmdroid-android/src/org/osmdroid/views/overlay/ItemizedOverlay.java
+++ b/osmdroid-android/src/org/osmdroid/views/overlay/ItemizedOverlay.java
@@ -274,7 +274,7 @@
 			mRect.offset(0, 0);
 			break;
 		case LOWER_LEFT_CORNER:
-			mRect.offset(0, markerHeight); /// TODO test - should this be -markerHeight ???
+			mRect.offset(0, -markerHeight);
 			break;
 		}
 		marker.setBounds(mRect);
