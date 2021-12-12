diff --git a/translator/src/org/jetbrains/k2js/translate/context/StandardClasses.java b/translator/src/org/jetbrains/k2js/translate/context/StandardClasses.java
index 1a1c843..e343bd8 100644
--- a/translator/src/org/jetbrains/k2js/translate/context/StandardClasses.java
+++ b/translator/src/org/jetbrains/k2js/translate/context/StandardClasses.java
@@ -79,7 +79,7 @@
         standardClasses.declareStandardTopLevelObject(arrayListFQName, "ArrayList");
         standardClasses.declareStandardInnerDeclaration(arrayListFQName, "<init>", "ArrayList");
         declareMethods(standardClasses, arrayListFQName, "size", "add", "get",
-                "isEmpty", "set", "remove", "addAll", "contains", "clear");
+                "isEmpty", "set", "remove", "addAll", "contains", "clear", "iterator");
     }
 
     private static void declareIterator(@NotNull StandardClasses standardClasses,
