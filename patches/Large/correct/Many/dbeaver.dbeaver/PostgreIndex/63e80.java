diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreIndex.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreIndex.java
index fb1eb40..a3efe77 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreIndex.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreIndex.java
@@ -85,7 +85,7 @@
     @Property(viewable = true, order = 5)
     public boolean isUnique()
     {
-        return !isUnique;
+        return isUnique;
     }
 
     @Property(viewable = false, order = 20)
