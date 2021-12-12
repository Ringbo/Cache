diff --git a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
index 93446c0..c36dcd1 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInsight/daemon/impl/analysis/HighlightMethodUtil.java
@@ -1300,7 +1300,7 @@
             continue;
           }
         }
-        if (currentMethod.getTypeParameters().length > 0 && JavaGenericsUtil.isRawToGeneric(currentType, otherSuperReturnType)) continue;
+        if (otherSuperMethod.getTypeParameters().length > 0 && JavaGenericsUtil.isRawToGeneric(currentType, otherSuperReturnType)) continue;
       }
       return createIncompatibleReturnTypeMessage(otherSuperMethod, currentMethod, currentType, otherSuperReturnType,  
                                                  JavaErrorMessages.message("unrelated.overriding.methods.return.types"), TextRange.EMPTY_RANGE);
