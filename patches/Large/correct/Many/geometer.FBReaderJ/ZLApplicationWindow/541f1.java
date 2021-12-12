diff --git a/src/org/zlibrary/core/application/ZLApplicationWindow.java b/src/org/zlibrary/core/application/ZLApplicationWindow.java
index b414452..a97349d 100644
--- a/src/org/zlibrary/core/application/ZLApplicationWindow.java
+++ b/src/org/zlibrary/core/application/ZLApplicationWindow.java
@@ -47,7 +47,7 @@
 				return;
 			} else {
 				button.press();
-				ButtonGroup group = button.buttonGroup();
+				ButtonGroup group = button.getButtonGroup();
 				Set<ButtonItem> items = group.Items;
 				for (ButtonItem bitem: items) {
 					setToggleButtonState(bitem);
@@ -55,7 +55,7 @@
 			}
 			myToggleButtonLock = false;
 		}
-		application().doAction(button.actionId());
+		application().doAction(button.getActionId());
 	}
 	
 	public abstract void setToggleButtonState(ButtonItem item);
@@ -90,7 +90,7 @@
 				case ZLApplication::Toolbar::Item::BUTTON:
 					{
 						const ZLApplication::Toolbar::ButtonItem &button = (const ZLApplication::Toolbar::ButtonItem&)**it;
-						int id = button.actionId();
+						int id = button.getActionId();
 	        
 						const bool visible = application().isActionVisible(id);
 						const bool enabled = application().isActionEnabled(id);
@@ -103,7 +103,7 @@
 							enableToolbarSpace = true;
 						}
 						if (!enabled && button.isPressed()) {
-							shared_ptr<ZLApplication::Toolbar::ButtonGroup> group = button.buttonGroup();
+							shared_ptr<ZLApplication::Toolbar::ButtonGroup> group = button.getButtonGroup();
 							group->press(0);
 							application().doAction(group->UnselectAllButtonsActionId);
 							myToggleButtonLock = true;
