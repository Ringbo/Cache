diff --git a/plugins/IdeaTestAssistant/src/com/intellij/testAssistant/TestDataReferenceCollector.java b/plugins/IdeaTestAssistant/src/com/intellij/testAssistant/TestDataReferenceCollector.java
index 3ee1864..743134f 100644
--- a/plugins/IdeaTestAssistant/src/com/intellij/testAssistant/TestDataReferenceCollector.java
+++ b/plugins/IdeaTestAssistant/src/com/intellij/testAssistant/TestDataReferenceCollector.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2010 JetBrains s.r.o.
+ * Copyright 2000-2013 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -38,7 +38,7 @@
   private boolean myFoundTestDataParameters = false;
 
   public TestDataReferenceCollector(@Nullable String testDataPath, String testName) {
-    if (StringUtil.isNotEmpty(testDataPath) && StringUtil.endsWithChar(testDataPath, File.separatorChar)) {
+    if (StringUtil.isNotEmpty(testDataPath) && !StringUtil.endsWithChar(testDataPath, File.separatorChar)) {
       testDataPath += File.separatorChar;
     }
     myTestDataPath = testDataPath;
