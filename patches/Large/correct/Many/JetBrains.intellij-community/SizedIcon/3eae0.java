diff --git a/platform/platform-api/src/com/intellij/ui/SizedIcon.java b/platform/platform-api/src/com/intellij/ui/SizedIcon.java
index b72e826..dd0b56e 100644
--- a/platform/platform-api/src/com/intellij/ui/SizedIcon.java
+++ b/platform/platform-api/src/com/intellij/ui/SizedIcon.java
@@ -1,3 +1,18 @@
+/*
+ * Copyright 2000-2016 JetBrains s.r.o.
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
 package com.intellij.ui;
 
 import javax.swing.*;
@@ -19,7 +34,7 @@
 
   public void paintIcon(Component c, Graphics g, int x, int y) {
     int dx = myWidth - myDelegate.getIconWidth();
-    int dy = myWidth - myDelegate.getIconHeight();
+    int dy = myHeight - myDelegate.getIconHeight();
     if (dx > 0 || dy > 0) {
       myDelegate.paintIcon(c, g, x + dx/2, y + dy/2);
     }
