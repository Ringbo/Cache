diff --git a/src/com/sittinglittleduck/DirBuster/gui/JTableTree/DynamicTreeTableModel.java b/src/com/sittinglittleduck/DirBuster/gui/JTableTree/DynamicTreeTableModel.java
index 253d2c0..1b292bf 100644
--- a/src/com/sittinglittleduck/DirBuster/gui/JTableTree/DynamicTreeTableModel.java
+++ b/src/com/sittinglittleduck/DirBuster/gui/JTableTree/DynamicTreeTableModel.java
@@ -156,10 +156,9 @@
      */
     public Object getValueAt(Object node, int column) {
 	try {
-	    Method method = node.getClass().getMethod(methodNames[column],
-						      null);
+	    Method method = node.getClass().getMethod(methodNames[column]);
 	    if (method != null) {
-		return method.invoke(node, null);
+		return method.invoke(node);
 	    }
 	}
 	catch  (Throwable th) {}
