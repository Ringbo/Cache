diff --git a/plugins/spellchecker/src/com/intellij/spellchecker/inspections/PlainTextSplitter.java b/plugins/spellchecker/src/com/intellij/spellchecker/inspections/PlainTextSplitter.java
index 4d81133..55541d9 100644
--- a/plugins/spellchecker/src/com/intellij/spellchecker/inspections/PlainTextSplitter.java
+++ b/plugins/spellchecker/src/com/intellij/spellchecker/inspections/PlainTextSplitter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2010 JetBrains s.r.o.
+ * Copyright 2000-2013 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -95,7 +95,7 @@
         toCheck = excludeByPattern(text, wRange, MAIL, 0);
       }
       else
-      if (text.contains("://")) {
+      if (word.contains("://")) {
         toCheck = excludeByPattern(text, wRange, URL, 0);
       }
       else {
