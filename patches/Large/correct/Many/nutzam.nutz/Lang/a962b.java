diff --git a/src/org/nutz/lang/Lang.java b/src/org/nutz/lang/Lang.java
index 87504aa..08ca563 100644
--- a/src/org/nutz/lang/Lang.java
+++ b/src/org/nutz/lang/Lang.java
@@ -2620,7 +2620,7 @@
             String name = field.getName();
             if (at != null && !at.matcher(name).find())
                 continue;
-            if (lock != null && lo.matcher(name).find())
+            if (lo != null && lo.matcher(name).find())
                 continue;
             if (ignoreStatic && Modifier.isStatic(field.getModifiers()))
                 continue;
