diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/edit/PostgreIndexManager.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/edit/PostgreIndexManager.java
index e7c2ced..6159c52 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/edit/PostgreIndexManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/edit/PostgreIndexManager.java
@@ -91,8 +91,7 @@
     @Override
     protected String getDropIndexPattern(PostgreIndex index)
     {
-        return /*"ALTER TABLE " + PATTERN_ITEM_TABLE + */
-            "DROP INDEX " + PATTERN_ITEM_INDEX_SHORT; //$NON-NLS-1$ //$NON-NLS-2$
+        return "DROP INDEX " + PATTERN_ITEM_INDEX; //$NON-NLS-1$
     }
 
 }
