diff --git a/quasar-core/src/test/java/co/paralleluniverse/common/reflection/ClassLoaderUtilTKB.java b/quasar-core/src/test/java/co/paralleluniverse/common/reflection/ClassLoaderUtilTKB.java
index 2a558b0..5a8bb9f 100644
--- a/quasar-core/src/test/java/co/paralleluniverse/common/reflection/ClassLoaderUtilTKB.java
+++ b/quasar-core/src/test/java/co/paralleluniverse/common/reflection/ClassLoaderUtilTKB.java
@@ -26,12 +26,12 @@
         File f = new File("build/libs/quasar-core-0.4.0-SNAPSHOT.jar");
         System.out.println(f.exists());
         URLClassLoader cl = new URLClassLoader(new URL[]{f.toURI().toURL()});
-        ClassLoaderUtil.accept(cl, new ClassLoaderUtil.Visitor() {
+        ClassLoaderUtil.accept(cl, false, new ClassLoaderUtil.Visitor() {
 
             @Override
             public void visit(String resource, URL url, ClassLoader cl) {
                 System.out.println("- " + resource + " " + url);
             }
-        },false);
+        });
     }
 }
