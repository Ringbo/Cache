diff --git a/src/com/jfoenix/controls/JFXTreeTableView.java b/src/com/jfoenix/controls/JFXTreeTableView.java
index 70d5683..86e708b 100644
--- a/src/com/jfoenix/controls/JFXTreeTableView.java
+++ b/src/com/jfoenix/controls/JFXTreeTableView.java
@@ -122,7 +122,9 @@
 				break;
 			}
 			// handle group nodes
-			if(((RecursiveTreeObject<?>)parent.getValue()).getGroupedColumn()!=null)
+			if(parent.getValue() !=null
+			&& parent.getValue() instanceof RecursiveTreeObject
+			&& ((RecursiveTreeObject<?>)parent.getValue()).getGroupedColumn()!=null)
 				level--;
 			parent = parent.getParent();
 		}
