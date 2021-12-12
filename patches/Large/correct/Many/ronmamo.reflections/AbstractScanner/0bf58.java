diff --git a/src/main/java/org/reflections/scanners/AbstractScanner.java b/src/main/java/org/reflections/scanners/AbstractScanner.java
index b8983c7..54c309e 100644
--- a/src/main/java/org/reflections/scanners/AbstractScanner.java
+++ b/src/main/java/org/reflections/scanners/AbstractScanner.java
@@ -29,7 +29,7 @@
             try {
                 classObject = configuration.getMetadataAdapter().getOfCreateClassObject(file);
             } catch (Exception e) {
-                throw new ReflectionsException("could not create class object from file " + file.getRelativePath());
+                throw new ReflectionsException("could not create class object from file " + file.getRelativePath(), e);
             }
         }
         scan(classObject);
