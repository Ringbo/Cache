diff --git a/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java b/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
index 6e4be4b..d73284b 100644
--- a/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
+++ b/core-common/src/main/java/org/glassfish/jersey/internal/Errors.java
@@ -1,7 +1,7 @@
 /*
  * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  *
- * Copyright (c) 2012-2015 Oracle and/or its affiliates. All rights reserved.
+ * Copyright (c) 2012-2016 Oracle and/or its affiliates. All rights reserved.
  *
  * The contents of this file are subject to the terms of either the GNU
  * General Public License Version 2 only ("GPL") or the Common Development
@@ -178,7 +178,7 @@
                         warnings.append(LocalizationMessages.WARNING_MSG(error.getMessage())).append('\n');
                         break;
                     case HINT:
-                        warnings.append(LocalizationMessages.HINT_MSG(error.getMessage())).append('\n');
+                        hints.append(LocalizationMessages.HINT_MSG(error.getMessage())).append('\n');
                         break;
                 }
             }
