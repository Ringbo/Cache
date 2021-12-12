diff --git a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/TypeKindHighlightingVisitor.java b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/TypeKindHighlightingVisitor.java
index 4f3a44a..759472b 100644
--- a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/TypeKindHighlightingVisitor.java
+++ b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/highlighter/TypeKindHighlightingVisitor.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2010-2015 JetBrains s.r.o.
+ * Copyright 2010-2016 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -61,7 +61,7 @@
     }
 
     private void highlightAnnotation(@NotNull KtSimpleNameExpression expression) {
-        TextRange toHighlight = KtPsiUtilKt.getCalleeHighlightingRange(expression);
+        TextRange toHighlight = KtPsiUtilKt.getHighlightingRange(expression);
         NameHighlighter.highlightName(holder, toHighlight, KotlinHighlightingColors.ANNOTATION);
     }
 
