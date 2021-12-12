diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/artifacts/ArtifactEditorImpl.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/artifacts/ArtifactEditorImpl.java
index 15a9cee..69b4908 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/artifacts/ArtifactEditorImpl.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/artifacts/ArtifactEditorImpl.java
@@ -235,7 +235,7 @@
         label.setBorder(HintUtil.createHintBorder());
         label.setBackground(HintUtil.INFORMATION_COLOR);
         label.setOpaque(true);
-        HintManager.getInstance().showHint(label, RelativePoint.getSouthEastOf(link), HintManager.HIDE_BY_ANY_KEY | HintManager.HIDE_BY_TEXT_CHANGE, -1);
+        HintManager.getInstance().showHint(label, RelativePoint.getSouthWestOf(link), HintManager.HIDE_BY_ANY_KEY | HintManager.HIDE_BY_TEXT_CHANGE, -1);
       }
     });
     labelPanel.add(link);
