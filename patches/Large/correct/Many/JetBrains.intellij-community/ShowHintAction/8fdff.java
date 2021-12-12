diff --git a/EDIDE/src/ru/compscicenter/edide/actions/ShowHintAction.java b/EDIDE/src/ru/compscicenter/edide/actions/ShowHintAction.java
index 7603827..a790985 100644
--- a/EDIDE/src/ru/compscicenter/edide/actions/ShowHintAction.java
+++ b/EDIDE/src/ru/compscicenter/edide/actions/ShowHintAction.java
@@ -70,7 +70,7 @@
                             .setRequestFocus(true)
                             .createPopup();
                         component.setHint(popup);
-                        popup.showInFocusCenter();
+                        popup.showInBestPositionFor(selectedEditor);
                       }
                     }
                   }
