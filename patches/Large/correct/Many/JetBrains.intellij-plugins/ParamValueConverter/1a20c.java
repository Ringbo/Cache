diff --git a/struts2/dom-api/src/com/intellij/struts2/dom/params/ParamValueConverter.java b/struts2/dom-api/src/com/intellij/struts2/dom/params/ParamValueConverter.java
index ccb8c42..de49735 100644
--- a/struts2/dom-api/src/com/intellij/struts2/dom/params/ParamValueConverter.java
+++ b/struts2/dom-api/src/com/intellij/struts2/dom/params/ParamValueConverter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013 The authors
+ * Copyright 2017 The authors
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
@@ -40,7 +40,7 @@
 
     // skip values containing expressions
     final String text = domElement.getRawText();
-    if (text.contains("${")) {
+    if (text == null || text.contains("${")) {
       return null;
     }
 
