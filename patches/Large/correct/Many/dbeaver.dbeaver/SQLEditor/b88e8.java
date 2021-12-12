diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index 49c6d4c..eb4d649 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -1057,7 +1057,7 @@
                     }
                     // Make a small pause to let all UI connection listeners to finish
                     try {
-                        Thread.sleep(100);
+                        Thread.sleep(500);
                     } catch (InterruptedException e) {
                         // it's ok
                     }
