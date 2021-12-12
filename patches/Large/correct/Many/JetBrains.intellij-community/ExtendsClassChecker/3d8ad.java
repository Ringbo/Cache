diff --git a/java/java-impl/src/com/intellij/util/xml/impl/ExtendsClassChecker.java b/java/java-impl/src/com/intellij/util/xml/impl/ExtendsClassChecker.java
index 0f42e62..0a4e4d6 100644
--- a/java/java-impl/src/com/intellij/util/xml/impl/ExtendsClassChecker.java
+++ b/java/java-impl/src/com/intellij/util/xml/impl/ExtendsClassChecker.java
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
 package com.intellij.util.xml.impl;
 
 import com.intellij.openapi.project.Project;
@@ -97,7 +83,7 @@
       else if (!allowNonPublic && !value.hasModifierProperty(PsiModifier.PUBLIC)) {
         list.add(holder.createProblem(element, DomBundle.message("class.is.not.public", value.getQualifiedName())));
       }
-      else if (!PsiUtil.hasDefaultConstructor(value, true)) {
+      else if (!PsiUtil.hasDefaultConstructor(value, true, false)) {
         if (canBeDecorator) {
           boolean hasConstructor = false;
 
