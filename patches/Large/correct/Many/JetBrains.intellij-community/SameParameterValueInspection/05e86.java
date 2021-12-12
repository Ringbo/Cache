diff --git a/java/java-impl/src/com/intellij/codeInspection/sameParameterValue/SameParameterValueInspection.java b/java/java-impl/src/com/intellij/codeInspection/sameParameterValue/SameParameterValueInspection.java
index a6953f0..1d5f2e5 100644
--- a/java/java-impl/src/com/intellij/codeInspection/sameParameterValue/SameParameterValueInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/sameParameterValue/SameParameterValueInspection.java
@@ -1,18 +1,4 @@
-/*
- * Copyright 2000-2014 JetBrains s.r.o.
- *
- * Licensed under the Apache License, Version 2.0 (the "License");
- * you may not use this file except in compliance with the License.
- * You may obtain a copy of the License at
- *
- * http://www.apache.org/licenses/LICENSE-2.0
- *
- * Unless required by applicable law or agreed to in writing, software
- * distributed under the License is distributed on an "AS IS" BASIS,
- * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
- * See the License for the specific language governing permissions and
- * limitations under the License.
- */
+// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package com.intellij.codeInspection.sameParameterValue;
 
 import com.intellij.codeInspection.InspectionsBundle;
@@ -70,7 +56,7 @@
   }
 
 
-  protected LocalQuickFix createFix(String paramName, String value) {
+  protected LocalQuickFix createFix(String paramName, Object value) {
     return new InlineParameterValueFix(paramName, value);
   }
 
