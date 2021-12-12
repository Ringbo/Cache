diff --git a/common/buildcraft/transport/stripes/StripesHandlerEntityInteract.java b/common/buildcraft/transport/stripes/StripesHandlerEntityInteract.java
index c0e6b68..420b4eb 100644
--- a/common/buildcraft/transport/stripes/StripesHandlerEntityInteract.java
+++ b/common/buildcraft/transport/stripes/StripesHandlerEntityInteract.java
@@ -66,7 +66,7 @@
 			successful = true;
 			dropItemsExcept(stack, player, activator, direction);
 		}
-		if (stack.stackSize > 0) {
+		if (stack.stackSize > 0 && successful) {
 			activator.sendItem(stack, direction.getOpposite());
 		}
 
