diff --git a/src/main/java/com/pahimar/ee3/command/CommandSetItemNotRecoverable.java b/src/main/java/com/pahimar/ee3/command/CommandSetItemNotRecoverable.java
index 21dd9e4..6012b95 100644
--- a/src/main/java/com/pahimar/ee3/command/CommandSetItemNotRecoverable.java
+++ b/src/main/java/com/pahimar/ee3/command/CommandSetItemNotRecoverable.java
@@ -76,7 +76,7 @@
                 }
             }
 
-            AbilityRegistryProxy.setAsRecoverable(itemStack);
+            AbilityRegistryProxy.setAsNotRecoverable(itemStack);
             func_152373_a(commandSender, this, Messages.Commands.SET_ITEM_NOT_RECOVERABLE_SUCCESS, new Object[]{commandSender.getCommandSenderName(), itemStack.func_151000_E()});
         }
     }
