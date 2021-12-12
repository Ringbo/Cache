diff --git a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/part/AssociationPart.java b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/part/AssociationPart.java
index c00e563..74ae431 100644
--- a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/part/AssociationPart.java
+++ b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/part/AssociationPart.java
@@ -161,7 +161,7 @@
             srcDec.setFill(true);
             srcDec.setBackgroundColor(getParent().getViewer().getControl().getBackground());
             srcDec.setScale(10, 6);
-            conn.setSourceDecoration(srcDec);
+            conn.setTargetDecoration(srcDec);
         }
         if (association.getObject().getConstraintType() == DBSEntityConstraintType.FOREIGN_KEY) {
             final CircleDecoration targetDecor = new CircleDecoration();
