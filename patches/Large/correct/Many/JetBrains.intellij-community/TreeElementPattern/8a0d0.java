diff --git a/platform/platform-api/src/com/intellij/patterns/TreeElementPattern.java b/platform/platform-api/src/com/intellij/patterns/TreeElementPattern.java
index e80ed62..050c8c0 100644
--- a/platform/platform-api/src/com/intellij/patterns/TreeElementPattern.java
+++ b/platform/platform-api/src/com/intellij/patterns/TreeElementPattern.java
@@ -161,7 +161,7 @@
           if (pattern.getCondition().accepts(element, context)) return true;
           element = getParent(element);
         }
-        return true;
+        return false;
       }
     });
   }
