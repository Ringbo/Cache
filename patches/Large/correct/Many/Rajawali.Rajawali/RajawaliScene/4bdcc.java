diff --git a/rajawali/src/main/java/rajawali/scene/RajawaliScene.java b/rajawali/src/main/java/rajawali/scene/RajawaliScene.java
index bd87bcd..5fda5aa 100644
--- a/rajawali/src/main/java/rajawali/scene/RajawaliScene.java
+++ b/rajawali/src/main/java/rajawali/scene/RajawaliScene.java
@@ -1224,7 +1224,7 @@
 				internalClearChildren();
 			} else {
 				for (i = 0; i < j; ++i) {
-					internalAddChild((Object3D) tasks[i], AFrameTask.UNUSED_INDEX);
+					internalRemoveChild((Object3D) tasks[i], AFrameTask.UNUSED_INDEX);
 				}
 			}
 			break;
@@ -1233,7 +1233,7 @@
 				internalClearPlugins();
 			} else {
 				for (i = 0; i < j; ++i) {
-					internalAddPlugin((IRendererPlugin) tasks[i], AFrameTask.UNUSED_INDEX);
+					internalRemovePlugin((IRendererPlugin) tasks[i], AFrameTask.UNUSED_INDEX);
 				}
 			}
 			break;
