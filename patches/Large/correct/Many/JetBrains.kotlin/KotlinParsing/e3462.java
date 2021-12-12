diff --git a/compiler/psi/src/org/jetbrains/kotlin/parsing/KotlinParsing.java b/compiler/psi/src/org/jetbrains/kotlin/parsing/KotlinParsing.java
index c06ecaa..1c60cf7 100644
--- a/compiler/psi/src/org/jetbrains/kotlin/parsing/KotlinParsing.java
+++ b/compiler/psi/src/org/jetbrains/kotlin/parsing/KotlinParsing.java
@@ -1472,7 +1472,7 @@
                 errorUntil("Accessor body expected", TokenSet.orSet(ACCESSOR_FIRST_OR_PROPERTY_END, TokenSet.create(LBRACE, LPAR, EQ)));
             }
             else {
-                closeDeclarationWithCommentBinders(getterOrSetter, PROPERTY_ACCESSOR, false);
+                closeDeclarationWithCommentBinders(getterOrSetter, PROPERTY_ACCESSOR, true);
                 return accessorKind;
             }
         }
@@ -1508,7 +1508,7 @@
 
         parseFunctionBody();
 
-        closeDeclarationWithCommentBinders(getterOrSetter, PROPERTY_ACCESSOR, false);
+        closeDeclarationWithCommentBinders(getterOrSetter, PROPERTY_ACCESSOR, true);
 
         return accessorKind;
     }
