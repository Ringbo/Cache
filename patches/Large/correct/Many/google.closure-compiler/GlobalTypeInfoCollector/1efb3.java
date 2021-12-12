diff --git a/src/com/google/javascript/jscomp/GlobalTypeInfoCollector.java b/src/com/google/javascript/jscomp/GlobalTypeInfoCollector.java
index 03dff5c..cead2d4 100644
--- a/src/com/google/javascript/jscomp/GlobalTypeInfoCollector.java
+++ b/src/com/google/javascript/jscomp/GlobalTypeInfoCollector.java
@@ -687,7 +687,9 @@
         }
       }
     } else {
-      PropertyDef propdef = checkNotNull(getPropDefFromClass(superType, pname));
+      PropertyDef propdef = checkNotNull(
+          getPropDefFromClass(superType, pname),
+          "getPropDefFromClass(%s, %s) returned null", superType, pname);
       inheritedPropDefs = ImmutableSet.of(propdef);
     }
     if (superType.isInterface()
