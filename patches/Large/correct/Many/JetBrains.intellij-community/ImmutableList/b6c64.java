diff --git a/platform/util/src/com/intellij/util/containers/ImmutableList.java b/platform/util/src/com/intellij/util/containers/ImmutableList.java
index 88aac50..16ee419 100644
--- a/platform/util/src/com/intellij/util/containers/ImmutableList.java
+++ b/platform/util/src/com/intellij/util/containers/ImmutableList.java
@@ -1,18 +1,4 @@
-/*
- * Copyright 2000-2015 JetBrains s.r.o.
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
 package com.intellij.util.containers;
 
 import org.jetbrains.annotations.NotNull;
@@ -106,7 +92,7 @@
 
   @NotNull
   @Override
-  public List<E> subList(int fromIndex, int toIndex) {
+  public ImmutableList<E> subList(int fromIndex, int toIndex) {
     return new SubList<E>(this, fromIndex, toIndex);
   }
 
