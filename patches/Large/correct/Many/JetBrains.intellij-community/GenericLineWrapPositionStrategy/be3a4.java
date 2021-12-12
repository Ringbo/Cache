diff --git a/platform/platform-api/src/com/intellij/openapi/editor/GenericLineWrapPositionStrategy.java b/platform/platform-api/src/com/intellij/openapi/editor/GenericLineWrapPositionStrategy.java
index 925339a..7d276ac 100644
--- a/platform/platform-api/src/com/intellij/openapi/editor/GenericLineWrapPositionStrategy.java
+++ b/platform/platform-api/src/com/intellij/openapi/editor/GenericLineWrapPositionStrategy.java
@@ -127,7 +127,7 @@
       }
     }
 
-    return maxPreferredOffsetToUse;
+    return endOffset;
   }
 
   /**
