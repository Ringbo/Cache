diff --git a/plugins/IntelliLang/java-support/org/intellij/plugins/intelliLang/util/PsiUtilEx.java b/plugins/IntelliLang/java-support/org/intellij/plugins/intelliLang/util/PsiUtilEx.java
index 8feb277..337151f 100644
--- a/plugins/IntelliLang/java-support/org/intellij/plugins/intelliLang/util/PsiUtilEx.java
+++ b/plugins/IntelliLang/java-support/org/intellij/plugins/intelliLang/util/PsiUtilEx.java
@@ -91,7 +91,7 @@
       final String shortName = ((PsiClassType)type).getClassName();
       if (!Comparing.equal(shortName, CommonClassNames.JAVA_LANG_STRING_SHORT)) return false;
     }
-    return CommonClassNames.JAVA_LANG_STRING.equals(type.getCanonicalText());
+    return CommonClassNames.JAVA_LANG_STRING.equals(type.getCanonicalText(false));
   }
 
   public static boolean isStringOrStringArray(@NotNull PsiType type) {
