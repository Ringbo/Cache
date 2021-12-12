diff --git a/engine/src/main/java/org/terasology/rendering/nui/editor/utils/NUIEditorNodeUtils.java b/engine/src/main/java/org/terasology/rendering/nui/editor/utils/NUIEditorNodeUtils.java
index bc7d9a7..cc21e9f 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/editor/utils/NUIEditorNodeUtils.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/editor/utils/NUIEditorNodeUtils.java
@@ -131,7 +131,7 @@
                     .getType();
             } else {
                 if (List.class.isAssignableFrom(currentClass) &&
-                    n.getValue().getKey() != null &&
+                    n.getValue().getKey() == null &&
                     "contents".equals(n.getParent().getValue().getKey())) {
                     // Transition from a "contents" list to a UIWidget.
                     currentClass = UIWidget.class;
