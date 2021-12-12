diff --git a/common/buildcraft/builders/snapshot/BlueprintBuilder.java b/common/buildcraft/builders/snapshot/BlueprintBuilder.java
index 2e48f23..69a0046 100644
--- a/common/buildcraft/builders/snapshot/BlueprintBuilder.java
+++ b/common/buildcraft/builders/snapshot/BlueprintBuilder.java
@@ -65,7 +65,7 @@
                     )
                     .collect(Collectors.toList());
         } else {
-            return Collections.emptyList();
+            return Collections.singletonList(ItemStack.EMPTY);
         }
     }
 
