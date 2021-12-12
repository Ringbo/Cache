diff --git a/modules/core/src/main/java/org/apache/ignite/internal/util/IgniteUtils.java b/modules/core/src/main/java/org/apache/ignite/internal/util/IgniteUtils.java
index 42e96fb..2defefa 100755
--- a/modules/core/src/main/java/org/apache/ignite/internal/util/IgniteUtils.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/util/IgniteUtils.java
@@ -8143,10 +8143,10 @@
         assert mtdName != null;
 
         try {
-            for (Class<?> c = cls != null ? cls : obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
+            for (cls = cls != null ? cls : obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                 Method mtd = null;
 
-                for (Method declaredMtd : c.getDeclaredMethods()) {
+                for (Method declaredMtd : cls.getDeclaredMethods()) {
                     if (declaredMtd.getName().equals(mtdName)) {
                         if (mtd == null)
                             mtd = declaredMtd;
@@ -8202,11 +8202,11 @@
         assert mtdName != null;
 
         try {
-            for (Class<?> c = cls != null ? cls : obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
+            for (cls = cls != null ? cls : obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                 Method mtd;
 
                 try {
-                    mtd = c.getDeclaredMethod(mtdName, paramTypes);
+                    mtd = cls.getDeclaredMethod(mtdName, paramTypes);
                 }
                 catch (NoSuchMethodException ignored) {
                     continue;
