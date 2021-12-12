diff --git a/osmorc/src/org/jetbrains/osgi/bnd/run/BndRunConfigurationBase.java b/osmorc/src/org/jetbrains/osgi/bnd/run/BndRunConfigurationBase.java
index ed6ef1e..a656780 100644
--- a/osmorc/src/org/jetbrains/osgi/bnd/run/BndRunConfigurationBase.java
+++ b/osmorc/src/org/jetbrains/osgi/bnd/run/BndRunConfigurationBase.java
@@ -1,16 +1,18 @@
-// Copyright 2000-2017 JetBrains s.r.o.
-//
-// Licensed under the Apache License, Version 2.0 (the "License");
-// you may not use this file except in compliance with the License.
-// You may obtain a copy of the License at
-//
-// http://www.apache.org/licenses/LICENSE-2.0
-//
-// Unless required by applicable law or agreed to in writing, software
-// distributed under the License is distributed on an "AS IS" BASIS,
-// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-// See the License for the specific language governing permissions and
-// limitations under the License.
+/*
+ * Copyright 2000-2017 JetBrains s.r.o.
+ *
+ * Licensed under the Apache License, Version 2.0 (the "License");
+ * you may not use this file except in compliance with the License.
+ * You may obtain a copy of the License at
+ *
+ * http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ */
 package org.jetbrains.osgi.bnd.run;
 
 import com.intellij.execution.ExecutionException;
@@ -47,7 +49,7 @@
   @Override
   public Element getState() {
     Element element = new Element("state");
-    super.writeState(element);
+    super.writeExternal(element);
     return element;
   }
 
