diff --git a/src/org/nutz/castor/Castors.java b/src/org/nutz/castor/Castors.java
index 8dec756..2f72cef 100644
--- a/src/org/nutz/castor/Castors.java
+++ b/src/org/nutz/castor/Castors.java
@@ -156,7 +156,7 @@
         this.map = new HashMap<Integer, Castor<?,?>>();
         ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
         if (Lang.isAndroid) {
-            classes.addAll(classes);
+            classes.addAll(defaultCastorList);
         } else {
             for (Iterator<Class<?>> it = paths.iterator(); it.hasNext();) {
                 Class<?> baseClass = it.next();
