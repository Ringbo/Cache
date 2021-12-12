diff --git a/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java b/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
index fcedc1f..8aa24c4 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
@@ -703,7 +703,7 @@
       String packageName = packageElement.getQualifiedName().toString();
       String mappedPackageName = getPrefix(packageElement);
       return Optional.of(
-          String.format(mappingFormat, mappedPackageName, packageName, mappedPackageName));
+          String.format(mappingFormat, typeName, packageName, mappedPackageName));
     }
 
     return Optional.empty();
