diff --git a/platform/testFramework/src/com/intellij/mock/Mock.java b/platform/testFramework/src/com/intellij/mock/Mock.java
index 2a67efd..03ba93d 100644
--- a/platform/testFramework/src/com/intellij/mock/Mock.java
+++ b/platform/testFramework/src/com/intellij/mock/Mock.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2016 JetBrains s.r.o.
+ * Copyright 2000-2017 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -104,7 +104,7 @@
 
     @Override
     public boolean isValid() {
-      return false;
+      return true;
     }
 
     @Override
