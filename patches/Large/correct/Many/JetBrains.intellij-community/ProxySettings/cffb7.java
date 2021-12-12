diff --git a/plugins/cvs/cvs-core/src/com/intellij/cvsSupport2/config/ProxySettings.java b/plugins/cvs/cvs-core/src/com/intellij/cvsSupport2/config/ProxySettings.java
index 0cc90a1..e00c8bc 100644
--- a/plugins/cvs/cvs-core/src/com/intellij/cvsSupport2/config/ProxySettings.java
+++ b/plugins/cvs/cvs-core/src/com/intellij/cvsSupport2/config/ProxySettings.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2000-2009 JetBrains s.r.o.
+ * Copyright 2000-2011 JetBrains s.r.o.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -41,10 +41,10 @@
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;
 
-    ProxySettings that = (ProxySettings)o;
+    final ProxySettings that = (ProxySettings)o;
     if (USE_PROXY != that.USE_PROXY) return false;
     if (!USE_PROXY) {
-      return false;
+      return true;
     }
     return PROXY_PORT == that.PROXY_PORT &&
            TYPE == that.TYPE &&
