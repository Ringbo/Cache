diff --git a/common/buildcraft/core/TriggerLiquidContainer.java b/common/buildcraft/core/TriggerLiquidContainer.java
index 0de7c42..a046c7e 100644
--- a/common/buildcraft/core/TriggerLiquidContainer.java
+++ b/common/buildcraft/core/TriggerLiquidContainer.java
@@ -86,7 +86,7 @@
 
 				if (liquids != null && liquids.length > 0) {
 					for (ILiquidTank c : liquids)
-						if (c.getLiquid().amount != 0)
+						if (c.getLiquid() != null && c.getLiquid().amount != 0)
 							return false;
 
 					return true;
@@ -94,7 +94,7 @@
 					return false;
 			case Contains:
 				for (ILiquidTank c : liquids)
-					if (c.getLiquid().amount != 0)
+					if (c.getLiquid() != null && c.getLiquid().amount != 0)
 						if (seachedLiquidId == 0 || seachedLiquidId == c.getLiquid().itemID)
 							return true;
 
@@ -102,7 +102,7 @@
 
 			case Space:
 				for (ILiquidTank c : liquids)
-					if (c.getLiquid().amount == 0)
+					if (c.getLiquid() == null || c.getLiquid().amount == 0)
 						return true;
 					else if (c.getLiquid().amount < c.getCapacity())
 						if (seachedLiquidId == 0 || seachedLiquidId == c.getLiquid().itemID)
@@ -111,7 +111,7 @@
 				return false;
 			case Full:
 				for (ILiquidTank c : liquids)
-					if (c.getLiquid().amount < c.getCapacity())
+					if (c.getLiquid() == null || c.getLiquid().amount < c.getCapacity())
 						return false;
 
 				return true;
