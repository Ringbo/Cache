diff --git a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/task/ui/AbstractExternalSystemToolWindowFactory.java b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/task/ui/AbstractExternalSystemToolWindowFactory.java
index 84165c7..1c99c17 100644
--- a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/task/ui/AbstractExternalSystemToolWindowFactory.java
+++ b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/task/ui/AbstractExternalSystemToolWindowFactory.java
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
 package com.intellij.openapi.externalSystem.service.task.ui;
 
 import com.intellij.openapi.application.ApplicationManager;
@@ -58,7 +44,7 @@
         ContentImpl tasksContent = new ContentImpl(projectsView, ExternalSystemBundle.message("tool.window.title.projects"), true);
         contentManager.removeAllContents(true);
         contentManager.addContent(tasksContent);
-      }));
+      }, project.getDisposed()));
   }
 
   @NotNull
