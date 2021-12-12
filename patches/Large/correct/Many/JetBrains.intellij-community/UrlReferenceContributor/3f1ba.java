diff --git a/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/UrlReferenceContributor.java b/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/UrlReferenceContributor.java
index df63cc7..c46e016 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/UrlReferenceContributor.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/source/resolve/reference/UrlReferenceContributor.java
@@ -19,6 +19,6 @@
       public boolean accepts(@Nullable Object o, ProcessingContext context) {
         return o instanceof PsiLiteralValue && ((PsiLiteralValue)o).getValue() instanceof String;
       }
-    }, new ArbitraryPlaceUrlReferenceProvider());
+    }, new ArbitraryPlaceUrlReferenceProvider(), PsiReferenceRegistrar.LOWER_PRIORITY);
   }
 }
