diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/DBPConnectionType.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/DBPConnectionType.java
index c4143dd..f84517a 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/DBPConnectionType.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/DBPConnectionType.java
@@ -19,7 +19,7 @@
 
     private String id;
     private String name;
-    private Color color;
+    private RGB color;
     private String description;
     private boolean autocommit;
     private boolean confirmExecute;
@@ -27,7 +27,7 @@
 
     public DBPConnectionType(DBPConnectionType source)
     {
-        this(source.id, source.name, source.color.getRGB(), source.description, source.autocommit, source.confirmExecute, source.predefined);
+        this(source.id, source.name, source.color, source.description, source.autocommit, source.confirmExecute, source.predefined);
     }
 
     public DBPConnectionType(String id, String name, RGB rgb, String description, boolean autocommit, boolean confirmExecute)
@@ -39,7 +39,7 @@
     {
         this.id = id;
         this.name = name;
-        this.color = DBeaverUI.getSharedTextColors().getColor(rgb);
+        this.color = rgb;
         this.description = description;
         this.autocommit = autocommit;
         this.confirmExecute = confirmExecute;
@@ -68,12 +68,12 @@
 
     public Color getColor()
     {
-        return color;
+        return DBeaverUI.getSharedTextColors().getColor(color);
     }
 
     public void setColor(Color color)
     {
-        this.color = color;
+        this.color = color.getRGB();
     }
 
     public String getDescription()
