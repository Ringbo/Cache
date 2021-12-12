diff --git a/source/com/intellij/util/xml/impl/DomManagerImpl.java b/source/com/intellij/util/xml/impl/DomManagerImpl.java
index 5ee56e8..cad844c 100644
--- a/source/com/intellij/util/xml/impl/DomManagerImpl.java
+++ b/source/com/intellij/util/xml/impl/DomManagerImpl.java
@@ -169,7 +169,7 @@
     if (aClass != null) {
       return aClass;
     }
-    for (final Class aClass1 : aClass.getInterfaces()) {
+    for (final Class aClass1 : concreteInterface.getInterfaces()) {
       aClass = findImplementationClassDFS(aClass1);
       if (aClass != null) {
         return aClass;
