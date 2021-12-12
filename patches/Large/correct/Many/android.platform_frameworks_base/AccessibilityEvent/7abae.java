diff --git a/core/java/android/view/accessibility/AccessibilityEvent.java b/core/java/android/view/accessibility/AccessibilityEvent.java
index 9be2a67..c93b564 100644
--- a/core/java/android/view/accessibility/AccessibilityEvent.java
+++ b/core/java/android/view/accessibility/AccessibilityEvent.java
@@ -784,7 +784,7 @@
                 builder.append("\n");
             }
         } else {
-            builder.append("; recordCount: ").append(getAddedCount());
+            builder.append("; recordCount: ").append(getRecordCount());
         }
         return builder.toString();
     }
